package Backjoon.배열;


import java.util.Scanner;

public class 공바꾸기 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;

		}
		int r = 0;
		for (int i = 0; i < m; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			r = arr[a-1];
			arr[a-1] = arr[b-1];
			arr[b-1] = r;
			
		}
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] +" ");
			
		}
	
		
		

	}

}
