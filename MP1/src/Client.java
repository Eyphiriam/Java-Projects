import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;

public class Client {
	
	public static void main(String[] args) throws FileNotFoundException {
		FileInputStream file = new FileInputStream("Dataset.csv");
		Scanner scan  = new Scanner(file);
		String[] topics = scan.nextLine().split(",");
		Scanner s = new Scanner(System.in);
		BookDatabase newBooks = new BookDatabase();
		
		
		
		while(scan.hasNext()) {
			String[] everything = scan.nextLine().split(",");
			String firstName = everything[0];
			String lastName = everything[1];
			Author nextAuthor = new Author(firstName, lastName);
			String title = everything[2];
			int year = Integer.parseInt(everything[3]);
			String genre = everything[4];
			String publisher = everything[5];
			int rating = Integer.parseInt(everything[6]);
			double price = Double.parseDouble(everything[7].substring(1));
			Book nextBook = new Book(nextAuthor, title, year, publisher, genre, rating, price);
			newBooks.addBook(nextBook);
		}
		boolean incorrectMenu = true;
		Author userAuthor = new Author();
		System.out.println("MAJOR PROJECT 1 - Matthew Agboglo, COMP167-004\n");
		while(incorrectMenu) {
			System.out.println("Welcome to the database, how would you like to search?\n");
			
			String userInput = s.nextLine();
			
			if(userInput.equals("Author")) {
			System.out.println("What is their first name?");
			String firstName = s.next();
			System.out.println("What is their last name?");
			String lastName = s.next();
			userAuthor.setFirstName(firstName);
			userAuthor.setLastName(lastName);
			newBooks.search(userAuthor);
			ArrayList<Book> authorResults = new ArrayList<Book>(newBooks.search(userAuthor));
			for(int i = 0; i < authorResults.size(); i++ ) {
				System.out.println(authorResults.get(i).toString());
			}
			if(authorResults.size()==0) {
				System.out.println("No results found.");
			}
			}
			else if(userInput.equals("Year")) {
				System.out.println("What is the first year?");
				int startyear = s.nextInt();
				System.out.println("What is the last year?");
				int endyear = s.nextInt();
				ArrayList<Book> yearResults = new ArrayList<Book>(newBooks.search(startyear, endyear));		
			for(int i = 0; i < yearResults.size(); i++) {
				System.out.println(yearResults.get(i).toString());
			}
			if(yearResults.size()==0) {
				System.out.println("No results found.");
			}
			}
			else if(userInput.equals("Genre")) {
				System.out.println("What is the Genre?");
				String genre = s.nextLine();
				ArrayList<Book> genreResults = new ArrayList<Book>(newBooks.search(genre));
			for(int i = 0; i < genreResults.size(); i++) {
				System.out.println(genreResults.get(i).toString());
			}
			if(genreResults.size()==0) {
				System.out.println("No results found.");
			}
			}
			else{
				System.out.println("Please enter Author, Year or Genre.");
			}
			incorrectMenu = false;
		}
	}
}
