package org.tain.test.t01.sample22;

import java.util.Arrays;
import java.util.List;

public class MaleStudentTestMain {

	public static void main(String[] args) {
		List<Student> totalList = Arrays.asList(
				new Student("홍길동", 31, Student.Sex.MALE),
				new Student("김나리", 21, Student.Sex.FEMALE),
				new Student("신용권", 42, Student.Sex.MALE),
				new Student("신용권", 43, Student.Sex.MALE),
				new Student("박수미", 27, Student.Sex.FEMALE)
			);
		
		MaleStudent maleStudent = totalList.stream()
				.filter(s -> s.getSex() == Student.Sex.MALE)
				.collect(MaleStudent::new, MaleStudent::accumulate, MaleStudent::combine);
		
		maleStudent.getList().stream()
			.forEach(System.out::println);
	}
}
