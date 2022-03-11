package org.tain.test.t01.sample10;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.List;

public class StreamPipelinesTestMain {

	public static void main(String[] args) {
		List<Member> list = Arrays.asList(
			new Member("홍길동", Member.MALE, 31),
			new Member("김나리", Member.FEMALE, 21),
			new Member("신용권", Member.MALE, 42),
			new Member("신용권", Member.MALE, 43),
			new Member("박수미", Member.FEMALE, 27)
		);
		
		Double ageAvg = list.stream()
			.filter(m -> m.getSex() == Member.MALE)
			.mapToInt(Member::getAge)
			.average()
			.getAsDouble();
		//ageAvg = (Double) 12.3456789;
		
		ageAvg = BigDecimal.valueOf(ageAvg)
			.setScale(4, RoundingMode.HALF_UP)
			.doubleValue();
		
		System.out.println(">>> ageAvg: " + ageAvg);
	}
}
