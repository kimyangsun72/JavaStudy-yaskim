package J04_입력;

import java.util.Scanner;

public class Input02 {

	public static void main(String[] args) {
		/*
		 * 문자열1 입력: nextLine()       hi
		 * 문자열2 입력: next()           안녕
		 * 문자 입력 : next().charAt(0)   A
		 * 정수 입력 : nextInt()          10
		 * 실수 입력 : nextDouble()       3.14
		 * 
		 */
		
		
		Scanner scanner = new Scanner(System.in);
		
	//	System.out.print("문자열1 입력:");
	//	String st1 = scanner.nextLine();
	//	System.out.print("문자열2 입력:");
	//	String st2 = scanner.next();
	//	System.out.print("문자 입력:");
	//	char c = scanner.next().charAt(0);
	//	System.out.print("정수 입력:");
	//	int i = scanner.nextInt();
	//	System.out.print("실수 입력:");
	//	double d = scanner.nextDouble();
		
		String a = null;   // 변수 선언은 한곳에 모아라, 개발시 지켜야할 기본
		String b = null;
		char c = 0;
		int d = 0;
		double e = 0;
		
		
		System.out.print("문자열1 입력:");
		a = scanner.nextLine();
		System.out.print("문자열2 입력:");
		b = scanner.nextLine();
		System.out.print("문자 입력:");
		c = scanner.next().charAt(0);
		System.out.print("정수 입력:");
		d = scanner.nextInt();
		System.out.print("실수 입력:");
		e = scanner.nextDouble();
		
		
		System.out.println("문자열1 입력 =>" + a);
		System.out.println("문자열2 입력 =>" + b);
		System.out.println("문자 입력 =>" + c);
		System.out.println("정수 입력 =>"+ d);
		System.out.println("실수 입력 => "+ e);

	}

}
