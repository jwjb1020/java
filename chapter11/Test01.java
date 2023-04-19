package chapter11;

public class Test01 {
	public static void main(String[] args) {

		try {
			int arr[] = new int[3];
			arr[2] = 30;
			String s = "java";
			//s = null;
			s.length();
			System.out.println(s.length());
			System.out.println("0k");

		} catch (ArrayIndexOutOfBoundsException e1) {
			System.out.println("잘못된 배열의 인덱스 사용1!" + e1.toString());
			e1.printStackTrace();
		} catch (NullPointerException e2) {
			e2.getMessage();
			System.out.println("잘못된 배열의 인덱스 사용2! " + e2.toString());
		}
		String s = "java";
		System.out.println(s.length());
		System.out.println("goooodd");
	}

}
