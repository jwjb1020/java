package chapter2;

public class Test14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char c = 'A';
		int n = c;
		System.out.println(n);
		c = (1 << 5);
		System.out.println(c);
		System.out.println(Integer.toBinaryString(n));
		int x = c;
		System.out.println(Integer.toBinaryString(x));
		System.out.println(x);
	}

}
