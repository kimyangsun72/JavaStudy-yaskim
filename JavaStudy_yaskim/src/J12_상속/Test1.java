package J12_상속;

public class Test1 extends Test{ // 상속받다
	
	public Test1() {
		super();    //부모클래스 생성/ 기본생략/ 최상위 위치,자신 생성 this
		System.out.println("T1 생성자 호출");
		System.out.println("T1 에서 확인:"+ super.toString()); // 부모주소값 실행
		
	}
	public void testPrint() {
		
	}

}
