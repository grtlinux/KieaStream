package org.tain.test.t01.sample25;

public class Student {

	public enum Sex { MALE, FEMALE }
	public enum City { Seoul, Pusan }
	
	private String name;
	private int age;
	private Sex sex;
	private City city;
	
	public Student(String name, int age, Sex sex) {
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.city = null;
	}
	
	public Student(String name, int age, Sex sex, City city) {
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.city = city;
	}
	
	public String getName() { return this.name; }
	public int getAge() { return this.age; }
	public Sex getSex() { return this.sex; }
	public City getCity() { return this.city; }
	
	public String toString() {
		return String.format("[%s,%d,%s,%s]", this.name, this.age, this.sex, this.city);
	}
}
