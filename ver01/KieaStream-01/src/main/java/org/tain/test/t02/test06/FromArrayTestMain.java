package org.tain.test.t02.test06;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FromArrayTestMain {

	public static void main(String[] args) {
		String[] strArray = { "홍길동", "신용관", "김자바" };
		Stream<String> strStream = Arrays.stream(strArray);
		
		strStream.forEach(a -> System.out.println(">>> " + a));
		System.out.println();
		
		int[] intArray = { 1, 2, 3, 4, 5, 7 };
		IntStream intStream = Arrays.stream(intArray);
		intStream.forEach(a -> System.out.println(">>> " + a));
	}
}
