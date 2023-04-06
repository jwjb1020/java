package chapter2;

public class Test3 {

	public static void main(String[] args) {
		byte age;
		short point;
		int price;
		long totalSales;
		
		age = 123;
		point = 3200;
		price = 3500000;
		totalSales = 2147483648L;
		
		System.out.println(age);
		System.out.println(point);
		System.out.println("\n\t" + price );
		System.out.println("\ntotalPrice = " + totalSales);
				
	}
}
