package com.springcoree;

public class College {
private String details;
private int collegeNo;
private College(String details, int collegeNo) {
	super();
	this.details = details;
	this.collegeNo = collegeNo;
}
private College() {
	super();
	// TODO Auto-generated constructor stub
}
public String getDetails() {
	return details;
}
public void setDetails(String details) {
	this.details = details;
}
public int getCollegeNo() {
	return collegeNo;
}
public void setCollegeNo(int collegeNo) {
	this.collegeNo = collegeNo;
}
@Override
public String toString() {
	return "College [details=" + details + ", collegeNo=" + collegeNo + "]";
}

}
