package J11_배열;

public class Array01 {
 /*
  * 일반자료형 int
  * 전체자료형
  * 참조자료형 
  * 
  * 
  */
	public static void main(String[] args) {
		// 배열: 연관된 정보를 구룹핑(모아서 관리, 학급) 하는 것... 변수는 하나의 정보를 처리.
		
	// 1. 배열의 공간(크기)를 정해서 생성 
		System.out.println();
		int[] numbers = new int[10];  // 공간(크기)10개를 만듬
		
		
	// 2. 배열에 들어갈 값을 미리 정해서 생성
		int[] numbers2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}; // 공간을 만듦과 동시에 값을 넣어줌
		char[] characters = {'a', 'b', 'c', 'd', 'e'};
		boolean[] booleans = {true, true, true, false, false};
		
		String[] strArray = new String[5]; // String class도 배열로 선언 가능함
		String str = "test";    // 문자열도 주소값을 받는다. 클래스, 생성자와 같이
		
		
		for(int i = 0; i < numbers.length; i++) {  // 배열의 크기만큼 가져옴
			
			System.out.println("i:" + i);
			System.out.println("numbers:" + numbers[i]);
			System.out.println("numbers2:" + numbers2[i]);
		//	System.out.println(strArray[i]); //오류난다
			
		}
		
		
		  // 배열의 자료형 int[], int는 4 byte, int[10] = int자료형,4 byte 10개를 만들고 하나로 묶어라
		numbers[0] = 10;
		numbers[1] = 20;
		System.out.println(numbers[0]);
		
		for(int i = 0; i < strArray.length; i++) {
			System.out.println(strArray[i]);
		}
		
		
		 
	}                                 

}
