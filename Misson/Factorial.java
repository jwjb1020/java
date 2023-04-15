package Misson;

import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		// ex) 4! = 4*3*2*1 =24
		System.out.println("숫자를 입력하세요.");
		Scanner sc = new Scanner(System.in);
		int value = sc.nextInt();
		System.out.print(value + "!=");
		int fact = 1;
		for (int i = value; i > 1; i--) {
			fact = value * fact;
			System.out.print(value + "*");
			value--;

		}
		System.out.print("1");

		System.out.println("=" + fact);
		sc.close();
	}

}
