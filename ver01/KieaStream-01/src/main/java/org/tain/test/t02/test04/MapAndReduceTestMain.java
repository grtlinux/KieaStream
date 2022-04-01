package org.tain.test.t02.test04;

import java.util.Arrays;
import java.util.List;

import org.tain.test.t02.common.Student;

public class MapAndReduceTestMain {

	public static void main(String[] args) {
		List<Student> list = Arrays.asList(
			new Student("홍길동", 98),
			new Student("신용관", 80),
			new Student("김자바", 87)
		);
		
		double avg = list.stream()
			.mapToInt(Student::getScore)
			.average()
			.getAsDouble();
		System.out.printf(">>> avg: %.2f", avg);
	}
}
