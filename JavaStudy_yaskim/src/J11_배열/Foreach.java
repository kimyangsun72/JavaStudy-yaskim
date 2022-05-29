package J11_배열;

public class Foreach {

	public static void main(String[] args) {
		int[] numbers = {1,2,3,4,5,6,7,8};
		
		/*
		 * 출력
		 * 1, 2, 3, 4, 5, 6, 7, 8 
		 * 
		 */
		
		for(int i = 0; i < numbers.length; i++) {  
			System.out.print(numbers[i]);
			if(numbers.length-1 !=i) {
				System.out.print(", ");
			}
		}
		
		System.out.println();
		
		
		for(int i = 0; i < numbers.length; i++) {  // 배열의 크기만큼 가져옴
			
			System.out.print(numbers[i] + (numbers.length-1 !=i ? ", ":""));
		
			System.out.println();
		}
		int i = 0;              // foreach문 : 
		for(int num : numbers) {  // numbers의 첫 값을 num에 넣는다
		//	System.out.print(num);
			i++;
			
			System.out.print(num + (numbers.length-1 !=i ? ", ":""));
			
		}
		
	}

}
