package com.springcoree.ci;

import java.util.List;

public class Person {
  private String name;
  private int persionId;
  private Certi certi;
  //private List<String> list;
 
private Person(String name, int persionId,Certi certi) {
	
	this.name = name;
	this.persionId = persionId;
	this.certi=certi;
	//this.list=list;
}

@Override
public String toString() {
	return this.name+" : "+this.persionId+"{ "+this.certi.name+" }";
  
}

}