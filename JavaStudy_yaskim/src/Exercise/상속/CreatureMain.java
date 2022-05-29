package Exercise.상속;

public class CreatureMain {

	public static void main(String[] args) {
		Creature creature = new Creature();
		Bird bird = new Bird();
		Dog dog = new Dog();
		Fish fish = new Fish();
		
		creature.move();
		bird.move();
		bird.hunting();
		dog.move();
		dog.keeping();
		fish.move();
		fish.breath();

	}

}
