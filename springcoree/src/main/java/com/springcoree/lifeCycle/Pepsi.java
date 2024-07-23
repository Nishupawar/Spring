package com.springcoree.lifeCycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Pepsi  implements InitializingBean, DisposableBean{
  private int price;

public int getPrice() {
	return price;
}

public void setPrice(int price) {
	this.price = price;
}

private Pepsi() {
	super();
	
}

@Override
public String toString() {
	return "Pepsi [price=" + price + "]";
}

@Override
public void afterPropertiesSet() throws Exception {
	// TODO Auto-generated method stub
	
	System.out.println("taking pepsi : init");
}

@Override
public void destroy() throws Exception {
	// TODO Auto-generated method stub
	System.out.println("going to put bottle in the shop : destroy");
}
  
}
