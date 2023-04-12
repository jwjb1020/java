package chapter7;

public interface Hahw {

	String getDept();

	void setDept(String dept);
	//여기서 this는 자기 자신의 결과 갑을 씀
	//public void setDept(String aaa) {
	//dept = aaa;   this.dept = aaa;
	//}도 가능
	//	@Override
	//	public String toString() {
	//		return "person [name=" + getName() + ", age=" + getAge() + ", dept=" + dept + "]";
	//	}

}