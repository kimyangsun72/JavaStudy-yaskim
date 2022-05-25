package J08_클래스;

public class FishBun {  // 
	String material; // 재료  변수
	String dough; 
	
	FishBun(){      // class엔 생성자가 생략되어있다. 대문자 시작
		System.out.println("생성자 호출");
	}
	
	void test() {  //매소드 - 반환자료형 업고, 소문자 시작
		
	}
	
	void showInfo() {        // 매소드
		System.out.println("재료:" + material);
		System.out.println("반죽:" + dough);
		
	}

}
