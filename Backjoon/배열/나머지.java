package Backjoon.배열;

//import java.util.Arrays;
import java.util.Scanner;

public class 나머지 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[10];

		for (int i = 0; i < arr.length; i++) {
			int n = sc.nextInt();
			arr[i] = n % 42;

		}
		int s = arr.length;
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if(arr[i] == arr[j]) {
					s--;
					break;
				}
				
				

			}

		}
		System.out.println(s);
		//System.out.println(Arrays.toString(arr));
	}

}
