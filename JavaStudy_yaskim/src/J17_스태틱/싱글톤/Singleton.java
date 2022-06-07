package J17_스태틱.싱글톤;
/*정의: 하나의 프로그램 내에서 하나의 인스턴스만을 사용해야하는 상황
 * 예) 사용자 정보를 관리하는 인스턴스생성
 * 
 * 1. 생성자는 private으로 지정하여 외부에서 생성할 수 없게 만들어야 한다.
 * 2. 싱글톤으로 설계된 클래스의 유일한 instance 를 return해줄 수 있는 
 * getInstance() static 메소드가 존재해야 한다
 * 3. 싱글톤 instance를 저장할 변수명이 instance 인 Static 변수가 존재해야 한다.
 * 
 * 
 */

public class Singleton {
	private static Singleton instance = new Singleton(); //내부 생성되는 생성자는 Static 변수에 들어가야함
	private int count;
	
	private Singleton() {} //유일한 객체여야 한다
	
	public static Singleton getInstance() {
		if(instance == null) {   // 만약 null이면 아래가 생성하고, 반환해라
			instance = new Singleton();
		}
	//	System.out.println(count); // static에서만 사용가능함
		return instance;
		
	}
	
	public int getCount() {   //밖으로 빼는 getter (static을 활용하여)
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public void printInfo() {
		System.out.println("싱글톤 테스트" + count);
	}

	@Override
	public String toString() {
		return "Singleton [count=" + count + "]";
	}
	
	

}
