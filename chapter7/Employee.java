package chapter7;

public class Employee extends Person {
	private String dept;

//	public Employee() {
//		System.out.println("생성2");
//	}
	public Employee(String name, int age, String dept) {
//		setName(name);
		// = 
		super(name, age);
//		setAge(age);
		this.dept = dept;
	}
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}
	//여기서 this는 자기 자신의 결과 갑을 씀
	//public void setDept(String aaa) {
	//dept = aaa;   this.dept = aaa;
//}도 가능
//	@Override
//	public String toString() {
//		return "person [name=" + getName() + ", age=" + getAge() + ", dept=" + dept + "]";
//	}
	

	
}
