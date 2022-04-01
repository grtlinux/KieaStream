package org.tain.test.t02.common;

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
		return String.format("[Student:%s,%d]", this.name, this.score);
	}
}
