package Misson;

import java.util.Scanner;

public class MissoinMoney1 {
	public static void main(String[] args) {
		int[] bill = { 50000, 10000, 5000, 1000 };
		int[] num = new int[4];
		int r = 0;

		Scanner sc = new Scanner(System.in);
		System.out.println("가격을 입력해주세요 :");
		int value = sc.nextInt();
		System.out.println("-".repeat(20));
		
		// int value = 123456;
		for (int i = 0; i < bill.length; i++) {

			if (i == 0) {
				num[i] = value / bill[i];
				System.out.println("5만원의 수:" + num[i]);
			} else if (i == 1) {
				num[i] = r / bill[i];
				System.out.println("1만원의 수:" + num[i]);
			} else if (i == 2) {
				num[i] = r / bill[i];
				System.out.println("5천원의 수:" + num[i]);
			} else if (i == 3) {
				num[i] = r / bill[i];
				System.out.println("1천원의 수:" + num[i]);
			}
			r = value % bill[i];//맨 나중에 넣어야함 

		}
		sc.close();
		
		System.out.println("-".repeat(20));
		System.out.println("할인된 금액 :" + r);
		System.out.println("총 지폐의 수 :" + (num[0] + num[1] +num[2]+ num[3]));
	}

}
