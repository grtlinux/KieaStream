package org.tain.test.t02.test21;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import org.tain.test.t02.common.StudentInfo;

public class ToListTestMain {

	public static void main(String[] args) {
		List<StudentInfo> totalList = Arrays.asList(
			new StudentInfo("홍길동", 31, StudentInfo.Sex.MALE),
			new StudentInfo("김나리", 21, StudentInfo.Sex.FEMALE),
			new StudentInfo("신용권", 42, StudentInfo.Sex.MALE),
			new StudentInfo("신용권", 43, StudentInfo.Sex.MALE),
			new StudentInfo("박수미", 27, StudentInfo.Sex.FEMALE)
		);
		
		List<StudentInfo> maleList = totalList.stream()
			.filter(s -> s.getSex() == StudentInfo.Sex.MALE)
			.collect(Collectors.toList());
		maleList.stream()
			.forEach(a -> System.out.println(">>> " + a));
		System.out.println();
		
		Set<StudentInfo> femaleSet = totalList.stream()
			.filter(s -> s.getSex() == StudentInfo.Sex.FEMALE)
			.collect(Collectors.toCollection(HashSet::new));
		femaleSet.stream()
			.forEach(a -> System.out.println(">>>> " + a));
	}
}
