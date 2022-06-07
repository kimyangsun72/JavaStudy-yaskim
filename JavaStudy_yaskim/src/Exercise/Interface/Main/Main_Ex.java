package Exercise.Interface.Main;

import Exercise.Interface.Controller.Apic;
import Exercise.Interface.Service.A2US;
import Exercise.Interface.Service.AUS;

public class Main_Ex {

	public static void main(String[] args) {
		
		Apic company = new Apic(new A2US());
		company.addUser();
		company.getUser();
		company.modifiUser();
		company.removeUser();
		

	}

}
