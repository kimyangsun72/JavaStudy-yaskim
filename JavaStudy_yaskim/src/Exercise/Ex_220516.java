package Exercise;

import java.util.Scanner;

public class Ex_220516 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("입력값 :");
		 
		int year = sc.nextInt();
		
	//	boolean result ;
	    String result = year%4 == 0 && year%100 != 0 || year%400 == 0 ? "윤년" : "윤년 아님" ;
		System.out.println("입력값:" + result);
		

	}

	private static int nextInt(String string) {
		// TODO Auto-generated method stub
		return 0;
	}

}
