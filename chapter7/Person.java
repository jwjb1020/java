package chapter7;

public class Person {
	private String name;
	private int age;

	public Person() {
		System.out.println("생성1");
	}

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	// 겟 네임을 하는 이유 - ()여기에 값이 없어도 나오게 할려고
	// + 다른 곳에서도 필드를 쓸 수 있게 할려고
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "person [name=" + name + ", age=" + age + "]";
	}

	

}
