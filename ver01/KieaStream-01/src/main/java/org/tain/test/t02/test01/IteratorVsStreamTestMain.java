package org.tain.test.t02.test01;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class IteratorVsStreamTestMain {

	public static void main(String[] args) {
		List<String> list = null;
		list = Arrays.asList(new String[] {"홍길동", "신용권", "김자바"});
		list = Arrays.asList("홍길동", "신용권", "김자바");
		
		Iterator<String> iter = list.iterator();
		while (iter.hasNext()) {
			System.out.println(">>> iter: " + iter.next());
		}
		System.out.println();
		
		Stream<String> stream = list.stream();
		stream.forEach(name -> System.out.println(">>> stream: " + name));
	}
}
