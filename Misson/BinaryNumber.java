package Misson;

import java.util.Scanner;

public class BinaryNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int value = sc.nextInt();
		int remain = 0;
		// 입력된 값을 2로 나눈 나머지의 값을 이진수의 마지막
		// value = value%2;
		// 그 나머지를 다시 2로 나눈 나머지의 이진수 마지막 두번째
		// value = value%2;
		// .... 그 나머지를 다시 2로 나누다가 2로 나누지 못할 때, 함수가 멈춤
		while (value / 2 != 0) {
			remain = value % 2;
			System.out.print(remain);
			value = value / 2;
			

		}
		System.out.print(value);
	}

}
