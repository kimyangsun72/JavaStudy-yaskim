package J12_상속.동물;

/*
 * @ 어노데이션
 * 
 * 
 * @override (재 정의) 안에 들어있는 내용을 다시 정의 함
 * 상위 클래스 또는 인터페이스가 가지고 있는 메소드를 재정의 하겠다는 의미
 * 
 * 
 * 
 */
public class Human extends Animal {
	
	@Override   // 상의 클래스를 재 정의한것이다 표시기능임
	public void move() {
		System.out.println("사람이 두발로 걷습니다.");
		
	}
	public void readBooks() {
		System.out.println("사람이 책을 읽습니다.");
	}

}
