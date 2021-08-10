package pBook;

public class Display {
	
	public static void displayEntries() {
		
	for (int i = 0; i < Menu.phoneBook.length; i++) {
		System.out.println(Menu.phoneBook[i].getName() + ", " + Menu.phoneBook[i].getLastName() + ", " + Menu.phoneBook[i].getpNumber() + ", "
				+ Menu.phoneBook[i].getStreet() + ", " + Menu.phoneBook[i].getCity() + ", " + Menu.phoneBook[i].getState() + ", " + Menu.phoneBook[i].getZipCode() + ", ");
	}
	System.out.println();

	}
}
