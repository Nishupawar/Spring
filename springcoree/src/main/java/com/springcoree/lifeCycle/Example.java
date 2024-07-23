package com.springcoree.lifeCycle;

public class Example {
private String subject;

public String getSubject() {
	return subject;
}

public void setSubject(String subject) {
	this.subject = subject;
}

private Example() {
	super();
	// TODO Auto-generated constructor stub
}

@Override
public String toString() {
	return "Example [subject=" + subject + "]";
}


public void start()
{
	System.out.println("Starting Method");
}


public void end()
{
	System.out.println("ending method");
}
}
