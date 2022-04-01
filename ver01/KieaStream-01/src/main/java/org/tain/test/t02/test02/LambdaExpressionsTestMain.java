package org.tain.test.t02.test02;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class LambdaExpressionsTestMain {

	public static void main(String[] args) {
		List<Student> list = Arrays.asList(
			new Student("홍길동", 98),
			new Student("신용관", 80),
			new Student("김자바", 87)
		);
		
		Stream<Student> stream = list.stream();
		stream.forEach(s -> {
			String name = s.getName();
			int score = s.getScore();
			System.out.println(">>> " + name + ", " + score);
		});
	}
}
