package Backjoon.배열;

import java.util.Scanner;

public class x보다작은수 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int x = sc.nextInt();
	int [] arr = new int [n];
	for (int i = 0; i < arr.length; i++) {
		arr[i] = sc.nextInt();
		
		
	}
	
	for (int i = 0; i < arr.length; i++) {
		if(arr[i] < x) {
			System.out.print(arr[i] + " ");
			
		}
		sc.close();
		
	}
	
	
}
}
