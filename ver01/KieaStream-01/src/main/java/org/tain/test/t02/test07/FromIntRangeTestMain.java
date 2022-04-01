package org.tain.test.t02.test07;

import java.util.stream.IntStream;

public class FromIntRangeTestMain {

	private static int sum = 0;
	
	public static void main(String[] args) {
		IntStream stream = IntStream.rangeClosed(1, 100);
		stream.forEach(a -> sum += a);
		
		System.out.println(">>> sum = " + sum);
	}
}
