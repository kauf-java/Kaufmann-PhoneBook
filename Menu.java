package pBook;

import java.util.Scanner;

public class Menu {

	// reference
	static Contact[] phoneBook = new Contact[2];

	public static void main(String[] args) {

		//Menu
		System.out.println("Welcome to the Phonebook! \nPlease choose which "
				+ "menu item you would like \nto access below: \n" + "============================================");
		while(true) {
		System.out.println("1.) Search for an entry: \n" + "2.) Add new entry: \n"
				+ "3.) Delete a record for a given telephone #: \n" + "4.) Update a record for a given telephone #: \n"
				+ "5.) Show all records: \n" + "6.) Exit this program: \n"
				+ "============================================");

		Scanner input = new Scanner(System.in);
		int choice = input.nextInt();

		
			switch (choice) {
			case 1:
				System.out.println("Please enter the corresponding number to Search by:\n" + "1.) First Name"
						+ "2.) Last Name" + "3.) Phone Number" + "4.) Street Address" + "5.) City" + "6.) State"
						+ "7.) Zip Code" + "=================");
				Scanner search = new Scanner(System.in);
				int newSearch= search.nextInt();
				Search.searchEntries(newSearch);
				
				break;

			case 2:
				System.out.println("ADD NEW ENTRY");
				System.out.println("Please enter the First Name:");
				Scanner inputa = new Scanner(System.in);
				String newFirstName = inputa.next();

				System.out.println("Please enter the Last Name:");
				Scanner input2 = new Scanner(System.in);
				String newLastName = input2.next();

				System.out.println("Please enter the Phone Number:");
				Scanner input3 = new Scanner(System.in);
				String newpNumber = input3.next();

				System.out.println("Please enter the Street Address:");
				Scanner input4 = new Scanner(System.in);
				String newAddress = input4.next();

				System.out.println("Please enter the City:");
				Scanner input5 = new Scanner(System.in);
				String newCity = input5.next();

				System.out.println("Please enter the State:");
				Scanner input6 = new Scanner(System.in);
				String newState = input6.next();

				System.out.println("Please enter the Zip Code:");
				Scanner input7 = new Scanner(System.in);
				String newZipCode = input.next();

				Main.addContact(newFirstName, newLastName, newpNumber, newAddress, newCity, newState, newZipCode);

				break;

			case 3:
				Subtract.removeEntry();
				break;

			case 4:
				
				break;

			case 5:
				Display.displayEntries();
				break;

			case 6:
				System.out.println("Thank you! You have ended the program");
				System.exit(0);
				break;

			default:
				System.out.println("Please choose an integer between 1-6 to select the corresponding action above: ");
				break;
		
		}
		}
	}
}
