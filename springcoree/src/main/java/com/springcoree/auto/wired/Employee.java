package com.springcoree.auto.wired;

public class Employee {
 private Address address;

public Address getAddress() {
	return address;
}

public void setAddress(Address address) {
	System.out.println("Setter Method");
	this.address = address;
}

private Employee() {
	super();
	// TODO Auto-generated constructor stub
}


@Override
public String toString() {
	return "Employee [address=" + address + "]";
}

private Employee(Address address) {
	super();
	this.address = address;
	System.out.println("In Constructor Method");
}
 
}
