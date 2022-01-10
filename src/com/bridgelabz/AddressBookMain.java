package com.bridgelabz;

import java.util.Scanner;

public class AddressBookMain {

	public static void main(String[] args) {
		System.out.println("Welcome to address book problem");
		AddressBook adressBookImplementation = new AddressBook();
		boolean condition = true;

		while (condition == true) {
			Scanner scanner = new Scanner(System.in);
			System.out.println("1.add" + "\n" + "2.Display" + "\n" + "3.edit");
			Scanner option = new Scanner(System.in);

			switch (option.nextInt()) {
			case 1:
				adressBookImplementation.add();
				break;
			case 2:
				adressBookImplementation.display();
				break;
			case 3:
				adressBookImplementation.edit();
				break;
			case 4:
				System.out.println("Enter the Name of the person do you wants to delete");
				String name = scanner.nextLine();
				adressBookImplementation.delete(name);
				break;
			default:
				System.out.println("Invalid Input");
			}
		}
	}
}
