package J23_예외처리;

public class ThrowEx {

	public static void main(String[] args) {
		try {
			System.out.println("프로그램 실행 중");
			int i = 0;
			
			if(i == 0) {
				
				throw new ValidationCustomException("예외 발생");  //예외를 강제로 발생시킴
			}
			
		}catch (Exception e) {
			e.printStackTrace();  // 예외 발생되면 여기서 처리
		}finally {    // 예외가 발생하더라도 무조건 실행함
			System.out.println("무조건 실행"); 
		}

	}

}
