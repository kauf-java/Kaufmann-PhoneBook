package pBook;

public class Contact extends Address{
	
	private String firstName;
	private String lastName;
	private String pNumber;

	public Contact(String firstName, String lastName, String pNumber, String street, String city, String state,String zipCode) {
		super(street, city, state, zipCode);
		this.firstName = firstName;
		this.lastName = lastName;
		this.pNumber = pNumber;
	}
	public String getName() {
		
		return this.firstName;
	}
	public void setName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getpNumber() {
		return pNumber;
	}
	public void setpNumber(String pNumber) {
		this.pNumber = pNumber;
	}
	

}
