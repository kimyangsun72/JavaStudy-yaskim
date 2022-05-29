package J12_상속.동물;

public class AninmalMain {

	public static void main(String[] args) {
		Animal animal = new Animal();
		Human human = new Human();
		Tigar tigar = new Tigar();
		
		animal.move();
		human.move();
		tigar.move();
	
		
		human.readBooks();
		tigar.hunting();
		
	}

}
