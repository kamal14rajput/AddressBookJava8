package com.bridgelabz;

import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;

public class AddressBook implements IAddressBook {
	private static Map<String, Set<Person>> addressBookMap = new HashMap();
	private static Set<Person> personList = new HashSet<>();

	private String addressBookName;
	private static final Scanner scanner = new Scanner(System.in);
	
	@Override
	public void add() {
		Set<Person> personList1 = new HashSet<>();
		System.out.println("Enter the name for your AddressBook : ");
		addressBookName = scanner.next();

		// checking if addressbookmap contain the userinput addressbook.
		if (addressBookMap.containsKey(addressBookName)) {
            System.out.println(addressBookName + " is already there please choose another name. ");
            add();
        } else {
        	
			UserInputData userDetails = new UserInputData();
			personList1 = userDetails.addUserInfo();

			
			if (!(personList1.equals(personList))) {
				addressBookMap.put(addressBookName, personList1);
				System.out.println("person added successfully");

			}
		}
	}

	public void display() {
		addressBookMap.forEach((String key, Set<Person> value) -> {
			System.out.println("AddressBook Name : " + key + "\t\t" + "Person Details : " + value);
		});
	}

	

	@Override
	public void edit() {
		System.out.println("Enter the first name to edit contact.");
		String contactName = scanner.next();

		addressBookMap.entrySet().stream().map(entry -> entry.getValue().iterator()).forEachOrdered(itr -> {
			while (itr.hasNext()) {
				if (itr.next().getFirstName().equals(contactName)) {
					UserInputData userDetails = new UserInputData();
					personList = userDetails.addUserInfo();
					System.out.println("Contact edited with given first name : " + contactName);
					addressBookMap.put(addressBookName, (Set<Person>) personList);

				} else {
					System.out.println("Person with this name not found please try with another name.");
					edit();
				}
			}
		});

	}
	
	@Override
	public void delete() {
		System.out.println("Enter the first name : ");
		String userInput = scanner.next();

		addressBookMap.entrySet().stream().map(entry -> entry.getValue().iterator()).forEachOrdered(itr -> {
			while (itr.hasNext()) {
				if (itr.next().getFirstName().equals(userInput)) {
					itr.remove();
					System.out.println("Contact deleted successfully");
				}

			}
		});

	}
	
	private void sortByName() {
		addressBookMap.keySet().forEach((String name) -> {
			addressBookMap.get(name).stream().sorted(Comparator.comparing(Person::getFirstName))
					.collect(Collectors.toList()).forEach(person -> System.out.println(person.toString()));
		});

	}
	
	private void sortByCity() {

        addressBookMap.keySet().forEach((String key) -> {
            addressBookMap.get(key).stream()
                    .sorted(Comparator.comparing(Person::getCity))
                    .collect(Collectors.toList())
                    .forEach(person -> System.out.println(person.toString()));
        });

    }
}

