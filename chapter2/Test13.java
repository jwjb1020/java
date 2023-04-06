package chapter2;

public class Test13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte a = 0b1011;
		byte b = 0b1101;
		int c = a ^ b;
		System.out.println(c);
		System.out.println(Integer.toBinaryString(c));
		int e = a | b;
		int f = a & b;
		System.out.println(Integer.toBinaryString(e));
		System.out.println(Integer.toBinaryString(f));
		int g = 12;
		int h = (~g) + 1;
		System.out.println(h);
		System.out.println(Integer.toBinaryString(g));
		System.out.println(Integer.toBinaryString(~g));
	}

}
