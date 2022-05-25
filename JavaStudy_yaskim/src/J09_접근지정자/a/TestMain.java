package J09_접근지정자.a;

import J09_접근지정자.b.Test2;

public class TestMain {

	public static void main(String[] args) {
		Test1 t1 = new Test1();
		t1.aaa = "안녕";

	
		Test2 t2 = new Test2();              // public > protected > default > private
		                                  // 자바도 클래스의 멤버 각각에 외부에서 접근지정자; 전근할 수 있는 범위를 지정- 
	}                                        // 기본 세팅은 defaut

}
