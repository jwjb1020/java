package chapter10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class test111 {
	static class Employee {
		String name;
		int age;
		int height;
		int weight;
		char bloodType;
		String email;

		public Employee(String name, int age, int height, int weight, char bloodType, String email) {
			this.name = name;
			this.age = age;
			this.height = height;
			this.weight = weight;
			this.bloodType = bloodType;
			this.email = email;
		}

		public String tosString() {
			return name + "," + age + "," + height + "," + weight + "," + bloodType + "," + email;
		}
	}

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("서울");
		list.add("북경");
		list.add("상해");
		list.add("서울");
		list.add("도쿄");
		list.add("뉴욕");
		System.out.println(list.toString());
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i));
			

		}System.out.println("\n");
		list.add(0,"후쿠오카");
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i));}
		System.out.println(list.toString());
		
		Object obj[] = list.toArray();
		System.out.println("8:"+ Arrays.toString(obj));
		
		
		Object arr[] = new Object[10];
		ArrayList List2 = new ArrayList();
		
		String s = "java";
		Integer i = 123;
		arr[0] = s; arr[1] = i;
		int m = arr.length;
		s.length();
		//int len = arr[0].length();
		List2.add(s);
		List2.add(i);
		((String)List2.get(0)).length();
		

		int[] a = new int[10];
		Employee[] eset = new Employee[10];
		eset[0] = new Employee("a", 11, 13, 14, 'A', "a");
		eset[1] = new Employee("b", 12, 13, 15, 'B', "b");
		eset[2] = new Employee("ab", 14, 15, 16, 'A', "ab");
		eset[3] = new Employee("o", 34, 245, 345, 'O', "o");

	}
}
