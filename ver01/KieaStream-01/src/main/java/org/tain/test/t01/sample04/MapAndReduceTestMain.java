package org.tain.test.t01.sample04;

import java.util.Arrays;
import java.util.List;

import org.tain.test.t01.sample02.Student;

public class MapAndReduceTestMain {

	public static void main(String[] args) {
		List<Student> list = Arrays.asList(
			new Student("홍길동", 98)
			, new Student("신용권", 80)
			, new Student("김자바", 87)
		);
		
		double avg = list.stream()
			.mapToInt(Student :: getScore)
			.average()
			.getAsDouble();
		
		System.out.println(">>> avg: " + avg);
	}
}
