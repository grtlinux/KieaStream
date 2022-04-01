package org.tain.test.t02.test22;

import java.util.Arrays;
import java.util.List;

import org.tain.test.t02.common.StudentInfo;

public class MaleStudentTestMain {

	public static void main(String[] args) {
		List<StudentInfo> totalList = Arrays.asList(
			new StudentInfo("홍길동", 31, StudentInfo.Sex.MALE),
			new StudentInfo("김나리", 21, StudentInfo.Sex.FEMALE),
			new StudentInfo("신용권", 42, StudentInfo.Sex.MALE),
			new StudentInfo("신용권", 43, StudentInfo.Sex.MALE),
			new StudentInfo("박수미", 27, StudentInfo.Sex.FEMALE)
		);
		
		MaleStudent maleStudent = totalList.stream()
			.filter(s -> s.getSex() == StudentInfo.Sex.MALE)
			.collect(MaleStudent::new, MaleStudent::accumulate, MaleStudent::combine);
		
		maleStudent.getList().stream()
			.forEach(System.out::println);
	}
}
