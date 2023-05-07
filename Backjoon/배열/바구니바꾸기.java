package Backjoon.배열;

import java.util.Scanner;

public class 바구니바꾸기 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();

		int[] arr = new int[n];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;

		}

		for (int i = 0; i < m; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			for (int j = 0; j < (b - a + 1) / 2; j++) {
				int temp = arr[a - 1 + j];
				arr[a - 1 + j] = arr[b - 1 - j];
				arr[b - 1 - j] = temp;

			}

		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");

		}
	}

}
