package org.tain.test.t01.sample21;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ToListTestMain {

	public static void main(String[] args) {
		List<Student> totalList = Arrays.asList(
				new Student("홍길동", 31, Student.Sex.MALE),
				new Student("김나리", 21, Student.Sex.FEMALE),
				new Student("신용권", 42, Student.Sex.MALE),
				new Student("신용권", 43, Student.Sex.MALE),
				new Student("박수미", 27, Student.Sex.FEMALE)
			);
		
		List<Student> maleList = totalList.stream()
				.filter(s -> s.getSex() == Student.Sex.MALE)
				.collect(Collectors.toList());
		maleList.stream()
			.forEach(a -> System.out.println(">>> " + a));
		System.out.println();
		
		Set<Student> femaleSet = totalList.stream()
				.filter(s -> s.getSex() == Student.Sex.FEMALE)
				.collect(Collectors.toCollection(HashSet::new));
		femaleSet.stream()
			.forEach(a -> System.out.println(">>> " + a));
	}
}
