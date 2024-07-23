package com.springcoree.stereotype;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("student")
@Scope("prototype")
public class Student {
	@Value("Nishu Pawar")
private String studentName;
	@Value("Satara")
private String city;
	@Value("#{stu}")
	private List<String>add;
public String getStudentName() {
	return studentName;
}
public void setStudentName(String studentName) {
	this.studentName = studentName;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}

public List<String> getAdd() {
	return add;
}
public void setAdd(List<String> add) {
	this.add = add;
}
@Override
public String toString() {
	return "Student [studentName=" + studentName + ", city=" + city + ", add=" + add + "]";
}


}
