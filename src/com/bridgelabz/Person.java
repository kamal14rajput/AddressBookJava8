package com.bridgelabz;

import java.util.List;

public class Person {
	public String firstName;
	public String lastName;
	public String address;
	public String city;
	public String state;
	public String mobileNo;
	public String zip;

	public Person(String firstName, String lastName, String address, String city, String state, String mobileNo,
			String zip) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.city = city;
		this.state = state;
		this.mobileNo = mobileNo;
		this.zip = zip;
	}
	public Person(String name, List<Person> personList) {
		
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getPincode() {
		return zip;
	}

	public void setPincode(String zip) {
		this.zip = zip;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	@Override
	public String toString() {
		return "Person [firstName=" + firstName + ", lastName=" + lastName + ", address=" + address + ", city=" + city
				+ ", state=" + state + ", pincode=" + zip + ", mobileNo=" + mobileNo + "]" + "\n";
	}
}
