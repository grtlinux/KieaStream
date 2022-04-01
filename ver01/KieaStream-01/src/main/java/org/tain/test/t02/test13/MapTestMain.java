package org.tain.test.t02.test13;

import java.util.Arrays;
import java.util.List;

import org.tain.test.t02.common.Student;

public class MapTestMain {

	public static void main(String[] args) {
		List<Student> list = Arrays.asList(
				new Student("홍길동", 10),
				new Student("김자바", 30),
				new Student("신용관", 20)
		);
		
		list.stream()
			.mapToInt(Student::getScore)
			.forEach(System.out::println);
	}
}
