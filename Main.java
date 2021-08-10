package pBook;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Contact contact = new Contact("Jimmy", "K", "223", "123 fake street", "fenton", "MO", "63026");
		Contact number2 = new Contact("Nick", "ddf", "343", "123 fake street", "fenton", "MO", "63026");
		
		//number2.setName("Tom");
		//number2.setLastName("Tulip");
		
		//Main phonebook
		Contact[] phoneBook = new Contact[2];
		phoneBook[0] = number2;
		phoneBook[1] = contact;
		
//		System.out.println(phoneBook[0].getName() + phoneBook[0].getLastName());
//		System.out.println(phoneBook[1].getName().compareTo("Jimmy"));
//		
//		System.out.println(phoneBook[1].getZipCode());
//			for(int i = 0; i < phoneBook.length; i++) {
//				System.out.println(phoneBook[i].getName());
//			}
	}	
		public static Contact[] addContact(String newFirstName, String newLastName, String newpNumber, String newAddress, String newCity, String newState, String newZipCode) {
			
			Contact newContact = new Contact(newFirstName, newLastName, newpNumber, newAddress, newCity, newState, newZipCode);
			
			//MAKING A NEW ARRAY + one length
			Contact[] newPhoneBook = new Contact[Menu.phoneBook.length+1];
			
			newPhoneBook = Menu.phoneBook;
			
			for(int i = 0; i < newPhoneBook.length; i++) {
				if(newPhoneBook[i] == null) {
					newPhoneBook[i] = newContact;
				} else {
					newPhoneBook[i] = Menu.phoneBook[i];
				}
			}
	
			return newPhoneBook;
		}	
			
		
//			public static void examples() {
//		
//			for (Contact testForEach : phoneBook) {
//				System.out.println(testForEach.getName() + " " + testForEach.getLastName());
//			}
//		
//			//delete 
//			Contact[] revPhoneBook = new Contact[1];
//			
//			//actually copying over the entire object in phonebook --> revPhonebook
//			revPhoneBook[0] = phoneBook[0];
//			
//			//nulled out revPhoneBook & this one is just copying the reference from phonebook to revPhoneBook
//			revPhoneBook = phoneBook;
//			System.out.println(revPhoneBook[0].getName());
//			}
			
	}

