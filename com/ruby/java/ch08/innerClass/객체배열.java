package com.ruby.java.ch08.innerClass;

class Student {
	int sid;
	String sname;

	Student(int sid, String sname) {
		this.sid = sid;
		this.sname = sname;
	}

	void show() {
		System.out.println("sid=" + sid + ",sname=" + sname);
	}
}

public class 객체배열 {
	public static void main(String[] args) {
		int[] data = new int[10];
		Student[] sdata = new Student[10];
		data[0] = 10;
		sdata[0] = new Student(2023, "hong");
		sdata[1] = new Student(2022, "jo");
		sdata[2] = new Student(2021, "park");
		sdata[3] = new Student(2020, "si");
		sdata[4] = new Student(2019, "nam");
		for (int i = 0; i < 5; i++) {
			sdata[i].show();
		}
	}
}
