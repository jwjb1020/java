package chapter7.abstraction1;

abstract class Employee {
	String name;
	int salary;

	public void nameAndSalary(String name, int salary) {
		this.name = name;
		this.salary = salary;

		System.out.println("사원이름 :" + name);
		System.out.println("기본급여 :" + salary);
	}

	public abstract void calcSalary();

	public abstract void calcBonus();

}

class Salesman extends Employee {

	public void calcSalary() {
		int saleMoney = 500;
		System.out.println(name + "Salesman 급여 =" + (salary + saleMoney));
	}

	public void calcBonus() {
		int bonus =200;
		System.out.println("Salesman 보너스 = 기본급 * 12 * 4");
	}
}

class Consultant extends Employee {
	public void calcSalary() {
		int saleCont = 300;
		System.out.println("Consultant 급여 = 기본급 + 컨설팅 특별 수당" + saleCont);
	}

	public void calcBonus() {
		System.out.println("Consultant 보너스 = 기본급 * 12 * 12");
	}
}

abstract class Manager extends Employee {
	public void calcSalary() {
		System.out.println("Manager 급여 = 기본급 + 팀 성과 수당");
	}
}

class Director extends Manager {
	public void calcBonus() {
		System.out.println("Director 보너스 = 기본급 * 12 * 6");
	}
}

//class 안에 class가 있으면 찾을 수 없다고 뜸

public class HRSTest2 {
	public static void main(String[] args) {
		Salesman s = new Salesman();
		Consultant c = new Consultant();
//		Director d = new Director();
		s.nameAndSalary("조원준", 100);
		s.calcSalary();
	

//		c.nameAndSalary("john",200);
//		d.nameAndSalary("kevin", 300);
	}

}
