package chapter3;

import java.util.Scanner;

public class Test19 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			// int a = 12;
			// int b = 2;

			System.out.println("Op[+,-,*,/]");
			System.out.println("위 기호 중 하나를 입력하세요. (종료하려면 exit 입력)");
			String op = sc.nextLine();
			System.out.println("첫번째 숫자를 입력하세요.");
			int a = sc.nextInt();
			System.out.println("두번째 숫자를 입력하세요.");
			int b = sc.nextInt();

			if (op.equals("exit")) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}

			switch (op) {
			case "+":
				System.out.println("+:" + (a + b));
				break;
			case "-":
				System.out.println("-:" + (a - b));
				break;
			case "*":
				System.out.println("*:" + (a * b));
				break;
			case "/":
				System.out.println("/:" + (a / b));
				break;
			default:
				sc.close();
				return;
			}
		}

		sc.close();
	}
}
