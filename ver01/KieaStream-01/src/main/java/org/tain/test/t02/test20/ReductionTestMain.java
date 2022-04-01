package org.tain.test.t02.test20;

import java.util.Arrays;
import java.util.List;

import org.tain.test.t02.common.Student;

public class ReductionTestMain {

	public static void main(String[] args) {
		List<Student> list = Arrays.asList(
				new Student("홍길동", 98),
				new Student("신용권", 80),
				new Student("김자바", 87)
		);
		
		int sum1 = list.stream()
			.mapToInt(Student::getScore)
			.sum();
		System.out.println(">>> sum1: " + sum1);
		
		int sum2 = list.stream()
			.map(Student::getScore)
			.reduce((a,b) -> a+b)
			.get();
		System.out.println(">>> sum2: " + sum2);
		
		int sum3 = list.stream()
			.map(Student::getScore)
			.reduce(0, (a,b) -> a+b);
		System.out.println(">>> sum3: " + sum3);
	}
}
