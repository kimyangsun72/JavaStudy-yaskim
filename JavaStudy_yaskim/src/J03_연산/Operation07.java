package J03_연산;

public class Operation07 {

	public static void main(String[] args) {
		/*
		 * 4의 배수 && 100의 배수 != || 400의 배수
		 * 참이면 윤년
		 * 거짓이면 윤년이 아님
		 * 
		 * 
		 */
		int year = 2000;
		
		String result = null;
		
		result = year%4==0 && year%100!=0 || year%400==0 ? "윤년": "윤년이 아님";
		
//		String result = year%4==0 && year%100!=0 || year%400==0 ? "윤년": "윤년이 아님";
		
		System.out.println("결과:" + result);

	}

}
