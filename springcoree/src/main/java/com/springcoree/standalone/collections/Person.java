package com.springcoree.standalone.collections;

import java.util.List;
import java.util.Map;
import java.util.Properties;

public class Person {
private List<String> friend;
private Map<String, Integer>feeStructure;
private Properties prop;

public Properties getProp() {
	return prop;
}

public void setProp(Properties prop) {
	this.prop = prop;
}

public Map<String, Integer> getFeeStructure() {
	return feeStructure;
}

public void setFeeStructure(Map<String, Integer> feeStructure) {
	this.feeStructure = feeStructure;
}

public List<String> getFriend() {
	return friend;
}

public void setFriend(List<String> friend) {
	this.friend = friend;
}

@Override
public String toString() {
	return "Person [friend=" + friend + ", feeStructure=" + feeStructure + ", prop=" + prop + "]";
}




}
