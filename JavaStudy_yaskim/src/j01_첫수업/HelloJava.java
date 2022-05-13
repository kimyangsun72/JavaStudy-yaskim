package j01_첫수업;

public class HelloJava {
	
	public static void main(String[] args) {
		System.out.print("Hello, Java");
		System.out.println("Hello, Java");
		System.out.print(10+5);
		System.out.println();
		
		int age = 29; /* 자료형 변수명 초기화 = 선언*/
		
				
		System.out.print("이름: ");
		System.out.println("김준일");
		System.out.print("직업: ");
		System.out.println("강사");
		System.out.print("나이: ");
		System.out.println(age);
		
		age = 30;
		System.out.print("이름: ");
		System.out.println("김준일");
		System.out.print("직업: ");
		System.out.println("강사");
		System.out.print("나이: ");
		System.out.println(age);
		
/*		변수 : 말그대로 변하는 수
		자료형 + 변수명
		특수문자 $, _ 사용가능
		
		db에도 변수 존재
		db에서 변수명 앞에 _를 붙혀야한다.
		
		메모리)
		
		아스키코드(영어, 1 byte), 유니코드(한글.. 2byte, \u00000)
		논리형boolean, 문자형char, 정수형int, 실수형double
			
*/		
		age = age + 1;  /* =는 대입하라 */
		
		System.out.println(age);
		System.out.println(age);
		System.out.println(age);
		System.out.println(age);
		System.out.println(age);
		
	}

}
