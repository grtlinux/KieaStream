package org.tain.test.t02.test16;

import java.util.Arrays;

public class LoopingTestMain {

	public static void main(String[] args) {
		int[] intArr = { 1, 2, 3, 4, 5, 7, 6 };
		
		Arrays.stream(intArr)
			.filter(a -> a % 2 == 0)
			.peek(a -> System.out.println(">>> " + a)); // not display
		
		int total = Arrays.stream(intArr)
			.filter(a -> a % 2 == 0)
			.peek(System.out::println)
			.sum();
		System.out.println(">>> total: " + total);
		
		Arrays.stream(intArr)
			.filter(a -> a % 2 == 0)
			.forEach(System.out::println);
	}
}
