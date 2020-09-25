package com.git.model.vo;

import java.util.Arrays;

public class Person {

	private String name;
	private int age;
	private double height;
	private double weight;
	private String[] hobby;
	private String address;
	private String phone;
	private String email;
	private String intro;
	
	public Person() {
		// TODO Auto-generated constructor stub
	}

	public Person(String name, int age, double height, double weight, String[] hobby, String address, String phone,
			String email, String intro) {
		super();
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
		this.hobby = hobby;
		this.address = address;
		this.phone = phone;
		this.email = email;
		this.intro = intro;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public String getIntro() {
		return intro;
	}

	public void setIntro(String intro) {
		this.intro = intro;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", height=" + height + ", weight=" + weight + ", hobby="
				+ Arrays.toString(hobby) + ", address=" + address + ", phone=" + phone + ", email=" + email + ", intro="
				+ intro + "]";
	}


=======
	
	private String name;
	private int age;
	private double height;
	private double weight;
	private String[] hobby; 
	private String address;
	private String phone;
	private String email; 
	
	public Person() {
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", height=" + height + ", weight=" + weight + ", hobby="
				+ Arrays.toString(hobby) + ", address=" + address + "]";
	}
	
	

	
}
