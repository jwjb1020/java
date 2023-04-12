package chapter7.abstraction1;

public interface GraphicIOS1 {
	public default void draw_textBox1() {
		System.out.println("GraphicIOS : 텍스트 상자를 그린다.");
		
	}
	
	public default void draw_submitButton1() {
		System.out.println("GraphicIOS : 전송버튼을 그린다.");
	}

}
