package Mission2;


public class Student {
	static int countStudents;// 객체수
	int sid;// 학번
	String name; // 학생 이름
	String city; // 주소 도시

	public Student() {
		this(0);
	}

	public Student(int sid) {
		this(sid, null);

	}

	public Student(int sid, String name) {
		this(sid, name, null);
	}

	public Student(int sid, String name, String city) {
		this.sid = sid;
		this.name = name;
		this.city = city;
		countStudents++;
	}
	public String toString() {
		return "sid = " + sid + ", name =" + name + ",city =" + city;
	}
	

	public void showStudent(int sid, String name, String city) {
		System.out.print("객체: ");
		this.toString();
		System.out.println(this.toString());

	}

	static void showNumberObjects() {// 생성된 객체수를 출력한다.
		System.out.println(countStudents);
	}


	public static void main(String[] args) {
		Student.countStudents = 0;
		int[] a = new int[5];
		int i = 0;
		Student arry[] = new Student[5];
		showNumberObjects();
		arry[0] = new Student();
		arry[1] = new Student(202301);
		arry[2] = new Student(1, "Jo");
		arry[3] = new Student(202303, "Won", "Busan");
		arry[4] = new Student(202304, "Na", "jeju");
		showNumberObjects();
		 for (i=0; i < arry.length ; i++) {
			 System.out.println(arry[i]);//생성된 객체 모두를 출력한다.
		 }
	}
	}
