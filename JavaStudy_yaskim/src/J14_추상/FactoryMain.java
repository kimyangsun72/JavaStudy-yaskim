package J14_추상;

public class FactoryMain {
 // Factory 클래스를 상속받은 모든 클래스(인스턴스)를 담을 수 있는 공간 2개의 배열 생성
	public static void main(String[] args) {
		Factory samsung = new SamsungFctory();
	    Factory lg = new LGFctory();
	    
	    Factory[] factorys = new Factory[2];
	    
	    factorys[0] = new SamsungFctory();  // 업캐스팅
	    factorys[1] = new LGFctory();       // 업캐스팅
	    
	    for(Factory factory : factorys) {   // foreach반복 - 처음부터 끝까지 반복
	    	factory.start();   // 삼성, 엘지 순으로 가동
	    	}
	    
	    
	    for(Factory factory : factorys) {
	    	factory.stop();
	    }
	    
	}

}
