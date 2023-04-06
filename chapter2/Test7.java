package chapter2;

public class Test7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		a++;
		System.out.println(a);//11
		++a;
		System.out.println(a);//12
		
		int b = 10;
		b--;
		System.out.println(b);//9
		--b;
		System.out.println(b);//8
		
		int c = 10;
		int d = 10;
		System.out.println(++c);//11
		System.out.println(c++);
		System.out.println(d++);//10
		System.out.println(d++);
		
		int n = 10;
		System.out.println("\tn++ = " + n++);
		System.out.println("\n++n = " + ++n);
		n++;
		++n;
		System.out.println("n = "  + n);

	}

}
