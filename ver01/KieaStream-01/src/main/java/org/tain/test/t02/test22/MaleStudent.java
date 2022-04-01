package org.tain.test.t02.test22;

import java.util.ArrayList;
import java.util.List;

import org.tain.test.t02.common.StudentInfo;

public class MaleStudent {

	private List<StudentInfo> list;
	
	public MaleStudent() {
		this.list = new ArrayList<>();
		System.out.println("[" + Thread.currentThread().getName() + "] MaleStudent()");
	}
	
	public void accumulate(StudentInfo studentInfo) {
		this.list.add(studentInfo);
		System.out.println("[" + Thread.currentThread().getName() + "] accumulate()");
	}
	
	public void combine(MaleStudent other) {
		this.list.addAll(other.getList());
		System.out.println("[" + Thread.currentThread().getName() + "] combind()");
	}
	
	public List<StudentInfo> getList() {
		return this.list;
	}
}
