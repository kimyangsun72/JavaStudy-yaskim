package J05_조건;

public class SwitchCase {

	public static void main(String[] args) {
		int num = 29;
		char c = 'c';
		String str = "김양선";
		str = "강주현"; // default 적어주는 이유임 - 
		
		
		switch(num/10) {
			case 1:                            // :콜론을 사용함, so 중괄호가 없으니 지정된 위치 이후를 전부 실행함
				System.out.println("case1");
				break;                           // case는 해당 부분 이하 전부를 실행하므로 해당case만 실행하려면 break를 걸어줌
			case 2:
				System.out.println("case2");
			case 3:
				System.out.println("case3");
				break;
			default:
				System.out.println("찾을 수 없음");
			
		}
		switch(c) {
		case 'a':
			System.out.println("case a");
		case 'b':
			System.out.println("case b");
		case 'c':
			System.out.println("case c");
			break;
		default:
			System.out.println("찾을 수 없음");
		
	}
		switch(str) {
		case "김양선":
			System.out.println("case 김양선");
		case "이미혜":
			System.out.println("case 이미혜");
		case "박준일":
			System.out.println("case 박준일");
		
			break;
		default:
			System.out.println("찾을 수 없음");
	}
	}

}
