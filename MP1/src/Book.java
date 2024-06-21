
public class Book {
	private Author author;
	private String title;
	private int year;
	private String publisher;
	private String genre;
	private double rating;
	private double price;
	
	public Book() {
		setAuthor(null);
		setTitle("");
		setYear(0);
		setPublisher("");
		setGenre("");
		setRating(0.0);
		setPrice(0.0);
	}
	public Book(Author author, String title, int year, String publisher, String genre, double rating, double price) {
		this.setAuthor(author);
		this.setTitle(title);
		this.setYear(year);
		this.setPublisher(publisher);
		this.setGenre(genre);
		this.setRating(rating);
		this.setPrice(price);
	}
	public String toString() {
		return author + ", " + title + ", " + year + ", " + publisher + ", " + genre + ", " + rating + ", " + price;
	}
	public Author getAuthor() {
		return author;
	}
	public void setAuthor(Author author) {
		this.author = author;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public double getRating() {
		return rating;
	}
	public void setRating(double rating) {
		this.rating = rating;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public boolean endYear() {
		// TODO Auto-generated method stub
		return false;
	}
	public int startYear() {
		// TODO Auto-generated method stub
		return 0;
	}


}
