package chapter7;

public class Student extends Person {
	private String major;

	public Student() {
		
	}
	public Student(String name, int age, String major) {
		super(name, age);
		this.major = major;
		}
	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}
	
//	public String toString() {
//		return "person [name=" + name + ", age=" + age + "]";
//	}
	//여기서 name과 age가 오류가 되는 이유는 - person 클래스의 필드가 private라서
	//그래서 get 메소드를 통해 public으로 만들어 씀
	public String toString() {
		return "person [name=" + getName() + ", age=" + getAge() + ", dept=" + major + "]";
	}
	

}
