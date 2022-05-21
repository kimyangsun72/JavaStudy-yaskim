package j07_메소드;

import java.util.Scanner;

public class Method01 {
	

	public static int clacformula1(int a, int b, int c, int d, int e) {  //입력
		int result = a + (b * c)- (d * e) ;
		return result;   //출력
	}
	
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		
		int a, b, c, d, e;
		int r1, r2, r3, r4 = 0;
		
		
		a = scanner.nextInt();
		b = scanner.nextInt();
		c = scanner.nextInt();
		d = scanner.nextInt();
		e = scanner.nextInt();
		
		
		/*
		 * 함수(method) x + y = z
		 * 
		 * 
		 * 
		 */   // 결과를 반환
		r1 = clacformula1(a, b, c, d, e);  //호출(입력으로)
		// 소스코드 만줄
		r2 = clacformula1(10, 20 ,5, 30, 2);
		// 천줄
		r3 = clacformula1(a, b, c, d, e);
		// 이천줄
		r4 = clacformula1(a, b, c, d, e);
		

		System.out.println(r1);
		System.out.println(r2);
		System.out.println(r3);
		System.out.println(r4);
 
	}

}
