package J08_클래스;

public class FishBunMain {

	public static void main(String[] args) { 
//     참조자료형 변수   새로운   값(매소드 호출) 
		FishBun fishBun = new FishBun(); // 객체 생성(new 를 붙이면) == (객체)생성자 ==> 생성하면 Instance 가 됨-> 생성되는 곳은 메모리 주소
//주소. 참조 - 어디 있는 것을 가지고 와라     
		
		fishBun.showInfo();
		fishBun.material = "팥";
		fishBun.dough = "부드러운 반죽";
		fishBun.showInfo();
		
		System.out.println("============================");
		
		FishBun fishBun2 = new FishBun(); // 객체생성
		
		fishBun2.showInfo();
		fishBun2.material = "슈크림";
		fishBun2.dough = "퍽퍽한 반죽";
		fishBun2.showInfo();
		
		fishBun.showInfo();
		
		FishBun fishBun3 = new FishBun();
		fishBun3.material = "녹두";
		fishBun3.dough = "맛있는 반죽";
		fishBun3.showInfo();
		
		System.out.println(fishBun);
		System.out.println(fishBun2);
		
	}

}
