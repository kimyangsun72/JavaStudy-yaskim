package J17_스태틱.싱글톤;

public class SingletonMain {

	public static void main(String[] args) {
		/*
		 * 싱글톤
		 * 1. 유일한 객체(인스턴트)를 생성한다.
		 * 
		 * 
		 * 
		 * 
		 */
		

		
		Singleton singleton = Singleton.getInstance(); //만들어진 인스턴스를 공유함
		singleton.setCount(10);
		singleton.printInfo();
		
		Singleton singleton2 = Singleton.getInstance();
		singleton2.setCount(10);
		singleton2.printInfo();

	}

}
