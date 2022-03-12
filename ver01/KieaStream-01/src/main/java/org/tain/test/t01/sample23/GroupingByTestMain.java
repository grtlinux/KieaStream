package org.tain.test.t01.sample23;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.tain.test.t01.sample22.Student;

public class GroupingByTestMain {

	public static void main(String[] args) {
		List<Student> totalList = Arrays.asList(
				new Student("홍길동", 31, Student.Sex.MALE, Student.City.Seoul),
				new Student("김나리", 21, Student.Sex.FEMALE, Student.City.Pusan),
				new Student("신용권", 42, Student.Sex.MALE, Student.City.Pusan),
				new Student("신용권", 43, Student.Sex.MALE, Student.City.Seoul),
				new Student("박수미", 27, Student.Sex.FEMALE, Student.City.Seoul)
			);
		
		Map<Student.Sex, List<Student>> mapBySex = totalList.stream()
			.collect(Collectors.groupingBy(Student::getSex));
		
		System.out.println(">>> 남학생");
		mapBySex.get(Student.Sex.MALE).stream()
			.forEach(System.out::println);
		
		System.out.println(">>> 여학생");
		mapBySex.get(Student.Sex.FEMALE).stream()
			.forEach(System.out::println);
		
		System.out.println();
		
		Map<Student.City, List<String>> mapByCity = totalList.stream()
			.collect(
				Collectors.groupingBy(
						Student::getCity,
						Collectors.mapping(Student::getName, Collectors.toList())
				)
			);
		
		System.out.println(">>> 서울");
		mapByCity.get(Student.City.Seoul).stream().forEach(s -> System.out.print(s + " "));
		System.out.println();
		
		System.out.println(">>> 부산");
		mapByCity.get(Student.City.Pusan).stream().forEach(s -> System.out.print(s + " "));
		
	}
}
