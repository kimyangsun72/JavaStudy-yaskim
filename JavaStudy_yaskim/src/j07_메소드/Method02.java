package j07_메소드;
 // 클래스 안에 정의된 함수를 메소드라고 한다 -- Java에서 모든 함수는 메소드이다 예) C++ 일반 함수와 클래스에 메소드 구분됨
public class Method02 {
	
	// 매개변수가 없으면서 반환도 없는 메소드 (메소드 - class안에 있는 함수 // 함수-  통털어서 명명함)
	public static void test1() {
		System.out.println("test 메소드 실행");
		
	}
	
	// 매개변수는 있고 반환이 없는(void = return할 게 없다) 메소드
	
	public static void test2(int age, int year) {
		System.out.println("나이:"+age);      // 메소드 값에 연결해주는 매개변수 역할을 한다
		System.out.println("출생년도:"+ year);
	}
	
	//매개변수가 없고 반환(return, String(class)으로 반환 = 문자열만 return)이 있는 메소드
	public static String test3() {
		return "김양선";
		
	}
	public static int test4() {   // int 일반자료형도 반환
		return 1000;
	}

	// 매개변수도 있고, 반환도 있는 메소드
	public static String test5(String name, int num) {
		return name + num;
		
		
	}
	
	// 리턴자료형이 void일때 메소드를 강제로 탈출하는 방법
	public static void test6() {
		for(int i = 0; i < 10; i++) {
			System.out.println(i);
			if(i==6) {
				System.out.println("메소드 탈출");
				return;  //메소드 탈출, 어느 위치에서나 가능.. break는 반복문 스톱함
		//		break;
			}
		}
	//	System.out.println("종료되었습니다");
	}
	
	
	
	
	public static void main(String[] args) {  //시작 지점
		System.out.println("메인함수 시작");
		test1();                               // 그다음 test1함수를 호출
		test2(29, 1994);
		String name = test3();
		System.out.println(name);
		System.out.println(test5("김양선", 1));
		test6();
		System.out.println("메인함수 끝");     // return을 쓰지 않았다
		

		

	}

}
