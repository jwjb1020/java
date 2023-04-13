package chapter8;

public  class Manager extends Employee {
	public void calcSalary() {
		System.out.println("Manager 급여 = 기본급 + 팀 성과 수당");
	}

	@Override
	public void calcBonus() {
		// TODO Auto-generated method stub
		System.out.println("Manager 보너스 = 기본급 * 12 * 6");
	}

}
