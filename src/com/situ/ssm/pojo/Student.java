package com.situ.ssm.pojo;

import java.io.Serializable;

public class Student implements Serializable{
	private Integer id;
	private String name;
	private Integer age;
	private String gender;
	private String address;
	private Integer banji_id;
	private Banji banji;
	
	public Student() {
		
	}
	
	

	public Student(String name, Integer age, String gender, String address) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.address = address;
	}



	public Student(Integer id, String name, Integer age, String gender, String address) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.address = address;
	}

	public Student(Integer id, String name, Integer age, String gender, String address, Integer banji_id, Banji banji) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.address = address;
		this.banji_id = banji_id;
		this.banji = banji;
	}



	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}



	public Integer getBanji_id() {
		return banji_id;
	}



	public void setBanji_id(Integer banji_id) {
		this.banji_id = banji_id;
	}



	public Banji getBanji() {
		return banji;
	}



	public void setBanji(Banji banji) {
		this.banji = banji;
	}



	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + ", gender=" + gender + ", address=" + address
				+ ", banji_id=" + banji_id + ", banji=" + banji + "]";
	}





	
	


	

}
