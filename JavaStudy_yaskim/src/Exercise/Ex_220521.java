package Exercise;

import java.util.Scanner;

public class Ex_220521 {

	// Method01 연습
	
/*	public static int clacFormula01(int a, int b, int c, int d, int e) {
		int result = (a*b) - (c*d);
		return result;
		
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("정수 5개를 입력");
		
		int a, b, c, d, e ;
		int r1, r2, r3, r4, r5 ;
	
		a = scanner.nextInt();
		b = scanner.nextInt();
		c = scanner.nextInt();
		d = scanner.nextInt();
		e = scanner.nextInt();
		
		
		r1 = clacFormula01(a, b, c, d, e);
		r2 = clacFormula01(a, b, c, d, e);
		r3 = clacFormula01(a, b, c, d, e);
		r4 = clacFormula01(a, b, c, d, e);
		r5 = clacFormula01(1, 3, 5, 7, 9);
		
		System.out.println("r1 = " + r1);
		System.out.println("r2 = " + r2);
		System.out.println("r3 = " + r3);
		System.out.println("r4 = " + r4);
		System.out.println("r5 = " + r5);
		
	}
*/
	
	// Method02
/*	public static void test() {
		System.out.println("test 메소드 실행");
	}
	
	public static void test(int age, int year) {
		System.out.println("나이:" + age);
		System.out.println("출생년도:" + year);
			
	}
	
	public static String test3() {
		return "김양선";
		
	}
	
	public static int test4() {
		return 1010;
		
	}
	
	public static String test5(String name, int num) {
		return name + num;
		
	}
	
	public static void test6() {
		for(int i = 0; i<10 ; i++) {
			System.out.println(i);
			if(i == 6) {
				System.out.println("메소드 탈출");
				return;
			
			}
			
		}
	//	System.out.println("종료되었습니다.);
	}
	
	public static void main(String[] args) {
		System.out.println("메인함수 시작");
		
		test();
		test(50, 1972);
		String name = test3();
		System.out.println(name);
		int num = test4();
		System.out.println(num);
		System.out.println(test5("김양선,", 10));
		
		test6();
		
		System.out.println("메인함수 끝");
		
	}
*/
	
	// method03
/*	public static void test1() {
		System.out.println("매개변수가 없는 test1 호출");
	}
	
	public static void test1(int num) {
		System.out.println("int 자료형 매개변수가 있는 test1호출");
	}
	
	public static void test1(int num1, int num2) {
		System.out.println("int 자료형 매개변수가 2개인 test1 호출");
	}
	
	public static void test1(double num) {
		System.out.println("double 자료형 1개인 test1 호출");
	}
	
	public static void test1(int num, double dNum) {
		System.out.println("int, double 자료형, 매개변수가 2개인 test1 호출");
	}
	
	public static void test1(double dNum, int num) {
		System.out.println("double, int 자료형, 매개변수가 2개인 test1 호출");
	}
	
	
	public static void main(String[] arg) {
		test1();
		test1(1971);
		test1(1972, 50);
		test1(3.14);
		test1(50, 171.5);
		test1(171.5, 50);
		
		
	}
	
*/
	
	// J06_반복_Continue
	
/*	public static void main(String[] args) {
		for(int i = 0; i<10 ; i++) {
			if(i%2 != 0) {
				continue;
			}
			System.out.println("짝수 나열 :" + i);
			
		}
	}
*/	
	// J06_For01
	
/*	public static void main(String[] args) {
		for(int i = 0; i <10 ; i++) {
			System.out.println(i+1);
		}
		
		for(int i = 0; i<10 ; i++) {
			System.out.println(10-i);
		}
	}
*/	
	  // J06_반복_19Dan
	
/*	public static void main(String[] args) {
		for(int dan = 0; dan < 18; dan++) {
			System.out.println((dan+2) + "단"); 
			
			for(int i = 0; i < 9 ; i++) {
				int result = (dan+2) * (i+1);
				
				System.out.println((dan+2) + "X" + (i+1) + "="+ result);
			}
		}
	}
*/	
// while01
	
/*	public static void main(String[] args) {
		int i = 0;
		int result = 0;
		
		while(i<10) {
			result = result + (i+1);
			i++;
			
		}
		System.out.println(result);
	}
*/
	
// while02_GuGuDan
	
	public static void main(String[] args) {
		
		int dan = 0;
		int num = 0;
		
		while (dan < 9) {
			
			System.out.println(dan+2 + "단:");
			while(num < 9) {
		}
			System.out.println((dan+2) + "x" + (num+1) + "=" + (dan+2)*(num+1));
			num++;
		}
	}
	
}
