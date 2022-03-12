package org.tain.test.t01.sample19;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;

public class OptionalTestMain {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		
		/* has an error of NoSuchElementException
		double avg = list.stream()
				.mapToInt(Integer::intValue)
				.average()
				.getAsDouble();
		*/
		
		OptionalDouble optional = list.stream()
				.mapToInt(Integer::intValue)
				.average();
		
		if (optional.isPresent()) {
			System.out.println(">>> optional: " + optional.getAsDouble());
		} else {
			System.out.println(">>> optional: 0.0");
		}
		
		double avg2 = list.stream()
				.mapToInt(Integer::intValue)
				.average()
				.orElse(0.0);
		System.out.println(">>> avg2: " + avg2);
		
		list.stream()
			.mapToInt(Integer::intValue)
			.average()
			.ifPresent(a -> System.out.println(">>> avg3: " + a));  // not display if not present
	}
}
