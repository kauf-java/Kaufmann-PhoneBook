package com.Nick;

public class Operations {

	Contact[] storage = new Contact[0];

	public void addPerson(Contact newPerson) {
		Contact[] tempAdd = new Contact[storage.length + 1];

		for (int i = 0; i < storage.length; i++) {
			tempAdd[i] = storage[i];
		}
		tempAdd[tempAdd.length - 1] = newPerson;
		storage = tempAdd;

	}

	public Contact searchDelete(String search4) {

		for (int i = 0; i < storage.length; i++) {
			if (storage[i].getpNumber().compareToIgnoreCase(search4) == 0) {
				return storage[i];
			}
		}
		return null;
	}

	public void deletePerson(Contact oldPerson) {
		Contact[] tempDelete = new Contact[storage.length - 1];

		int count = 0;

		for (int i = 0; i < storage.length; i++) {
			if (storage[i] != oldPerson) {
				tempDelete[count] = storage[i];
				count++;
			}

		}
		storage = tempDelete;
	}

	public Contact searchUpdate(String update) {

		for (int i = 0; i < storage.length; i++) {
			if (storage[i].getpNumber().compareToIgnoreCase(update) == 0) {
				return storage[i];
			}
		}
		return null;
	}

	public void updatePerson(Contact newPerson, Contact oldInfo) {
		Contact[] tempUpdate = new Contact[storage.length - 1];
		
		for (int i = 0; i < storage.length; i++) {
			if (storage[i] == oldInfo) {
				tempUpdate[i] = newPerson;
			} else {
				tempUpdate[tempUpdate.length] = storage[i];
			}

		}
		storage = tempUpdate;
	}

	public Contact[] getContacts() {

		return storage;

	}

	public void printContacts() {
		for (int i = 0; i < storage.length; i++) {
			storage[i].getContact();
			System.out.println();
		}

	}

	public void searchFirst(String search1) {

		for (int i = 0; i < storage.length; i++) {
			if (storage[i].getName().compareToIgnoreCase(search1) == 0) {
				System.out.println("The contact you are looking for is: ");
				storage[i].getContact();
			}
		}
		System.out.println();
	}

	public void searchLast(String search2) {

		for (int i = 0; i < storage.length; i++) {
			if (storage[i].getLastName().compareToIgnoreCase(search2) == 0) {
				System.out.println("The contact you are looking for is: ");
				storage[i].getContact();
			}
		}
		System.out.println();
	}

	public void searchFull(String search3) {

		for (int i = 0; i < storage.length; i++) {
			if (storage[i].getLastName().compareToIgnoreCase(search3) == 0) {
				System.out.println("The contact you are looking for is: ");
				storage[i].getContact();
			}
		}
		System.out.println();
	}

	public void searchPhoneNumber(String search4) {

		for (int i = 0; i < storage.length; i++) {
			if (storage[i].getpNumber().compareToIgnoreCase(search4) == 0) {
				System.out.println("The contact you are looking for is: ");
				storage[i].getContact();
			}
		}
		System.out.println();
	}

	public void searchStreet(String search5) {

		for (int i = 0; i < storage.length; i++) {
			if (storage[i].getAddress().getStreet().compareToIgnoreCase(search5) == 0) {
				System.out.println("The contact you are looking for is: ");
				storage[i].getContact();
			}
		}
		System.out.println();
	}

	public void searchCity(String search6) {

		for (int i = 0; i < storage.length; i++) {
			if (storage[i].getAddress().getCity().compareToIgnoreCase(search6) == 0) {
				System.out.println("The contact you are looking for is: ");
				storage[i].getContact();
			}
		}
		System.out.println();
	}

	public void searchState(String search7) {

		for (int i = 0; i < storage.length; i++) {
			if (storage[i].getAddress().getState().compareToIgnoreCase(search7) == 0) {
				System.out.println("The contact you are looking for is: ");
				storage[i].getContact();
			}
		}
		System.out.println();
	}

	public void searchZipCode(String search8) {

		for (int i = 0; i < storage.length; i++) {
			if (storage[i].getAddress().getZipCode().compareToIgnoreCase(search8) == 0) {
				System.out.println("The contact you are looking for is: ");
				storage[i].getContact();
			}
		}
		System.out.println();
	}
}
