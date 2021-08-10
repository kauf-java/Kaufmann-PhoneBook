package pBook;

import java.util.Scanner;

public class Subtract {
	
	public static void removeEntry() {
		
		System.out.println("Please input the phone number of the contact you would like to delete: ");
		Contact[] newPhoneBook = new Contact[Menu.phoneBook.length -1];
		
		Scanner input = new Scanner(System.in);
		String searchName = input.next();
		
		
		int counter = 0;
		for(int i = 0; i < Menu.phoneBook.length; i++) {
			if(Menu.phoneBook[i].getpNumber().compareTo(searchName) == 0) {
				
			}else {
				newPhoneBook[counter] = Menu.phoneBook[i];
				counter++;
				
			}
			
			
		}
		
		
	}

}
