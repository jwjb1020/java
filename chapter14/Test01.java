package chapter14;

interface MyInterface {
	public void print();
}

class MyClass1 implements MyInterface {
	@Override
	public void print() {
		System.out.println("MyClass1");
	}
}

class MyClass2 implements MyInterface {
	@Override
	public void print() {
		System.out.println("MyClass2");
	}
}

public class Test01 {
	public static void test(MyInterface mi) {
		mi.print();
	}

	public static MyInterface test2() {
		MyInterface mi = new MyInterface() {

			@Override
			public void print() {
				System.out.println("리턴객체");

			}
		};
		return mi;

	}

	public static void main(String[] args) {
		MyClass1 mc1 = new MyClass1();
		MyClass2 mc2 = new MyClass2();
		mc1.print();
		mc2.print();
		MyInterface mi = new MyInterface() {

			@Override
			public void print() {
				System.out.println("익명 클래스로 구현");

			}
		};
		mi.print();
		// MyInterface m2 = new MyInterface();

		(new MyInterface() {

			@Override
			public void print() {
				System.out.println("선언,생성,호출을 한번에 처리");

			}
		}).print();// mi(생성자 이름) 생략하고 바로 함수까지
		
		
		test(mc1);
		test(mi);
		test2().print();
		
		MyInterface m = () -> System.out.println("hello");//m은 선언이 되어있어서 안됨
		MyInterface m = test2();
		m.print(); //만약에 위에 람다식이 없으면 가능
	}
}
