package J23_예외처리;

/*
 * 프로그램의 오류
 * 1. 예외(컴파일이 끝난 후 프로그램이 실행 중 - RuntimeException))
 * 2. 컴파일 에러 - 컴파일 과정 중에서 오류 예)드라이버(DB를 찾을 수 없거나, 설치누락
 *                                               IOException
 * 3. 버그 - 프로그램, 문법은 완벽(정상 작동)한데,,, 실행 중에 오작동 하는 것
 * 
 * 
 */




public class ArrayException01 {

	public static void main(String[] args) {
		
		int[] numbers = {1,2,3,4,5,6,7,8,9};
		
		try {  // 오류가 날듯한 곳을 try로 묶는다
		for(int i = 0; i < numbers.length+1; i++) {
			System.out.println("index" + i + ":" + numbers[i]);
			}
		
		}catch (StringIndexOutOfBoundsException e) {   //  예외가 발생하면, catch가 e 값을 받는다 
			System.out.println(e);
			System.out.println("StringIndexOutOfBoundsException 예외가 발생하였음.");
		
		}catch (Exception e) {  // 예외를 정학히 예상할 수 없으니, 뭉뚱거려 처리= 항상 가장 밑에 처리함
			System.out.println(e);  // log file에 기록했다가 ... 개발 후 유지보수 기간에 해결한다. 베타테스트(사용자)시 확인
		}
		
		System.out.println("지금까지 진행한 작업을 저장합니다.");
		System.out.println("프로그램이 정상적으로 종료되었습니다.");

	}

}
