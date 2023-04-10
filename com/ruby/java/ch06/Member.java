package com.ruby.java.ch06;

public class Member {
	private String name;
	private int age;

	public Member() {
		this.name = "guest";
		age =1;
		
	}
	public Member(String name) {
		this.name = name;
		age = 0;
		
	}

	public Member(String name, int age) {
		this.name = name;
		this.age = age;
		
	}
	public void show() {
		System.out.println("name =" + name + "\n" + "age =" + age);
		
	}

	public static void main(String[] args) {
		System.out.println("main() 메서드 실행");
		Member m1 = new Member("amy");
		Member m2 = new Member("Amy");
		Member m3 = new Member("amy",3);
		m1.show();
		m2.show();
		m3.show();
		
	}
}