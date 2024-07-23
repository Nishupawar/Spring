package com.springcoree.lifeCycle;

public class Samosa {
  private double price;
  
@Override
public String toString() {
	return "Samosa [price=" + price + "]";
}

public double getPrice() {
	return price;
}

public void setPrice(double price) {
	System.out.println("Setting price");
	this.price = price;
}

private Samosa() {
	super();
	// TODO Auto-generated constructor stub
}
public void init()
{
	System.out.println("inside init method..");
}

public void destroy()
{
	System.out.println("inside destroy method..");
}
  
}
