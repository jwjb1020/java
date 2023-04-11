package chapter7;

public class LMSTest {
	public static void main(String[] args) {
		Employee e = new Employee();
		System.out.println(e);
		
		Employee e1 = new Employee("조",20,"ㅎㅎ");
				System.out.println(e1);
				e1.setDept(null);
////		Professor p = new Professor();
////		Student s = new Student();
//		
//		e.setName("jun");
//		e.setAge(10);
//		e.setDept("입학처");
//		
////		p.setName("kal");
////		p.setAge(5);
////		p.setSubject("data");
////		
////		s.setName("bin");
////		s.setAge(7);
////		s.setMajor("computer");
////		
//		System.out.println(e.toString());
////		System.out.println(p.toString());
////		System.out.println(s.toString());
	}

}
