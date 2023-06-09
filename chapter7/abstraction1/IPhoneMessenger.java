package chapter7.abstraction1;

public class IPhoneMessenger extends GraphicIOS implements Messenger  {

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return "iPhone";
	}

	@Override
	public void setMessage(String msg) {
		// TODO Auto-generated method stub
		System.out.println("iPhone에서 메세지를 설정합니다 :" + msg);
	}
	
	public void clearMessage() {
		System.out.println("좌우로 흔들어 문자열을 지웁니다.");
	}
	public void draw_textBox() {
		super.draw_textBox();
		System.out.println("IPhoneMessenger : 텍스트 상자를 그린다.");
		
	}
	
	public void draw_submitButton() {
		super.draw_submitButton();
		System.out.println("IPhoneMessenger : 전송버튼을 그린다.");
	}
}
