package 과제;

import java.util.Scanner;

public class TTTest {
	public static void main(String[] args) {
		Scanner sr = new Scanner(System.in);
		System.out.println("10~100 사이의 임의의 정수를 입력하시오");
		int num = sr.nextInt();

		int minus = 0;
		int remainder = 0;
		int gram5 = 0;

		for (int gram2 = 1; gram2 <= 10; gram2++) {
			minus = num - (2 * gram2);
			if (minus < 0) {
				break;
			}

			for (int gram3 = 1; gram3 <= 10; gram3++) {
				remainder = minus - (3 * gram3);
				if (remainder < 0) {
					break;
				} else if (remainder % 5 == 0) {
					gram5 = remainder / 5;
					if (gram5 < 1) {
						break;
					}

					System.out.print("(" + gram2 + "," + gram3 + "," + gram5 + ")");
				}

			}

		}

		sr.close();
	}
}
