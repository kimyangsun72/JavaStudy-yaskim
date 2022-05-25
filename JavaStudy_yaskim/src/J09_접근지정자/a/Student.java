package J09_접근지정자.a;

public class Student {
	private String name;
	private String schoolNmae;
	
	// setter
	public void setName(String name) {
		this.name = name;
		
	}
	// getter
	public String getName() { // 리턴만 하니 String을 사용함
		return name;
	}
}
