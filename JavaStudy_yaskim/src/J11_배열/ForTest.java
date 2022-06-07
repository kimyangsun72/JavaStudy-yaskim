package J11_배열;

public class ForTest {

	public static void main(String[] args) {
		// 구구단1단~9단까지 for문

		
//		for (int i = 0; i < 9; i++) {
//			System.out.println("★" + (i+1) + "단");
//			for (int j = 0; j < 9; j++) {
//				System.out.println((i+1) + "x" + (j+1) + "="  + (i+1)*(j+1));
//				
//			}
//			
//		}
		
//		for(int i=1; i < 90; i++) {
//			if(i%10 == 0) {
//				i++;
//				System.out.println();
//			}
//			
//			System.out.printf("%d * %d = %d\n", (i/10)+1, i%10, ((i/10)+1)*(i%10));
//		}
		
		for(int i = 0; i < 10 ; i++) {
			for(int j = 0; j < 10 ; j++) {
				if(i == 0) { 
					i++;
					
				}
				if(j == 0) {
					j++;
					System.out.println("★" + (i) + "단"+"★");
				}
				System.out.printf("%d*%d=%d\n", i, j, i*j);
			}
			System.out.println();
		}
		
	}

}
