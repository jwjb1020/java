package chapter14;
interface StringFunc1 {
	String modify(String s);
}
interface IntegerFunc {
	Integer Integer(String s);
}
interface MyFunc<T> {
	T modify(T t);
}
public class Test06 {
	public static void main(String[] args) {
		MyFunc<Integer> mf2 = (n) -> n*2;
		MyFunc<String> mf1 = (s) -> s.toUpperCase() + s.length();
 		
	}

}
