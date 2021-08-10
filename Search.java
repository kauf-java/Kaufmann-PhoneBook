package pBook;

import java.util.Scanner;

public class Search {

	public static void searchEntries(int search) {

		switch (search) {

		// First Name
		case 1:
			System.out.println("Please enter the First Name: ");
			Scanner input1 = new Scanner(System.in);
			String first1 = input1.next();
			for (int i = 0; i < Menu.phoneBook.length; i++) {
				if (Menu.phoneBook[i].getName().compareTo(first1) == 0) {
					System.out.println(Menu.phoneBook[i]);
				}
				System.out.println();
			}

			break;

		// Last Name
		case 2:
			System.out.println("Please enter the Last Name: ");
			Scanner input2 = new Scanner(System.in);
			String last = input2.next();
			for (int i = 0; i < Menu.phoneBook.length; i++) {
				if (Menu.phoneBook[i].getLastName().compareTo(last) == 0) {
					System.out.println(Menu.phoneBook[i]);
				}
				System.out.println();
			}
			break;

		// Phone Number
		case 3:
			System.out.println("Please enter the Phone Number: ");
			Scanner input3 = new Scanner(System.in);
			String phone = input3.next();
			for (int i = 0; i < Menu.phoneBook.length; i++) {
				if (Menu.phoneBook[i].getpNumber().compareTo(phone) == 0) {
					System.out.println(Menu.phoneBook[i]);
				}
				System.out.println();
			}
			break;

		// Street Address
		case 4:
			System.out.println("Please enter the Street Address: ");
			Scanner input4 = new Scanner(System.in);
			String street = input4.next();
			for (int i = 0; i < Menu.phoneBook.length; i++) {
				if (Menu.phoneBook[i].getStreet().compareTo(street) == 0) {
					System.out.println(Menu.phoneBook[i]);
				}
				System.out.println();
			}
			break;

		// City
		case 5:
			System.out.println("Please enter the City: ");
			Scanner input5 = new Scanner(System.in);
			String city = input5.next();
			for (int i = 0; i < Menu.phoneBook.length; i++) {
				if (Menu.phoneBook[i].getCity().compareTo(city) == 0) {
					System.out.println(Menu.phoneBook[i]);
				}
				System.out.println();
			}
			break;

		// State
		case 6:
			System.out.println("Please enter the State: ");
			Scanner input6 = new Scanner(System.in);
			String state = input6.next();
			for (int i = 0; i < Menu.phoneBook.length; i++) {
				if (Menu.phoneBook[i].getState().compareTo(state) == 0) {
					System.out.println(Menu.phoneBook[i]);
				}
				System.out.println();
			}
			break;

		// Zip Code
		case 7:
			System.out.println("Please enter the Street Address: ");
			Scanner input7 = new Scanner(System.in);
			String zipCode = input7.next();
			for (int i = 0; i < Menu.phoneBook.length; i++) {
				if (Menu.phoneBook[i].getZipCode().compareTo(zipCode) == 0) {
					System.out.println(Menu.phoneBook[i]);
				}
				System.out.println();
			}
			break;

		default:
			System.out.println("Please choose an integer between 1-7 to select the corresponding action above: ");
			break;

		}
	}

}
