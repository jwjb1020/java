package chapter7;

public class Professor extends Person {
	private String subject;

	public Professor() {
		
	}
	public Professor(String name, int age, String subject) {
		super(name, age);
		this.subject = subject;
	}
	
	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}
	
	public String toString() {
		return "person [name=" + getName() + ", age=" + getAge() + ", dept=" + subject + "]";
	}
	
}
