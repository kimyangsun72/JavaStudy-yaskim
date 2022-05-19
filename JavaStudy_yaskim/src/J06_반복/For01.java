package J06_반복;

public class For01 {

	public static void main(String[] args) {
		/*
		 * 
		 * 
		 * 
		 * 
		 */
		                                // for 문은 규칙적인 조건일때
		for (int i = 0 ; i<10 ; i++) {  //3가지 영역 - 선언부(초기 식, 딱 한번 실행) ; 조건 ; 조건변환 수식
			                           // 참이면 중괄호 실행으로 간다
			
			System.out.println(i +1);
		}
		
		for (int i = 0 ; i < 10 ; i++) {  // 10번 반복해라
			System.out.println(10-i);
		}
		
		
	/*	int i = 0;
		while(i <5) {                    // while은 조건이 사용자가 자유롭게 한정적으로 주고자 할때
			System.out.println(i+1);
			 i++;
		}
*/
	}

}
