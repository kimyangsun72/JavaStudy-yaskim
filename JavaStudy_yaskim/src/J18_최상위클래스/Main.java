package J18_최상위클래스;

public class Main {

	public static void main(String[] args) {
		Teacher t1 = new Teacher("김양선", "웹개발");
		Teacher t2 = new Teacher("김양선", "웹개발");
		
		System.out.println(t1.toString()); // toString은 생략이 가능하다.
		System.out.println(t2);
		System.out.println(t1 == t2); //클래스는 주소를 만듬. 주소를 비교함
		
		System.out.println(t1.equals(t2)); //주소값 비교를 하니 false임. 위와 같은 비교임
		System.out.println(t1.hashCode() == t2.hashCode());//hashcode로 비교 가능
	}

}
