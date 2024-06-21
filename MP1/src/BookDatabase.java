
import java.util.ArrayList;

public class BookDatabase {
	private ArrayList<Book> books;

	
	public BookDatabase() {
		books = new ArrayList<>();
	}
	public BookDatabase(ArrayList<Book>books){
		this.books = books;
	}
	public ArrayList<Book> getBooks() {
		return books;
	}
	public void setBooks(ArrayList<Book> books) {
		this.books = books;
	}
	
	public void addBook(Book book) {
		books.add(book);
	}
	public void removeBook(Book book) {
		books.remove(book);
	}
	public ArrayList<Book>search(Author author) {
		ArrayList<Book>books = new ArrayList<>();
		for(int i = 0;i < this.books.size(); i++) {
			if(this.books.get(i).getAuthor().toString().equals(author.toString())) {
				books.add(this.books.get(i));
			}
		}
		return books;
	}
	
	public ArrayList<Book> search(int startYear,int endYear){
		ArrayList<Book>books = new ArrayList<>();
		for(int i = 0; i < this.books.size(); i++) {
			if(this.books.get(i).getYear() >= startYear && this.books.get(i).getYear() <= endYear){
				books.add(this.books.get(i));
				}
		}
		return books;
	}
	public ArrayList<Book>search(String genre){
		ArrayList<Book>books = new ArrayList<>();
		for(int i = 0; i < this.books.size(); i++) {
			if(this.books.get(i).getGenre().equals(genre)) {
				books.add(this.books.get(i));
			}
		}
		return books;
	}

	public String toString() {
		return "BookDatabase [books=" + books + "]";
	}

}
