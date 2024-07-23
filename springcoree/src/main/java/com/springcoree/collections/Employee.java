package com.springcoree.collections;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Employee {
private int id;
private List<String> name;
private Set<String> add;
private Map<String,String> courses;
private Properties props;
@Override
public String toString() {
	return "Employee [id=" + id + ", name=" + name + ", add=" + add + ", courses=" + courses + ", props=" + props + "]";
}
private Employee() {
	super();
	// TODO Auto-generated constructor stub
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public List<String> getName() {
	return name;
}
public void setName(List<String> name) {
	this.name = name;
}
public Set<String> getAdd() {
	return add;
}
public void setAdd(Set<String> add) {
	this.add = add;
}
public Map<String, String> getCourses() {
	return courses;
}
public void setCourses(Map<String, String> courses) {
	this.courses = courses;
}
public Properties getProps() {
	return props;
}
public void setProps(Properties props) {
	this.props = props;
}
private Employee(int id, List<String> name, Set<String> add, Map<String, String> courses, Properties props) {
	super();
	this.id = id;
	this.name = name;
	this.add = add;
	this.courses = courses;
	this.props = props;
}
}
