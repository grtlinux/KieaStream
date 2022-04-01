package org.tain.test.t02.test24;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.tain.test.t02.common.StudentInfo;

public class GroupingAndReductionTestMain {

	public static void main(String[] args) {
		List<StudentInfo> totalList = Arrays.asList(
			new StudentInfo("홍길동", 31, StudentInfo.Sex.MALE),
			new StudentInfo("김나리", 21, StudentInfo.Sex.FEMALE),
			new StudentInfo("신용권", 42, StudentInfo.Sex.MALE),
			new StudentInfo("신용권", 43, StudentInfo.Sex.MALE),
			new StudentInfo("박수미", 27, StudentInfo.Sex.FEMALE)
		);
		
		Map<StudentInfo.Sex,Double> mapBySex = totalList.stream()
			.collect(
				Collectors.groupingBy(
					StudentInfo::getSex,
					Collectors.averagingDouble(StudentInfo::getAge)
				)
			);
		System.out.println(">>> male avg: " + mapBySex.get(StudentInfo.Sex.MALE));
		System.out.println(">>> female avg: " + mapBySex.get(StudentInfo.Sex.FEMALE));
		System.out.println();
		
		Map<StudentInfo.Sex, String> mapByName = totalList.stream()
			.collect(
				Collectors.groupingBy(
					StudentInfo::getSex,
					Collectors.mapping(
						StudentInfo::getName,
						Collectors.joining(",")
					)
				)
			);
		System.out.println(">>> male names: " + mapByName.get(StudentInfo.Sex.MALE));
		System.out.println(">>> female names: " + mapByName.get(StudentInfo.Sex.FEMALE));
	}
}
