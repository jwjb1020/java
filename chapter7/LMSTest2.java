package chapter7;

public class LMSTest2 {
	public static void main(String[] args) {
		Employee e = new Employee("조",45,"입학처");
		Professor p = new Professor("won",33,"house");
		Student s = new Student("jun",36,"build");
		
		System.out.println(e.toString());
		//toString()이 오버라이딩이 있는 지 확인할것
		System.out.println(p.toString());
		System.out.println(s.toString());
		
	}

}
