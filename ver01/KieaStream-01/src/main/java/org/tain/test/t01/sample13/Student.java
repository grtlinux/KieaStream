package org.tain.test.t01.sample13;

public class Student implements Comparable<Student>{

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

	@Override
	public int compareTo(Student o) {
		return Integer.compare(this.score, o.getScore());
	}
}
