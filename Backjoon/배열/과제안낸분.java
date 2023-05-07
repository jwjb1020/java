package Backjoon.배열;

import java.util.Scanner;

public class 과제안낸분 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr1 = new int[30];
		int[] arr2 = new int[28];

		for (int i = 0; i < arr1.length; i++) {
			arr1[i] = i + 1;

		}

		for (int i = 0; i < arr2.length; i++) {
			arr2[i] = sc.nextInt();

		}

		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr2.length; j++) {
				if (arr1[i] == arr2[j]) {
					arr1[i] = 1;
					

				}

			}

		}
		
		for (int i = 0; i < arr1.length; i++) {
			if(arr1[i] != 1) {
				System.out.println(arr1[i]);
			}
			
		}
	}

}
