package Exercise.상속;

public class Dog extends Creature {
	@Override
	public void move() {
		super.move();
		System.out.println("개가 땅에서 뛰놉니다.");
	}
	
	public void keeping() {
		System.out.println("개가 집을 지킵니다.");
		
	}

}
