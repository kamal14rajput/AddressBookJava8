package com.bridgelabz;

import java.util.ArrayList;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

class UserInputData {
	 private static Map<String, ArrayList<String>> addressBookSearchList = new HashMap<>();
	 
	 public Set<Person> addUserInfo() {
	        String cityName;
	        String personName;

	        Scanner scanner = new Scanner(System.in);
	        Set<Person> personList = new HashSet<>();
	        String prompt;

	        do {

	            Person person = new Person();
	            System.out.println("Enter First Name: ");
	            person.setFirstName(scanner.next());
	            System.out.println("Enter Last Name : ");
	            person.setLastName(scanner.next());
	            scanner.nextLine();
	            System.out.println("Enter the Address : ");
	            person.setAddress(scanner.nextLine());
	            System.out.println("Enter the City : ");
	            person.setCity(scanner.nextLine());
	            System.out.println("Enter the State : ");
	            person.setState(scanner.nextLine());
	            System.out.println("Enter Email : ");
	            person.setEmail(scanner.next());
	            System.out.println("Enter  ZipCode : ");
	            person.setZipcode(scanner.next());
	            scanner.nextLine();
	            System.out.println("Enter Phone Number: ");
	            person.setPhoneNumber(scanner.next());
	            personList.add(person);

	            // getting person name and person city and passedfor mapping.
	            cityName = person.getCity();
	            personName = person.getFirstName();
	            mapPersonWithCity(cityName, personName);
	            System.out.println("Would you like to continue?(yes/no)");
	            prompt = scanner.next();
	        } while (prompt.equalsIgnoreCase( //this loop ends if user does not wants to add more contacts.

	                "yes"));
	        return personList; // this lists is returned to the addAddressbook method.
	    }

	    
	    public static void mapPersonWithCity(String city, String personName) {

	        if (addressBookSearchList.containsKey(city)) {
	            ArrayList<String> person;
	            person = addressBookSearchList.get(city);
	            person.add(personName);
	            addressBookSearchList.put(city, person);
	        } else {
	            ArrayList<String> person = new ArrayList<>();
	            person.add(personName);
	            addressBookSearchList.put(city, person);
	            person = null;
	        }
	    }
			
		
	    public static  void search() {
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("Enter a city name : ");
	        String userInput = scanner.next();
	        if (addressBookSearchList.containsKey(userInput)) {
	            System.out.println("The persons list are :" + addressBookSearchList.get(userInput) + " ");
	            System.out.println("he count of person with this city are :" + addressBookSearchList.get(userInput).size());
	        } else {
	            System.out.println("city does not exists!");
	        }
	        long cityCount = addressBookSearchList.entrySet().stream()
	                .filter(p -> p.getKey().equals(userInput))
	                .count();

	    }

}
