package org.tain.test.t01.sample27;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayListVsLinkedListTestMain {

	public static void work(int value) {
	}
	
	public static long testParallel(List<Integer> list) {
		long start = System.nanoTime();
		list.stream().parallel().forEach(a -> work(a));
		long end = System.nanoTime();
		return end - start;
	}
	
	public static void main(String[] args) {
		List<Integer> arrayList = new ArrayList<>();
		List<Integer> linkedList = new LinkedList<>();
		
		for (int i=0; i < 1000000; i++) {
			arrayList.add(i);
			linkedList.add(i);
		}
		
		// worming up
		long timeArrayList = testParallel(arrayList);
		long timeLinkedList = testParallel(linkedList);
		
		// test
		timeArrayList = testParallel(arrayList);
		timeLinkedList = testParallel(linkedList);
		
		System.out.println(">>> timeArrayList:  " + timeArrayList);
		System.out.println(">>> timeLinkedList: " + timeLinkedList);
	}
}
