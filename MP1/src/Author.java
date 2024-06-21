
public class Author {
	private String firstName;
	private String lastName;
	public String name;

	public Author() {
		setFirstName("");
		setLastName("");
	}
	public Author(String firstName, String lastName) {
		this.setFirstName(firstName);
		this.setLastName(lastName);
		
		
	}
	public String toString() {
		return firstName + ", " + lastName ;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

}	


