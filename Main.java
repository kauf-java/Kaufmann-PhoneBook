package com.Nick;

import java.util.Scanner;

public class Main {

	public static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		
		Operations logic = new Operations();
		
		Contact contact1 = new Contact("Thomas", "Callahan", "419-555-9413");
		contact1.addAddress("44 Beeline Road", "Sandusky", "OH", "44870");

		Contact contact2 = new Contact("Saul", "Goodman", "505-842-5662");
		contact2.addAddress("9800 Montgomery Blvd NE", "Albuquerque", "NM", "87111");
		
		Contact contact3 = new Contact("Flash", "Gordon", "201-555-444");
		contact3.addAddress("871 Zharkov Avenue", "East Rutherford", "NJ", "07073");
		
		logic.addPerson(contact1);
		logic.addPerson(contact2);
		logic.addPerson(contact3);

		int choice = 0;
		int update = 0;

		while (choice != 13) {
			choice = getMenu();
			switch (choice) {
			case 1:
				System.out.println("Please enter your contact information to be added in the following format: ");
				System.out.println("First name, last name, phone number, street, city, state, zip");
				String addInfo = input.nextLine();
				String[] tempInfo = addInfo.split(", ");

				String firstName = tempInfo[0];
				String lastName = tempInfo[1];
				String pNumber = tempInfo[2];
				String street = tempInfo[3];
				String city = tempInfo[4];
				String state = tempInfo[5];
				String zipCode = tempInfo[6];

				Contact c1 = new Contact(firstName, lastName, pNumber);
				c1.addAddress(street, city, state, zipCode);
				
				logic.addPerson(c1);
				
				System.out.println("You have added: " + lastName + ", " + firstName + " at: " + street + ", " + city + ", " + state + " " + zipCode);
				
				System.out.println();
				//Test what's being put in
				//System.out.println(c1.getName());
				break;
				
			case 2:
				System.out.println("Please enter the phone number of the contact you would like to delete: ");
				String deleteInfo = input.nextLine();
				logic.deletePerson(logic.searchDelete(deleteInfo));
				break;
				
			case 3:
				System.out.println("Please enter the phone number of the contact you would like to update: ");
				String updateInfo = input.nextLine();
				
				System.out.println("Please enter your contact information to be updated in the following format: ");
				System.out.println("First name, last name, phone number, street, city, state, zip");
				String updateInfo2 = input.nextLine();
				String[] tempInfo2 = updateInfo2.split(", ");

				String firstName1 = tempInfo2[0];
				String lastName1 = tempInfo2[1];
				String pNumber1 = tempInfo2[2];
				String street1 = tempInfo2[3];
				String city1 = tempInfo2[4];
				String state1 = tempInfo2[5];
				String zipCode1 = tempInfo2[6];

				Contact u1 = new Contact(firstName1, lastName1, pNumber1);
				u1.addAddress(street1, city1, state1, zipCode1);
				
				logic.updatePerson(u1, logic.searchUpdate(updateInfo));
				
				System.out.println("You have updated: " + lastName1 + ", " + firstName1 + " at: " + street1 + ", " + city1 + ", " + state1 + " " + zipCode1);
				
				System.out.println();
				break;	
			
			case 4:
				logic.printContacts();
				System.out.println();
				break;
				
			case 5:
				System.out.println("Please enter the first name of the contact you wish to locate: ");
				String search1 = input.nextLine();
				logic.searchFirst(search1); 
				break;
				
			case 6:
				System.out.println("Please enter the last name of the contact you wish to locate: ");
				String search2 = input.nextLine();
				logic.searchLast(search2); 
				break;
				
			case 7:
				System.out.println("Please enter the full name of the contact you wish to locate: ");
				String search3 = input.nextLine();
				logic.searchFull(search3); 
				break;
				
			case 8:
				System.out.println("Please enter the phone number (xxx-xxx-xxxx) of the contact you wish to locate: ");
				String search4 = input.nextLine();
				logic.searchPhoneNumber(search4); 
				break;
				
			case 9:
				System.out.println("Please enter the street of the contact you wish to locate: ");
				String search5 = input.nextLine();
				logic.searchStreet(search5); 
				break;
				
			case 10:
				System.out.println("Please enter the city of the contact you wish to locate: ");
				String search6 = input.nextLine();
				logic.searchCity(search6); 
				break;
				
			case 11:
				System.out.println("Please enter the state of the contact you wish to locate: ");
				String search7 = input.nextLine();
				logic.searchState(search7); 
				break;
				
			case 12:
				System.out.println("Please enter the zip code of the contact you wish to locate: ");
				String search8 = input.nextLine();
				logic.searchZipCode(search8); 
				break;
				
			default:
				System.out.println("Please enter a valid menu number");
				break;
			
			
			}

		}
	}

	public static int getMenu() {
		Scanner menuInp = new Scanner(System.in);

		System.out.println("1. Add a new contact: ");
		System.out.println("2. Delete an existing contact: ");
		System.out.println("3. Update an existing contact: ");
		System.out.println("4. Print all contacts: ");
		System.out.println("5. Search contacts by first name: ");
		System.out.println("6. Search contacts by last name: ");
		System.out.println("7. Search contacts by full name: ");
		System.out.println("8. Search contacts by phone number: ");
		System.out.println("9. Search contacts by street: ");
		System.out.println("10. Search contacts by city: ");
		System.out.println("11. Search contacts by state: ");
		System.out.println("12. Search contacts by zip code: ");
		System.out.println("13. Exit");
		int choice = menuInp.nextInt();
		System.out.println();
		return choice;
	}

	public static int addEntryMenu() {

		Contact holdValue = new Contact();

		System.out.println("ADD NEW ENTRY");

		String newFirstName = input.next();

		System.out.println("Please enter the Last Name:");
		String newLastName = input.next();

		System.out.println("Please enter the Phone Number:");
		String newpNumber = input.next();

		System.out.println("Please enter the Street Address:");
		String newAddress = input.next();

		System.out.println("Please enter the City:");
		String newCity = input.next();

		System.out.println("Please enter the State:");
		String newState = input.next();

		System.out.println("Please enter the Zip Code:");
		String newZipCode = input.next();
		return 0;

	}

}
