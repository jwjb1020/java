package Backjoon.배열;

import java.util.Scanner;

public class 최댓값 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [] arr = new int[9];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
			
		}
		
		int max = 0;
		for (int i = 0; i < arr.length; i++) {
			if(max < arr[i]) {
				max = arr[i];
			}
			
			
		}
		System.out.println(max);
		for (int i = 0; i < arr.length; i++) {
			if(max == arr[i]) {
				System.out.println(i+1);
				
			}
			
			
		}
		
		
	}

}
