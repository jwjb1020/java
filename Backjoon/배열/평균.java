package Backjoon.배열;

import java.util.Scanner;

public class 평균 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int[] arr = new int[n];

		for (int i = 0; i < arr.length; i++) {
			int score = sc.nextInt();
			arr[i] = score;

		}
		double max = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}

		}
		double allSum = 0;
		double avg = 0;
		for (int i = 0; i < arr.length; i++) {
			allSum += arr[i];

		}

		avg = ((allSum / max) * 100) / n;
		System.out.println(avg);

	}

}
