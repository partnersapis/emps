package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Emp {
  @Id
  @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="empseq") 
  int empno;
  String name;
  String address;
public Emp(int empno, String name, String address) {
	super();
	this.empno = empno;
	this.name = name;
	this.address = address;
}
public Emp() {
	super();
	// TODO Auto-generated constructor stub
}
public int getempno() {
	return empno;
}
public void setempno(int empno) {
	this.empno = empno;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
  
}
