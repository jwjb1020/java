package Misson;

import java.util.Scanner;

public class CommonNum {
	public static void main(String[] args) {
		// 두개의 정수를 입력 받아서 최대 공약수 최소 공배수 출력
		// 두수를 입력받기
		Scanner sc1 = new Scanner(System.in);
		int a = sc1.nextInt();

		int b = sc1.nextInt();
		int remain = 0;
		int commonMax = 0;

		// 두 수 중에 어는 것이 큰지 아는 방법
		if (a > b) {
			// 유클리드 호제법으로 최대 공약수 구하기

			remain = a % b;
			// 작은 수를 방금 구한 나머지로 나눈다. (16 % 10 = 6)

			while (remain > 0) {
				// 나머지가 0이 될때까지 반복한다
				commonMax = remain;

				remain = b % remain;
				// 나머지가 0이 될 때 나눴던 수가 최대 공약수이다.
			}

			System.out.println(commonMax);
		} else {
			remain = b % a;

			// 작은 수를 방금 구한 나머지로 나눈다. (16 % 10 = 6)

			while (remain > 0) {
				// 나머지가 0이 될때까지 반복한다
				commonMax = remain;

				remain = a % remain;
				// 나머지가 0이 될 때 나눴던 수가 최대 공약수이다.

			}
			System.out.println(commonMax);
		}
	}
}

// 유클리드 호제법 두 수 중 큰 수를 작은 수로 나누어 나머지를 구한다. (106 % 16 = 10)
// int remain = 0;
// int commonMax = 0;

// remain = max % min;
// 작은 수를 방금 구한 나머지로 나눈다. (16 % 10 = 6)
// remain = min % remain;
// 나머지가 0이 될때까지 반복한다.
// while(remain == 0) {
// 나머지가 0이 될 때 나눴던 수가 최대 공약수이다.
// if(remain == 0) {
// remain = commonMax;
// }
