package chapter14;
interface StringFunc {
	String modify(String s);
}
public class Test07 {
	static String test(StringFunc sf, String str ) {
		return sf.modify(str);
	}
public static void main(String[] args) {
	String str = "korea";
	StringFunc sf1 = (s) -> {
		return s;
	};
	test(sf1,str);
	}
	
}
//지금까지의 종합 숙달훈련필요 (반복)

