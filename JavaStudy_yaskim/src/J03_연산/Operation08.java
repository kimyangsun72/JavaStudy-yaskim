package J03_연산;

import java.util.Scanner;

public class Operation08 {

	public static void main(String[] args) {
		/*
		 * num = 10
		 * 
		 * num이 짝수면 짝수, 홀수면 홀수를 출력하는 프로그램 작성
		 * 
		 * 
		 */

		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("값 입력:"); // 첫번째 값, 두번째 값
		
		int num1 = scanner.nextInt();

		int num2 = scanner.nextInt();
		
		System.out.println("입력한 값:" + (num1 + num2));
		
		int num3 = num1 + num2;
		
	//	String result = num%2==0 ? "짝수" : "홀수" ;
		
	//	System.out.println("입력한 값 : " + result);
	
		
		scanner.next();             // 문자열
		scanner.nextLine();         // 문자열
		scanner.nextInt();          // 정수
		scanner.next().charAt(0);   // 문자
		scanner.nextDouble();       // 실수
		
	}

}
