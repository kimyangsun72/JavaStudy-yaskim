package J17_스태틱;
/*
 * 
 * 정적 class멤버(static 변수, static method)를 공유하여 사용함.
 * 따라서, class 로딩 후 바로 사용가능함 => 모든 Object가 메모리를 공유함
 * 단점, Garbage collector 영역밖에 있음-> 메모리 공간 과대 사용 악영향
 * Object(instance)에 소속된 멤버가 아님
 * 예) 정적method는 메모리에 올라갈때 자동으로 생성됨. so 인스턴스를
 * 매번 생성하지 않아도 호출가능함. 유틸리티 메소드를 만드는데 유용함 
 * 
 * 
 */
		
		

public class Main {

	public static void main(String[] args) {  // static은 복제되지 않고, 공유하는 것
		 Test t = new Test();
		 Test t2 = new Test();
		 Test t3 = new Test();
		 
		 t.count = 10;
		 t2.count = 20;
		 t3.count = 30;
		 
		 t.method();
		 t2.method();
		 t3.method();

		 StaticTest st = new StaticTest();
		 StaticTest st2 = new StaticTest();
		 StaticTest st3 = new StaticTest();
		 
		 st.count = 10;
		 st2.count = 20;
		 st3.count = 35;
		 
		 
		 
		 st.staticmethod();
		 st2.staticmethod();
		 st3.staticmethod();
			                           // ?
	//	 StaticTest.count = 100;  // Static은 마지막 값으로 공유된다, 누워있는 글자가 Static이다
		 
		 StaticTest.staticmethod();
		 
		 
		 
	}

}
