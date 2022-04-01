package org.tain.test.t02.test03;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ParallelTestMain {

	public static void main(String[] args) {
		List<String> list = Arrays.asList(
				"홍길동", "신용권", "김자바", "람다식", "박병렬"
			);
		
		Stream<String> stream = list.stream();
		stream.forEach(ParallelTestMain::print);
		System.out.println();
		
		Stream<String> parallelStream = list.parallelStream();
		parallelStream.forEach(ParallelTestMain::print);
	}
	
	private static void print(String str) {
		System.out.println(str + ": " + Thread.currentThread().getName());
	}
}
