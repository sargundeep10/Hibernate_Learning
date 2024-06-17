package com.hibernate;

import javax.persistence.*;


@Table(name = "students")

@Entity
public class Student {

	public Student() {
	}
	
	public Student(int uid, String name, String dept) {
		this.uid = uid;
		this.name = name;
		this.dept = dept;
	}
	
	@Id
	private int uid;
	private String name;
	private String dept;
	
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}	

}
