package J03_연산;

public class Operation06 {

	public static void main(String[] args) {
		int num = 80;
		
		String result = num % 4 == 0 ? "4의 배수" : "4의 배수가 아님";
		boolean results2 = num %4 == 0 ? true : false;  // ctl + alt = 화살표
		int result3 = num %4 == 0 ? 1 : 0;
		
		boolean result2 = num %4 == 0 ? true: false; // 단축키 ctrl + sh +l
		
		
		System.out.println(num % 4 == 0 ? "4의 배수" : "4의 배수가 아님");
		                             // 참이니? .. CPU는 연산처리를 하는 장치임. 조건문 보다 연산자를 더 좋아함, 
		                             // 조건문을 사용하지 않더라도, 삼항연산자는 조건문을 사용할 수 있다.
		
		
		System.out.println(); // control + space => 자동완성
		

	}

}
