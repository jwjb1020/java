package Misson;

public class Mission2 {
	public static void main(String[] args) {
		// 전체 수
		int num = 0;
		
		// 2로 나누어지는 수(짝수)
		int even = 0;
		
		// 2로 나누었을때 나머지가 1(홀수)
		int odd = 0;
		
		
		

		for (int i = 0; i <= 1000; i++) {
			num += i;
			if (i % 2 == 0) {
				even += i;

			}
			else if (i%2==1) {
				odd +=i;
			}

		}
		
		System.out.println("전체의 합 :" + num);
		System.out.println("짝수의 합 :" + even);
		System.out.println("홀수의 합 :" + odd);

	}

}
