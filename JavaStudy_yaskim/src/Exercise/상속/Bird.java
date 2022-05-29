package Exercise.상속;

public class Bird extends Creature {
	@Override
	public void move() {
	
		super.move();
		System.out.println("새가 하늘을 날아다닙니다.");
	}
	
	public void hunting() {
		System.out.println("새가 하늘에서 사냥을 합니다.");
	}
}
