package org.tain.test.t01.sample24;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingAndReductionTestMain {

	public static void main(String[] args) {
		List<Student> totalList = Arrays.asList(
				new Student("홍길동", 31, Student.Sex.MALE),
				new Student("김나리", 21, Student.Sex.FEMALE),
				new Student("신용권", 42, Student.Sex.MALE),
				new Student("신용권", 43, Student.Sex.MALE),
				new Student("박수미", 27, Student.Sex.FEMALE)
			);
		
		Map<Student.Sex, Double> mapBySex = totalList.stream()
			.collect(
				Collectors.groupingBy(
					Student::getSex,
					Collectors.averagingDouble(Student::getAge)
				)
			);
		System.out.println(">>> male avg: " + mapBySex.get(Student.Sex.MALE));
		System.out.println(">>> female avg: " + mapBySex.get(Student.Sex.FEMALE));
		
		Map<Student.Sex, String> mapByName = totalList.stream()
			.collect(
				Collectors.groupingBy(
					Student::getSex,
					Collectors.mapping(
						Student::getName,
						Collectors.joining(",")
					)
				)
			);
		
		System.out.println(">>> male names: " + mapByName.get(Student.Sex.MALE));
		System.out.println(">>> female names: " + mapByName.get(Student.Sex.FEMALE));
	}
}
