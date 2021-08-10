package phoneBook;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		System.out.println("Welcome to the Phonebook! \nPlease choose which "
				+ "menu item you would like \nto access below: \n" + "============================================");
		Scanner input = new Scanner(System.in);
		String[][] phoneBook = new String[10][6];
		
		while (true) {
			System.out.println("1.) Search for an entry: \n" + "2.) Add new entry: \n"
					+ "3.) Delete a record for a given telephone #: \n"
					+ "4.) Update a record for a given telephone #: \n" + "5.) Show all records: \n"
					+ "6.) Exit this program: \n" + "============================================");

			int choice = input.nextInt();

			switch (choice) {
			case 1:
				System.out.println("Please input a value to search for: ");
				break;

			case 2:
				addContact(phoneBook);
				break;

			case 3:
				removeContact(phoneBook);
				break;

			case 4:
				System.out.println("You have chosen 4: ");
				break;

			case 5:
				showList(phoneBook);
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

	private static void addContact(String addInfo[][]) {
		Scanner add = new Scanner(System.in);
		System.out.println();
		System.out.println("Please add in the new contact info separated by a comma:"
				+ "Last Name, First Name, City, State, zip code, phone number");

		String addContact = add.nextLine();
		int j;

		for (int i = 0; i < addInfo.length; i++) {
			for (j = 0; j < addInfo.length; j++) {
				if (addInfo[i][j] == null) {
					addInfo[i][j] = addContact;
					break;
				}

			}
		}
	}

	private static void removeContact(String removeInfo[][]) {
		System.out.println("To delete the contact please enter their information: ");
		Scanner subtractInfo = new Scanner(System.in);
		String deleteContact = subtractInfo.nextLine();
		int i, j;

		for (i = 0; i < removeInfo.length; i++) {
			for (j = 0; j < removeInfo.length; j++) {
				if (removeInfo[i][j].equals(deleteContact)) {
					removeInfo[i][j] = null;
					break;
				}

			}
		}

	}

	private static void showList(String bookList[][]) {
		System.out.println("A full list of the records: ");

		for (int i = 0; i < bookList.length; i++) {
			for (int k = 0; k < bookList[i].length; k++) {
				System.out.println(bookList[i][k] + " ");
			}
			System.out.println();
			break;
		}

	}

}