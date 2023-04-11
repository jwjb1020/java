package Misson;

public class TotalSum {
	// defineNum은 한정된 수
	private int definedNum;
	// num은 수
	private int num = 0;
	// even은 2로 나누었을 때 0 (짝수)
	private int even = 0;
	// odd는 2로 나누었을 때 1 (홀수)
	private int odd = 0;

	public TotalSum() {

	}

	public void getSum(int definedNum) {
		this.definedNum = definedNum;
		num = 0;
		even = 0;
		odd = 0;
		//쓰레기값을 청소해줌

		for (int i = 0; i <= definedNum; i++) {
			num += i;
			if (i % 2 == 0) {
				even += i;

			} else if (i % 2 == 1) {
				odd += i;
			}

		}

//		System.out.println("전체의 합 :" + num);
//		System.out.println("짝수의 합 :" + even);
//		System.out.println("홀수의 합 :" + odd);
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public int getEven() {
		return even;
	}

	public void setEven(int even) {
		this.even = even;
	}

	public int getOdd() {
		return odd;
	}

	public void setOdd(int odd) {
		this.odd = odd;
	}

}
