package org.tain.test.t02.test12;

import java.util.Arrays;
import java.util.List;

public class FlatMapTestMain {

	public static void main(String[] args) {
		List<String> list1 = Arrays.asList("Java8 lambda", "stream mapping");
		list1.stream()
			.flatMap(data -> Arrays.stream(data.split(" ")))
			.forEach(System.out::println);
		System.out.println();
		
		List<String> list2 = Arrays.asList("10, 20, 30", "40, 50, 70");
		list2.stream()
			.flatMapToInt(data -> {
				String[] strArr = data.split(",");
				int[] intArr = new int[strArr.length];
				for (int i=0; i < strArr.length; i++) {
					intArr[i] = Integer.parseInt(strArr[i].trim());
				}
				return Arrays.stream(intArr);
			})
			.forEach(System.out::println);
	}
}
