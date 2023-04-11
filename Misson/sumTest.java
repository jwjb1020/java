package Misson;

public class sumTest {
	public static void main(String[] args) {
		
		TotalSum ts = new TotalSum();
		ts.getSum(100);
		System.out.println("전체의 합 :" + ts.getNum());
		System.out.println("짝수의 합 :" + ts.getEven());
		System.out.println("홀수의 합 :" + ts.getOdd());

		ts.getSum(10);
		System.out.println("전체의 합 :" + ts.getNum());
		System.out.println("짝수의 합 :" + ts.getEven());
		System.out.println("홀수의 합 :" + ts.getOdd());

		// ts.getSum(50);
		TotalSum ts1 = new TotalSum(1000);
		System.out.println("전체의 합 :" + ts1.getNum());
		System.out.println("짝수의 합 :" + ts1.getEven());
		System.out.println("홀수의 합 :" + ts1.getOdd());
	}
}
