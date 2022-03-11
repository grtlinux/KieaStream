package org.tain.test.t01.sample15;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;

public class SortingTestMain {

	public static void main(String[] args) {
		IntStream intStream = Arrays.stream(new int[] {5, 3, 2, 4, 1});
		
		intStream
			.sorted()
			.forEach(System.out::println);
		System.out.println();
		
		List<Student> list = Arrays.asList(
			new Student("홍길동", 30),
			new Student("신용관", 10),
			new Student("김자바", 20)
		);
		
		list.stream()
			.sorted()
			.forEach(System.out::println);
		System.out.println();
		
		list.stream()
			.sorted(Comparator.reverseOrder())
			.forEach(System.out::println);
	}
}
