package J06_반복;

import java.util.Scanner;

public class Star {
	public static void main(String[] args) {
		
		/*	System.out.print("*");
			System.out.println();
			System.out.print("*");
			System.out.print("*");
			System.out.println();
			System.out.print("*");
			System.out.print("*");
			System.out.print("*");
			System.out.println();
			
			 *숙제
			 *    *
			 *   ** 
			 *  ***
			 * ****
			 ******
			 ******
			 * ****
			 *  ***
			 *   **
			 *    *
			 *    
			 *     *
			 *    ***
			 *   *****
			 *  *******  
			 * *********   
			 *
			 */
		
		for(int i = 0; i<5; i++) {
			for(int j=0; j<i+1; j++) {
				System.out.print("*");
			}
			System.out.println();
			
		}
			
		for(int i = 0; i<5; i++) {
			for(int j=0; j<5-i; j++) {
				System.out.print("*");
			}
			System.out.println();
			
		}
	//////////////////////////////////////////////////////////////////////////////
		Scanner scanner = new Scanner(System.in);
		int num = 0;
		
		System.out.println("입력값 :");
		num = scanner.nextInt();
		
				
		for(int i = 0; i<num; i++) {
			for(int j=0; j<i+num-1; j++) {
				System.out.print(" ");
			}
				for(int k=0; k<num-4; k++) {
					System.out.print("*");
												
			}
			System.out.println(); {
			}
		}
	
		for(int i = 0; i<5; i++) {
			for(int j=0; j<5-i; j++) {
				System.out.print("*");
			}
			System.out.println();
			
		}
		
}
}

