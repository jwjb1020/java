package chapter3;

import java.util.Scanner;

public class Test22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 12;
		int b = 2;

	
		
		
		
		System.out.println("Op[+,-,*,/]");
		System.out.println("위 기호 중 하나를 입력하세요.");
		Scanner sc = new Scanner(System.in);
		String op = sc.next();
		
		switch(op) {
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
			System.out.println("/:"+ (a / b));
			break;
		default:
			System.out.println("잘못된 연산자입니다.");
				
			
		}

	}

}
