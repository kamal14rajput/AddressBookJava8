package com.bridgelabz;

import java.awt.List;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;
import java.util.stream.Collectors;

public class AddressBook implements IAddressBook {
	private static AddressBook addressBookImplementation;
	Scanner scanner = new Scanner(System.in);
	ArrayList<Person> personList = new ArrayList<Person>();
	
	@Override
	public void add() {
		System.out.println("Enter your first name");
		String firstName = scanner.nextLine();
		System.out.println("Enter your last name");
		String lastName = scanner.nextLine();
		System.out.println("Enter your address");
		String address = scanner.nextLine();
		System.out.println("Enter your city");
		String city = scanner.nextLine();
		System.out.println("Enter your state");
		String state = scanner.nextLine();
		System.out.println("Enter your phone");
		String mobileNo = scanner.nextLine();
		System.out.println("Enter your zip code");
		String zip = scanner.nextLine();

		Person person1 = new Person(firstName, lastName, address, city, state, mobileNo, zip);
		personList.add(person1);
		System.out.println("Contact added successfully");
	}

	public void display() {
		for (int i = 0; i < personList.size(); i++) {
			Person person = personList.get(i);
			System.out.println("FirstName:" + person.getFirstName() + "\n" + "LastName:" + person.getLastName() + "\n"
					+ "Adress:" + person.getAddress() + "\n" + "City:" + person.getCity() + "\n" + "State:"
					+ person.getCity() + "Phone-Number:" + person.getMobileNo() + "\n" + "Pin-code:"
					+ person.getPincode());
		}
	}

	

	@Override
	public void edit(String firstName) {
		for (int i = 0; i < personList.size(); i++) {
			Person person = personList.get(i);

			System.out.println("Hi " + person.getFirstName() + " please enter your  new Address");
			String address = scanner.nextLine();
			person.setAddress(address);

			System.out.println("Hi " + person.getFirstName() + " please enter your  new city");
			String city = scanner.nextLine();
			person.setCity(city);

			System.out.println("Hi " + person.getFirstName() + " please enter your  new state");
			String state = scanner.nextLine();
			person.setState(state);

			System.out.println("Hi " + person.getFirstName() + " please enter your  new Zip Code");
			String zip = scanner.nextLine();
			person.setPincode(zip);

			System.out.println("Hi " + person.getFirstName() + " please enter your  new Phone No");
			String PhoneNo = scanner.nextLine();
			person.setMobileNo(PhoneNo);

			System.out.println("Hi " + person.getFirstName() + " you have sucessfully updated");
		}

	}

	
	@Override
	public void delete(String name) {
		for (int i = 0; i < personList.size(); i++) {
			if (personList.get(i).getFirstName().equals(name)) {
				Person person = personList.get(i);
				personList.remove(person);
			}
		}
	}

	

	@Override
	public void addMultiplePerson() {
		System.out.println("Enter a person Name:");
		String firstName = scanner.nextLine();
		for (int i = 0; i < personList.size(); i++) {
			Person person = personList.get(i);

			

			if (personList.get(i).getFirstName().equals(firstName)) {
				System.out.println("Duplicate");
			}
		}
	}

	

	@Override
	public void searchPersonByName(String firstname) {
		List listPerson = (List) personList.stream()
				.filter(person1 -> person1.getFirstName().equalsIgnoreCase(firstname)).collect(Collectors.toList());
		personList.stream().forEach(System.out::println);
	}

	

	@Override
	public void searchPersonByState(String firstname) {
		List listPerson = (List) personList.stream()
				.filter(person1 -> person1.getFirstName().equalsIgnoreCase(firstname)).collect(Collectors.toList());
		personList.stream().forEach(System.out::println);
	}

	@Override
	public void viewByCity(String city) {
		Collection<Person> list;
		List people = (List) personList.stream().filter(person1 -> person1.getFirstName().equalsIgnoreCase(city))
				.collect(Collectors.toList());

		for (Person person : personList) {
			System.out.println(person);
		}
	}



	@Override
	public void searchPersonInCity(String firstName) {
		Collection<Person> list;
		List people = (List) personList.stream().filter(person1 -> person1.getFirstName().equalsIgnoreCase(firstName))
				.collect(Collectors.toList());

		for (Person person : personList) {
			System.out.println(person.getFirstName() + "---->" + person.getCity());
		}
	}
	
	@Override
	public void duplicateCheck(String firstName) {
		
		
	}

}
