package J19_제네릭;




	public static void main(String[] args) {
		Controller controller = new Controller();
		System.out.println(controller.createUser());
		System.out.println(controller.updateUser());
		System.out.println(controller.getUser().getData());
		controller.getAnimal().getData().move();

	}

}
