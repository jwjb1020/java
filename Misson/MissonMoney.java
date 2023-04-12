package Misson;

import javax.print.DocFlavor.STRING;

public class MissonMoney {
	public static void main(String[] args) {
	//상품의 가격
	 double value = 123214;
	//천원,5천원,만원,5만원 필요한 수
	 int abill = (int) (value/1000);
	 int bbill = (int) (value/5000);
	 int cbill = (int) (value/10000);
	 int dbill = (int) (value/50000);
	 //가격에서 1000원 미만은 할인= 밑에 방법 활용
	 //나머지 구하는 방법 예) 1234567%1000 = 567
	 // 1234567/1000 = 1234.....<-int로 바꾸면 됨
	 
	 
	 
	 
	 
	 String a = "천원";
	 String b = "오천원";
	 String c = "만원";
	 String d = "오만원";
	 //배열의 생성
	 int[] bill = new int[4];
	
	 for (int i = 0; i < bill.length; i++) {
		 System.out.println(bill[i]);
		
	}

}

}
