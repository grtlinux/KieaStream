package org.tain.test.t02.common;

public class StudentInfo {

	public enum Sex { MALE, FEMALE }
	public enum City { Seoul, Pusan }
	
	private String name;
	private int age;
	private Sex sex;
	private City city;
	
	public StudentInfo(String name, int age, Sex sex) {
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.city = null;
	}
	
	public StudentInfo(String name, int age, Sex sex, City city) {
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
