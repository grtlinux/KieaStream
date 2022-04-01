package org.tain.test.t02.test11;

import java.util.Arrays;
import java.util.List;

public class FilteringTestMain {

	public static void main(String[] args) {
		List<String> list = Arrays.asList(
				"홍길동", "신용관", "김자바", "신용관", "신민철"
		);
		
		list.stream()
			.distinct()
			.forEach(System.out::println);
		System.out.println();
		
		list.stream()
			.filter(n -> n.startsWith("신"))
			.forEach(System.out::println);
		System.out.println();
		
		list.stream()
			.distinct()
			.filter(n -> n.startsWith("신"))
			.forEach(System.out::println);
	}
}
