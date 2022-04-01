package org.tain.test.t02.test23;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.tain.test.t02.common.StudentInfo;

public class GroupingByTestMain {

	public static void main(String[] args) {
		List<StudentInfo> totalList = Arrays.asList(
			new StudentInfo("홍길동", 31, StudentInfo.Sex.MALE, StudentInfo.City.Seoul),
			new StudentInfo("김나리", 21, StudentInfo.Sex.FEMALE, StudentInfo.City.Pusan),
			new StudentInfo("신용권", 42, StudentInfo.Sex.MALE, StudentInfo.City.Pusan),
			new StudentInfo("신용권", 43, StudentInfo.Sex.MALE, StudentInfo.City.Seoul),
			new StudentInfo("박수미", 27, StudentInfo.Sex.FEMALE, StudentInfo.City.Seoul)
		);
		
		Map<StudentInfo.Sex, List<StudentInfo>> mapBySex = totalList.stream()
			.collect(Collectors.groupingBy(StudentInfo::getSex));
		
		System.out.println(">>> 남학생");
		mapBySex.get(StudentInfo.Sex.MALE).stream()
			.forEach(System.out::println);
		System.out.println();
		
		System.out.println(">>> 여학생");
		mapBySex.get(StudentInfo.Sex.FEMALE).stream()
			.forEach(System.out::println);
		System.out.println();
		
		Map<StudentInfo.City,List<String>> mapByCity = totalList.stream()
			.collect(
				Collectors.groupingBy(
					StudentInfo::getCity,
					Collectors.mapping(StudentInfo::getName, Collectors.toList())
				)
			);
		
		System.out.println(">>> 서울");
		mapByCity.get(StudentInfo.City.Seoul).stream()
			.forEach(System.out::println);
		System.out.println();
		
		System.out.println(">>> 부산");
		mapByCity.get(StudentInfo.City.Pusan).stream()
			.forEach(System.out::println);
	}
}
