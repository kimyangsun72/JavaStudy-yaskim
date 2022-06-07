package j07_메소드;

/*
 * 메서드
 * 
 * 		이름() : 메서드
 * 
 * 단, 키워드()는 메서드가 아니다.
 * 
 * 			f       (x)       =        2x +1
 * 			메서드	매개변수		   리턴값
 * 			이름
 *    		f(1) 통채로를 리턴값으로 볼 줄 알아야 한다.
 *    		단, 리턴값이 있을 경우만!
 *    
 *   메서드의 선언
 *   
 *   1) 	리턴타입  메서드명(자료형 매개변수1,,,,){
 *   					실행할 문장
 * 						return 리턴값
 * 			}
 * 
 * 	2) 		void     메서드명(자료형 매개변수1,,,){
 * 						실행할 문장
 * 			}
 * 
 *  3) 		void 메서드명() {
 *  					실행할 문장
 *  
 *    		}
 *    
 *    메서드 선언 순서
 *    1. 메서드 명을 생각한다.   add
 *    2. 매개변수를 생각한다.    
 *    3. 실행할 문장과 리턴값을 생각한다.
 * 
 *    int add(int num1, int num2){
 *    	sysout("덧셈 메서드 입니다.")
 *      return num1+num2
 *    }
 *    
 *    int result = add(3, 7)
 *    sysout(result);
 *    
 *    메서드 주의사항
 *    1. 매개변수가 없는 메서드는 외부에서 값을 전달받을 수 없다
 *    2. 리턴값이 있은 메서드는 사용시 전체를 리턴값으로 보자
 *    3. 메서드 내부에 다른 ㅖ서드를 선언할 수 없다.(단, 사용은 가능하다)
 *    4. 메서드 선언시 매개변수는 저장공간이거,
 *    	사용시에는 값을 그 순서에 맞게 넣어준다.
 * 
 * 
 */
 // 클래스 안에 정의된 함수를 메소드라고 한다 -- Java에서 모든 함수는 메소드이다 예) C++ 일반 함수와 클래스에 메소드 구분됨
public class Method02 {
	
	// 매개변수가 없으면서 반환도 없는 메소드 (메소드 - class안에 있는 함수 // 함수-  통털어서 명명함)
	public static void test1() {
		System.out.println("test 메소드 실행");
		
	}
	
	// 매개변수는 있고 반환이 없는(void = return할 게 없다) 메소드
	public static void test2(int age, int year) {  // 반환은 없지만 매개변수로 반환할 수 있다
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
	 	System.out.println("종료되었습니다");
	}
	
	public static void main(String[] args) {  //시작 지점
		System.out.println("메인함수 시작");
		
		test1();                               // 그다음 test1함수를 호출
		test2(29, 1994);
	    String name = test3();                 // String 문자 호출
		
		System.out.println(name);
		
		int num = test4();
		System.out.println(num);
		
		System.out.print(test5("김양선,", 10)); // 1 -> 10으로 출력?
		
		test6();
		
		System.out.println("메인함수 끝");     // return을 쓰지 않았다	

	}

}
