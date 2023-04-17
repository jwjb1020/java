package Misson;

import java.util.Scanner;

public class NumberOfCases {
	public static void main(String[] args) {
		// 2g,3g,5g 추 각각 10개
//		int n = 10;
//		int [] a = new int[n]; // 배열의 크기가 10인 배열 만들기
//		int [] b = new int[n];
//		int [] c = new int[n];
//		for (int i = 0; i < a.length; i++) {
//			// 모든 배열의 수를 2로 초기화 하기
//			a[i] = 2;
//			b[i] = 3;
//			c[i] = 5;
//			
//		}
		System.out.println("10~100 사이의 수를 입력해주세요.");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int b = num;
		int count = 0;

		for (int i = 1; i < 11; i++) {
			num = b;
			num -= 2 * i;
			int a = num;
			for (int j = 1; j < 11; j++) {
				num -= 3 * j;
				if (num <= 0) {
					break;
				} else if (num % 5 == 0) {
					int result = num / 5;
					count++;
					System.out.print("(" + i + "," + j + "," + result + ")");

				} else {
					num = a;

				}

			}

		}
		sc.close();
		System.out.print(": " + count);
		// 10~100 입력
		// 추의 합이 입력 받은 값이 되는 경우
		// 각각 1개 이상 사용
	}

}
