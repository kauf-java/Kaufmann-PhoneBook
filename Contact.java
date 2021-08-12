package com.Nick;

public class Contact {

	private String firstName;
	private String lastName;
	private String pNumber;
	private Address myAddress;
	
	// Add parameters for for new address and apply them here, essentially a setter
	
	public void addAddress(String street, String city, String state, String zipCode) {
		Address tempAddress = new Address(street, city, state, zipCode);
		myAddress = tempAddress;
	}
	
	public Contact() {

	}
	
	public void getContact() {
		System.out.println(lastName + ", " +  firstName + ", " +  pNumber);
		myAddress.printAddress();
	}
	
	public Contact(String firstName, String lastName, String pNumber) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.pNumber = pNumber;
	}
	


	public Address getAddress() {
		return this.myAddress;
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
