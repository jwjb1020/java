package Misson;

import java.util.Scanner;

public class MissonMoney {
	public static void main(String[] args) {
		// 상품의 가격
		System.out.println("상품의 가격을 입력해 주세요.");
		Scanner sc = new Scanner(System.in);
		int value = sc.nextInt();
		// 천원,5천원,만원,5만원 필요한 수
		int abill = 0;
		int bbill = 0;
		int cbill = 0;
		int dbill = 0;
		int remain = 0;
		int sumBill = 0;
		// 가격에서 1000원 미만은 할인= 밑에 방법 활용
		// 나머지 구하는 방법 예) 1234567%1000 = 567
		// 1234567/1000 = 1234.....<-int로 바꾸면 됨
		abill = value / 50000;
		remain = value % 50000;

		bbill = remain / 10000;
		remain = remain % 10000;

		cbill = remain / 5000;
		remain = remain % 5000;

		dbill = remain / 1000;
		remain = remain % 1000;

		sumBill = abill + bbill + cbill + dbill;

		System.out.println("상품의 가격 :" + value + "원");
		System.out.println("총 지폐의 수 :" + sumBill);
		System.out.println("할인된 금액 :" + remain);
		System.out.println("-".repeat(20));
		System.out.println("5만원 수 :" + abill);
		System.out.println("1만원 수 :" + bbill);
		System.out.println("5천원 수 :" + cbill);
		System.out.println("1천원 수 :" + dbill);
		sc.close();
	}

}
