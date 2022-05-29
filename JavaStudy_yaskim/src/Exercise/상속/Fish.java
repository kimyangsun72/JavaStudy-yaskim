package Exercise.상속;

public class Fish extends Creature {
@Override
public void move() {
	super.move();
	System.out.println("물고기가 헤엄을 칩니다.");
}
public void breath() {
	System.out.println("물고기가 물속에서 숨을 쉽니다.");
	
}
}
