package Backjoon.배열;

import java.util.Scanner;

public class 개수세기 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int [] arr = new int [n];
		for (int i = 0; i < arr.length; i++) {
			arr [i] = sc.nextInt();
		}
		
		int v = sc.nextInt();
		int ans = 0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] == v ) {
				ans++;
			}
			
		}
		System.out.println(ans);
			sc.close();

	}

}
