package J05_조건;

public class If01 {

	public static void main(String[] args) {
		int num =5;
		
		System.out.println("프로그램 시작");
		
		if(num > 5) {                                 // 조건이 참일 때만 실행됨
			System.out.println("5보다 큽니다.");
							
		}else {
			if(num < 5) {
				System.out.println("5보다 작습니다.");
     		}else {
				System.out.println("num이 5 입니다");
     		     		
     	}
		
		System.out.println("프로그램 종료"); // clean coode 필독서 - 변수명, 뛰어쓰기 등등
	}
	}
}
