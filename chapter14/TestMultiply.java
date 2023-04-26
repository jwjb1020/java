package chapter14;
@FunctionalInterface
//람다식은 인터페이스 안에 함수 하나만 있어야 사용가능
interface Multiply{
	double getValue();
	//double print();
}

@FunctionalInterface
//람다식은 인터페이스 안에 함수 하나만 있어야 사용가능
interface Verify{
	boolean check(int n);
}

interface Verify2{
	boolean check(int n, int d);
}

public class TestMultiply {
	public static void main(String[] args) {
		Multiply m;
		m = () -> 3.14 *2;
		System.out.println("m = " + m.getValue());
		
		Verify abc =(n) -> (n%2) == 0;
		System.out.println("v = " + abc.check(10));
		
		Verify2 vf = (n,d) -> (n%d) == 0;
		System.out.println(vf.check(24, 3));
	}

}
