package J13_다형성;

public class FactoryMain2 {

	public static void main(String[] args) {
		
		Factory[] factories = new Factory[100];
		
//		factories[0] = new SmartPhoneFactory();
//		factories[1] = new ComputerFactory();
		
		
		for(int i = 0; i < factories.length; i++) {
		//	factories[i].start();  //부모가 start가 있어야하므로, override하는 이유임
		  // 삼항연산자, 조건연산자
			factories[i] = i%2 ==0 ? new SmartPhoneFactory() : new ComputerFactory();
			
		}
		for(Factory factory : factories) {
			factory.start();
		}
		
		int i = 10;
		double d = i;
		int ii = (int)d;
		
		System.out.println();
		
		for(Factory factory : factories) {               // 객체 instanceof 클래스 ; 객체type을 확인하는 연산자
			if(factory instanceof SmartPhoneFactory) {  // 이 클래스로 생성되면 true 실행/ 자료형 확인
				SmartPhoneFactory spf = (SmartPhoneFactory) factory;
				spf.showSmartPhone();
				
			}else if(factory instanceof ComputerFactory) {
				ComputerFactory cf = (ComputerFactory) factory;
				cf.showComputer();
				
			}else {
				System.out.println("다운캐스팅 할 수 없습니다.");
			}

	}
	}

}
