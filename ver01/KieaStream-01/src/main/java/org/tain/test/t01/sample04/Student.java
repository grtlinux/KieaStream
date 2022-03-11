package org.tain.test.t01.sample04;

public class Student {

	private String name;
	private int score;
	
	public Student(String name, int score) {
		this.name = name;
		this.score = score;
	}
	
	public String getName() { return this.name; }
	public int getScore() { return this.score; }
	
	public String toString() {
		return String.format("[%s,%d]", this.name, this.score);
	}
}
