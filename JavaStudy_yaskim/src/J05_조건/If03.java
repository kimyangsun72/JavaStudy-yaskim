package J05_조건;

import java.util.Scanner;

public class If03 {

	public static void main(String[] args) {
		/*
		 * 
		 * 0보다 작거나 100보다 크면 계산 할 수 없는 점수입니다. 출력
		 * 
		 * 
		 */
		
		Scanner sc = new Scanner(System.in);
		
		int score = 59;
		if (score < 0 || score > 100) {  // 100이상은 존재할 수 없는 점수이므로 먼저 오류 조건 생성
			System.out.println("오류입니다");
		}else if (score > 89) {             // 가능하면 초과 미만(= 사용은 지양)으로 처리하면 좋다- 인덱스 때문에
			System.out.println("A");
		}else if (score > 79) {
			System.out.println("B");
		}else if (score > 69) {
			System.out.println("C");
		}else if (score > 59) {
			System.out.println("D");
		}else {
			System.out.println("F");
		}
		
		

	}

}
