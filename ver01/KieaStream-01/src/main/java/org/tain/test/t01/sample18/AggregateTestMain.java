package org.tain.test.t01.sample18;

import java.util.Arrays;

public class AggregateTestMain {

	public static void main(String[] args) {
		long count = Arrays.stream(new int[] {1, 2, 3, 4, 5, 6})
				.filter(a -> a % 2 == 0)
				.count();
		System.out.println(">>> count: " + count);
		
		long sum = Arrays.stream(new int[] {1, 2, 3, 4, 5, 6 })
				.filter(a -> a % 2 == 0)
				.sum();
		System.out.println(">>> sum: " + sum);
		
		Double avg = Arrays.stream(new int[] {1, 2, 3, 4, 5, 6, 7, 8 })
				.filter(a -> a % 2 == 0)
				.average()
				.getAsDouble();
		System.out.println(">>> avg: " + avg);
		
		int max = Arrays.stream(new int[] {1, 2, 3, 4, 5, 6, 7, 8 })
				.filter(a -> a % 2 == 0)
				.max()
				.getAsInt();
		System.out.println(">>> max: " + max);
		
		int min = Arrays.stream(new int[] {1, 2, 3, 4, 5, 6, 7, 8 })
				.filter(a -> a % 2 == 0)
				.min()
				.getAsInt();
		System.out.println(">>> min: " + min);
		
		int first = Arrays.stream(new int[] {1, 2, 3, 4, 5, 6, 7, 8 })
				.filter(a -> a % 3 == 0)
				.findFirst()
				.getAsInt();
		System.out.println(">>> first: " + first);
	}
}
