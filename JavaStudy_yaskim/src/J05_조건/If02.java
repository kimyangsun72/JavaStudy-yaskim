package J05_조건;

public class If02 {

	public static void main(String[] args) {
	/*	int num = 5;
		
		if(num > 5) System.out.println("5보다 큽니다.");
		else System.out.println("5보다 크지 않습니다."); // if와 else는 1 set이다. 한 명령이다
            */                                             // if는 각각 명령 단위임
		
		int score = 86;
		
		if (score == 100) {
			System.out.println("만점입니다.");
		}else if(score > 89) {
			System.out.println("90점 이상입니다.");
		}else if(score > 79) {
			System.out.println("80점 이상입니다.");
		}else {
			System.out.println("...");
		}
				
	}
}

