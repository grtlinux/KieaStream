package org.tain.test.t01.sample17;

import java.util.Arrays;

public class MatchTestMain {

	public static void main(String[] args) {
		int[] intArr = { 2, 4, 6 };
		
		boolean result1 = Arrays.stream(intArr)
				.allMatch(a -> a % 2 == 0);
		System.out.println(">>> result1: " + result1);
		
		boolean result2 = Arrays.stream(intArr)
				.allMatch(a -> a % 3 == 0);
		System.out.println(">>> result2: " + result2);
		
		boolean result3 = Arrays.stream(intArr)
				.noneMatch(a -> a % 3 == 0);
		System.out.println(">>> result3: " + result3);
	}
}
