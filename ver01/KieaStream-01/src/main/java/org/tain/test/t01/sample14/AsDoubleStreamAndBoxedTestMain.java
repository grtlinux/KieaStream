package org.tain.test.t01.sample14;

import java.util.Arrays;
import java.util.stream.IntStream;

public class AsDoubleStreamAndBoxedTestMain {

	public static void main(String[] args) {
		int[] intArr = { 1, 2, 3, 4, 5, 6 };
		
		IntStream intStream = Arrays.stream(intArr);
		
		intStream
			.asDoubleStream()
			.forEach(a -> System.out.println(">>> " + a));
		System.out.println();
		
		intStream = Arrays.stream(intArr);
		
		intStream
			.boxed()
			.forEach(obj -> System.out.println(">> " + obj.intValue()));
	}
}
