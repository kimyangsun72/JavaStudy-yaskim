package J23_예외처리;

public class ValidationCustomException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L; //객체 구분을 위한 진열화 (다른 프로그램과 연결할 때 사용)

	public ValidationCustomException() {
		super();
		System.out.println("우리가 만든 예외");
	}
	public ValidationCustomException(String message) {
		super(message);
		System.out.println("우리가 만든 예외 메시지 있음");
	}
	
}
