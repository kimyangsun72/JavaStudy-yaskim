package J18_최상위클래스;

import java.util.Objects;

/*
 * Object class(최상위 클래스)
 * 어떠한 형태든지 다 받겠다
 * OBJ로 형변환하여 다운캐스팅하면 다 받을 수 있다
 * 
 * 
 */
public class Teacher { // Object는 모든 클래스에 상속되어있음.
	private String name;
	private String subject;
	public Teacher(String name, String subject) {
		super();
		this.name = name;
		this.subject = subject;
	}
		
	@Override
	public String toString() {
		return "Teacher [name=" + name + ", subject=" + subject + "]";
	}
	
	@Override
	public int hashCode() { //주소값int . 16진수로 바꿔서 반환, JNI
		return Objects.hash(name, subject); // parameter 로 주소체계를 바꾼다
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj) // 자신과 비교대상과 같으면 true
			return true;
		if (obj == null) // 다르면 false
			return false;
		if (getClass() != obj.getClass()) //intanceof와 동일한 역할
			return false;
		Teacher other = (Teacher) obj; //다운캐스팅 해라
		//                          매개변수 teacher
		return Objects.equals(name, other.name) && Objects.equals(subject, other.subject);
	}
	
	public void classInfo() {
		System.out.println();
		
	}
	
	

}
