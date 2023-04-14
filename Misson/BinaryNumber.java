package Misson;

import java.util.Scanner;

class BinaryNumber {
	// 출력된 값을 거꾸로 만드는 함수 클래스
	private int i = 0;
	private int j = 0;
	private int[] arr = new int[32];

	public void Binary(int value) {
		for (int j = i; j >= 0; j--) {
		}
		System.out.print(arr[j]);

	}

	public static void main(String[] args) {
		BinaryNumber s = new BinaryNumber();
		/*
		 * String bi =""; int number = 6; while(number>0) { bi = number%2+bi; number
		 * /=2; }
		 * 
		 * System.out.println(bi);
		 */

		Scanner sc = new Scanner(System.in);
		int value = sc.nextInt();
		int remain = 0;

		int[] arr = new int[32];
		int i = 0;

		// 입력된 값을 2로 나눈 나머지의 값을 이진수의 마지막
		// value = value%2;
		// 그 나머지를 다시 2로 나눈 나머지의 이진수 마지막 두번째
		// value = value%2;
		// .... 그 나머지를 다시 2로 나누다가 2로 나누지 못할 때, 함수가 멈춤
		// 2진수를 구하는 공식 하지만 반대로
		while (value / 2 != 0) {
			// i++;

			remain = value % 2;

			// System.out.print(remain);
			value = value / 2;
			arr[i] = remain;
			i++;
		}
		arr[i] = value;
		// 2진수 반대로 된걸 똑바록 출력
//		for (int j = i; j >= 0; j--) {
//			System.out.print(arr[j]);
//
//		}
		s.Binary(value);
	}
}
