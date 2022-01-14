package com.bridgelabz;

import java.util.Scanner;

public class AddressBookMain {

	public static void main(String[] args) {
		System.out.println("Welcome to the Address Book Problem");
		AddressBook addressbook = new AddressBook();
		boolean isExit = false;
		while (!isExit) {
			@SuppressWarnings("resource")
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter options\n1.Add AddressBook\n2.Edit\n3.Delete\n4.display\n5.search\n6.Exit");
			int userInput = scanner.nextInt();
			switch (userInput) {
			case 1:

				addressbook.add();

				break;
			case 2:
				addressbook.edit();
				break;
			case 3:
				addressbook.delete();
				break;
			case 4:
				addressbook.display();
				break;
			case 5:
				UserInputData.search();

				break;
			case 6:
				isExit = true;
				break;
			default:
				System.out.println("Please enter valid input");
			}
		}
	}
}
