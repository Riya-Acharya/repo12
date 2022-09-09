package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name="Student1")

public class Student1 {
@Id
private int  id;
private String Name;
private String ColN;
 public Student1()
 {
	 super();
 }
public Student1(int id,String Name,String ColN)
{
	super();
	this.id=id;
	this.Name=Name;
	this.ColN=ColN;
	
}

@Override
public String toString() {
	return "Student1 [id=" + id + ", Name=" + Name + ", ColN=" + ColN + "]";
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return Name;
}
public void setName(String name) {
	Name = name;
}
public String getColN() {
	return ColN;
}
public void setColN(String colN) {
	ColN = colN;
}

}
