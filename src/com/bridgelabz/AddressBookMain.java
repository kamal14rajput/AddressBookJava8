package com.bridgelabz;

import java.util.Scanner;

public class AddressBookMain {

	public static void main(String[] args) {
		System.out.println("Welcome to the Address Book Problem");
		AddressBook adressBookImplementation = new AddressBook();
		
		boolean condition = true;

		while (condition == true) {
			Scanner scanner = new Scanner(System.in);
			System.out.println(
					"1.add" + "\n" + "2.Display" + "\n" + "3.Edit" + "\n" + "4.Delete" + "\n" + "5.Add MultiplePerson"
							+ "\n" + "6.SearchByName" + "\n" + "7.SearchByState" + "\n" + "8.viewByCity" + "\n" + "9.SearchPersonInCity");
			Scanner option = new Scanner(System.in);

			switch (option.nextInt()) {
			case 1:
				adressBookImplementation.add();
				break;
			case 2:
				adressBookImplementation.display();
				break;
			case 3:
				System.out.println("Enter the firstName:");
				String firstName = scanner.nextLine();
				adressBookImplementation.edit(firstName);
				break;
			case 4:
				System.out.println("Enter the Name of the person do you wants to delete");
				String name = scanner.nextLine();
				adressBookImplementation.delete(name);
				break;
			case 5:
				adressBookImplementation.addMultiplePerson();
				break;
			case 6:
				System.out.println("Enter a Name");
				String firstName1 = scanner.nextLine();
				adressBookImplementation.searchPersonByName(firstName1);
				break;
			case 7:
				System.out.println("Enter a name");
				String state = scanner.nextLine();
				adressBookImplementation.searchPersonByState(state);
				break;
			case 8:
				System.out.println("Enter the City");
				String city = scanner.nextLine();
				adressBookImplementation.viewByCity(city);
				break;

			case 9:
				System.out.println("Enter name");
				String name1 = scanner.nextLine();
				adressBookImplementation.searchPersonInCity(name1);
				break;
			default:
				System.out.println("Invalid Entry");
			}
		}
	}
}
