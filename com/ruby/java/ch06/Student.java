package com.ruby.java.ch06;

 class Student {
	private int sid;
	private String name;
	private String dept;

	public Student() {
	}

	public Student(int sid, String name, String dept) {
		this.sid = sid;
		this.name = name;
		this.dept = dept;
	}

	public static void main(String[] args) {
		System.out.println("6장 시작");
		int n = 10;
		Student s = null;
		// s = new Student();
		s.sid = 99;
		s = new Student(201661122, "조원준", "컴퓨터");
		System.out.println("student 객체 =" + n);
		System.out.println(s.sid + s.name + s.dept);
		System.out.println("student 객체 =" + s);
	}
}
