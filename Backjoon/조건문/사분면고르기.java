package Backjoon.조건문;

import java.util.Scanner;

public class 사분면고르기 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();

		if (a < 0 && b > 0) {
			System.out.println(2);
		} else if (a > 0 && b > 0) {
			System.out.println(1);
		} else if (a > 0 && b < 0) {
			System.out.println(4);

		} else if (a < 0 && b < 0) {
			System.out.println(3);
		}
		sc.close();
	}

}
