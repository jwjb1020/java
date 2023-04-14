package com.ruby.java.ch08.innerClass;

interface Messenger {
	String getMessage();

	void setMessage(String msg);
}

/*
 * class GalaxyMessenger implements Messenger {
 * 
 * @Override public String getMessage() { // TODO Auto-generated method stub
 * return "good"; }
 * 
 * @Override public void setMessage(String msg) { // TODO Auto-generated method
 * stub System.out.println("my data =" + msg); }
 * 
 * public void chanageMode() { // TODO Auto-generated method stub
 * System.out.println("yes"); }
 * 
 * }
 */
public abstract class NonameClass {
	public static void main(String[] args) {
		//GalaxyMessenger gm = new GalaxyMessenger();
		Messenger gm = new Messenger() {

			@Override
			public String getMessage() {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public void setMessage(String msg) {
				// TODO Auto-generated method stub
				
			}
		
		
		
		
		gm.getMessage();
		gm.setMessage("jo");
		gm.chanageMode();
	}


