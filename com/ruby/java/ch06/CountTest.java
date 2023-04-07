package com.ruby.java.ch06;

static class Count {
	static int totalCount;
	public static int num;

	public void setNum(int n) {
		num = n;
	}

	public int getNum() {
		return num;
	}
}

public class CountTest {
	public static void main(String[] args) {
		int num = 0;
		Count.totalCount = 10;
		Count.num = 19;
		Count c1 = new Count();
		Count c2 = new Count();
		Count c3 = new Count();

		// c1.num++;
		c1.setNum(num);
		System.out.println("num =" + c1.getNum());
		Count.totalCount++;
//		c2.num++;
//		Count.totalCount++;
//		c3.num++;
//		Count.totalCount++;

//		System.out.println(Count.totalCount + " : " + c1.count);
//		System.out.println(Count.totalCount + " : " + c2.count);
//		System.out.println(Count.totalCount + " : " + c3.count);
	}
}