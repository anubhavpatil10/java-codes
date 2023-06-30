package com.app.core;

import java.io.Serializable;
import java.time.LocalDate;


public class Student implements Serializable {
private int rollno;
private String fname;
private String lname;
private String email;
private String address;
private LocalDate dob;
private Qualification q1;
private Course c1;
private double fees;
private boolean docSubmit;

public Student() {
	// TODO Auto-generated constructor stub
}




//public Student(int rollno, String fname, String lname, String email, String address, LocalDate dob, Qualification q1,
//		Course c1, double fees, boolean docSubmit) {
//	super();
//	this.rollno = rollno;
//	this.fname = fname;
//	this.lname = lname;
//	this.email = email;
//	this.address = address;
//	this.dob = dob;
//	this.q1 = q1;
//	this.c1 = c1;
//	this.fees = fees;
//	this.docSubmit = docSubmit;
//}




public Student(int rollNo2, String fname2, String lname2, String email2, String address2, LocalDate d, Qualification q12,
		Course c12, double fees2, boolean docSubmit2) {
	// TODO Auto-generated constructor stub

	this.rollno = rollNo2;
	this.fname = fname2;
	this.lname = lname2;
	this.email = email2;
	this.address = address2;
	this.dob = d;
	this.q1 = q12;
	this.c1 = c12;
	this.fees = fees2;
	this.docSubmit = docSubmit2;

}





public int getRollno() {
	return rollno;
}
public void setRollno(int rollno) {
	this.rollno = rollno;
}
public String getFname() {
	return fname;
}
public void setFname(String fname) {
	this.fname = fname;
}
public String getLname() {
	return lname;
}
public void setLname(String lname) {
	this.lname = lname;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public LocalDate getDob() {
	return dob;
}
public void setDob(LocalDate dob) {
	this.dob = dob;
}
public Qualification getQ1() {
	return q1;
}
public void setQ1(Qualification q1) {
	this.q1 = q1;
}
public Course getC1() {
	return c1;
}
public void setC1(Course c1) {
	this.c1 = c1;
}
public double getFees() {
	return fees;
}
public void setFees(double fees) {
	this.fees = fees;
}
public boolean isDocSubmit() {
	return docSubmit;
}
public void setDocSubmit(boolean docSubmit) {
	this.docSubmit = docSubmit;
}

@Override
public String toString() {
	return "Student [rollno=" + rollno + ", fname=" + fname + ", lname=" + lname + ", email=" + email + ", address="
			+ address + ", dob=" + dob + ", q1=" + q1 + ", c1=" + c1 + ", fees=" + fees + ", docSubmit=" + docSubmit
			+ "]";
}


}
