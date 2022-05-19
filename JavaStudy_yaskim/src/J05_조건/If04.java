package J05_조건;

import java.util.Scanner;

public class If04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x = 0;
		int y = 0;
	
		System.out.println("x:"); 
		x = sc.nextInt();
		System.out.println("y:"); 
		y = sc.nextInt();
		
		
	/*	if (x > -1000 && x < 1000 ){
			System.out.println("계산불가");
		if (x == 0 || y == 0) {
			System.out.println("계산불가");
		if (x == 0 && y == 0) {
			System.out.println("원점");
		}else if(x>0 && x>0) {
			System.out.println("제 1 사분면");
		}else if(x<0 && y>0 ) {
			System.out.println("제 2 사분면");
		}else if(x<0 && y <0) {
			System.out.println("제 3 사분면");
		}else {
			System.out.println("제 4 사분면");
		}
		}
			
		}

	} */

/*	
	
	 if((x>1000 || y>1000 || x<-1000 || y<-1000 || x == 0|| y ==0) && (x !=0 || y!=0)) {
		System.out.println("계산불가");
		
	}else if(x > 0 && y > 0) {
			System.out.println("1사분면");
	}else if(x<0 && y>0) {
		System.out.println("2사분면");
	}else if(x<0 && y<0) {
		System.out.println("3사분면");
	}else if(x>0 && y<0) {
		System.out.println("4사분면");
	}else {
		System.out.println("원점");
	}
} */// 삼항연산자는 명령실행 불가, so 명령실행 위해서는 조거
	
	String result (x>1000 || y>1000 || x<-1000 || y<-1000 || x == 0|| y ==0) 
				&& (x !=0 || y!=0) ? "계산불가"
						: x > 0 && y > 0 ? "1사분면"
								: x<0 && y>0 ? "2사분면"
										: x<0 && y<0 ? "3사분면"
												: x>0 && y<0 ? "4사분면" : "원점" {
													
												System.out.println(result);
												}
}

