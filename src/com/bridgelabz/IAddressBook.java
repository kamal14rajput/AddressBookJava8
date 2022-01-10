package com.bridgelabz;

public interface IAddressBook {
	void add();

	void display();

	void edit();

	void delete(String firstName);
	
	void addMultiplePerson();
	
	void duplicateCheck(String firstName);
}
