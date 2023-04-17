package com.ruby.java.ch09;

public class Test01 {
	class MyObject {
		int num;

		public MyObject() {
		}

		public MyObject(int num) {
			this.num = num;
		}

		public String toString() {
			return "MyObject";
		}
	}

	public static void main(String[] args) {
		Test01 t = new Test01();
		MyObject mo = t.new MyObject();
		System.out.println(mo);

		Object obj1 = new Object();
		Object obj2 = new Object();
		Object obj3 = new Object();

		System.out.println(obj1);// 프린트 다음에 string 값이 나와야해서 자동으로 컴파일해줌
		System.out.println(obj1.toString());
		System.out.println(obj1.hashCode());
	}

}
