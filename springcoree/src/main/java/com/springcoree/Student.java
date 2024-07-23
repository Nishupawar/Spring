package com.springcoree;

public class Student {
private int studentId;
private String studentName;
private long studentMobileNo;
private Student(int studentId, String studentName, long studentMobileNo) {
	super();
	this.studentId = studentId;
	this.studentName = studentName;
	this.studentMobileNo = studentMobileNo;
}
public int getStudentId() {
	return studentId;
}
public void setStudentId(int studentId) {
	this.studentId = studentId;
}
public String getStudentName() {
	return studentName;
}
public void setStudentName(String studentName) {
	this.studentName = studentName;
}
public long getStudentMobileNo() {
	return studentMobileNo;
}
public void setStudentMobileNo(long studentMobileNo) {
	this.studentMobileNo = studentMobileNo;
}
private Student() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentMobileNo=" + studentMobileNo
			+ "]";
}

}
