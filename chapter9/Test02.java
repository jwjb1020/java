package chapter9;

public class Test02 {
	public static void main(String[] args) {
		String s1 = new String("java");
		String s2 = "java";
		
		String s3 = new String("java");
		String s4 = "java";
		
		
		
		if (s1==s2) {
			System.out.println("동일 객체");
				
		} else {
			System.out.println("다른 객체");
			
		}
		if (s3==s4) {
			System.out.println("동일 객체");
				
		} else {
			System.out.println("다른 객체");
			
		}
		if (s1==s3) {
			System.out.println("동일 객체");
				
		} else {
			System.out.println("다른 객체");
			
		}
		
		if (s2==s4) {
			System.out.println("동일 객체");
				
		} else {
			System.out.println("다른 객체");
		}
	}
}
