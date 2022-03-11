package org.tain.test.t01.sample10;

public class Member {

	public static int MALE = 0;
	public static int FEMALE = 1;
	
	private String name;
	private int sex;
	private int age;
	
	public Member(String name, int sex, int age) {
		this.name = name;
		this.sex = sex;
		this.age = age;
	}
	
	public String getName() { return this.name; }
	public int getSex() { return this.sex; }
	public int getAge() { return this.age; }
	
	public String toString() {
		return String.format("[%s,%d,%e]", this.name, this.sex, this.age);
	}
}
