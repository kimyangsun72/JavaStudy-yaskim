package J04_입력;

import java.util.Scanner;

public class Input03 {

	public static void main(String[] args) {
		/*
		 *[개인정보 입력]
		 *이름: 김양선             문자열  name
		 *나이: 50                 정수    age
		 *연락처: 01065674864      문자열  phone
		 *주소: 부산 서구          문자열  address
		 *성별: 남                 문자    gender
		 *
		 *[개인정보 출력]
		 *이름 => 김양선             문자열
		 *나이 => 50                 정수
		 *연락처 => 01065674864      문자열
		 *주소 => 부산 서구          문자열
		 *성별 => 남                 문자
		 *
		 * 
		 *  
		 */

	 	Scanner scanner = new Scanner(System.in);
			 	
	 	String name = null;
	 	String phone = null;
	 	String address = null;
	 	int age = 0;
	  	char gender = ' ';
	
		
		System.out.print("이름:");
		name = scanner.nextLine();
		phone = scanner.nextLine();
		address = scanner.nextLine();
		age = scanner.nextInt();
		gender = scanner.next().charAt(0);
		System.out.print("이름:");
		
		System.out.print("이름:");
		
		System.out.print("이름:");
		
		System.out.println();
	// next() -- 뛰어쓰기 전 까지 출력(space, enter 기준을 자른다, 무시한다 - buffer에 space, enter 가 남아있다)
		// nextLine() -- 문장 전체를 출력, (space, enter 포함한다)
		
		
	/*	String address1 = null;
		
		
		
		System.out.println("주소");
		address1 = scanner.next();
		address2 = scanner.next();
		address3 = scanner.next();
		
		System.out.println("주소: " + address1 + address2 + address3); */
		
		/*
		 * 
		 * 개요  액션, 판타지, 모험  미국
		 * 감독  샘레이미
		 * 등급  [국내]12세 관람가
		 * 줄거리 지금껏 이런 액션은 없었다
		 * 
		 * 
		 * 
		 */
		
	/*	Scanner scanner = new Scanner(System.in);
		
		String 개요 = null;
		String 감독 = null;
		String 등급 = null;
		String 줄거리 = null;
		
		System.out.print("개요:");
		개요 = scanner.nextLine();
		
		System.out.print("감독:");
		감독 = scanner.nextLine();
		
		System.out.print("등급:");
		등급 = scanner.nextLine();
		
		System.out.print("줄거리:");
		줄거리 = scanner.nextLine();
		
		System.out.println("개요:" + 개요);
		System.out.println("감독:" + 감독);
		System.out.println("등급:" + 등급);
		System.out.println("줄거리:" + 줄거리);
		
		System.out.println(scanner.nextLine()); */
		
		/*
		 * if 가정적 조건 -- 아니면 else
		 * 
		 * 
		 * 
		 */
		 
	}

}
