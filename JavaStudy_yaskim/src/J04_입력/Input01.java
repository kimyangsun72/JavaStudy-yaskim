package J04_입력;

import java.util.Scanner;

public class Input01 {

	public static void main(String[] args) {
//		Scanner scanner = new Scanner(System.in); // 키보드 입력을 받겠다
		// 변수 선언(참조 자료형)    = new 동일한 참조자료형(입력
		// int = 일반 자료형
		
//		Scanner scanner = new Scanner(System.in);
//		
//		System.out.print("값 입력:");
//	
//		int num = scanner.nextInt();
//		System.out.println("입력한 값:"+ num);
		
		/*
		 * ex, 윤년을 출력하시오
		 * 
		 * 
		 * 
		 */
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("값 입력:");
		
		int year = scanner.nextInt();
		
		String result;
		result = year % 4 == 0 && year % 100 != 0 || year % 400 == 0 ? "윤년": "윤년이 아님";
		
		System.out.println("입력값은 :" + result);
	}

}
