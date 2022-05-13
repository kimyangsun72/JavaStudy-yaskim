package j02_변수와_상수;

public class MyInfo_Java {

	public static void main(String[] args) {
		// 주석
		/*
		 * 메모, 필기
		 * 
		 * 1. 문제
		 * name1, name2, name3
		 * age(나이)
		 * phone(연락처)
		 * address(주소)
		 * 
		 * 결과;
		 * 이름:김양선
		 * 나이:50
		 * 연락처:010-65678-4864
		 * 주소:부산 서구 동대신동
		 */
		
		char name1 = '김';
	    char name2 = '양';
	    char name3 = '선';
	    
	    int age = 50;
	    
	    String phone = " 010-6567-4864";
		
	    String adress = "부산 서구 동대신동";
	    
	    
	    System.out.println("이름:"+name1+name2+name3); /* 유니코드 16진수 -> 10진수; 문자+유니코드=문자열-- 형변환됨*/
	    
	    System.out.println("나이:"+age);
	    System.out.println(age);
		
	    System.out.println("연락처:"+phone);
	    
	    System.out.print("주소:"+ adress);
		
	    System.out.print("세수의 합:"+ 10+20+30);
	    System.out.print("세수의 합:"+ (10+20+30));
	    
	    
	}

}
