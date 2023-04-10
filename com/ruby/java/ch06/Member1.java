package com.ruby.java.ch06;

import java.util.jar.Attributes.Name;

public class Member1 {
	private String name;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
		
	}
	public static void main(String[] args) {
		Member1 exam = new Member1();
		exam.setName("amy");
		
		System.out.println(exam.getName());
	}
}
