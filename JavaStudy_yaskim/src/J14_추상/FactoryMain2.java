package J14_추상;

public class FactoryMain2 {
 // Factory 클래스를 상속받은 모든 클래스(인스턴스)를 담을 수 있는 공간 2개의 배열 생성
	public static void main(String[] args) {
		LGFctory lgFctory = new LGFctory();
		lgFctory.start();
		lgFctory.stop();
		
		// Factory factory = new Factory(); 추상 클래스는 생성 할 수 없다.
			
			SamsungFctory samsungFctory = new SamsungFctory();
			samsungFctory.start();
			samsungFctory.stop();
		
		
	}
	

}
