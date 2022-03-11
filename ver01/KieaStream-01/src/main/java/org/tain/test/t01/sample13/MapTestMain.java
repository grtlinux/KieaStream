package org.tain.test.t01.sample13;

import java.util.Arrays;
import java.util.List;

public class MapTestMain {

	public static void main(String[] args) {
		List<Student> list = Arrays.asList(
			new Student("홍길동", 10),
			new Student("신용관", 20),
			new Student("김자바", 30)
		);
		
		list.stream()
			.mapToInt(Student::getScore)
			.forEach(System.out::println);
	}
}
