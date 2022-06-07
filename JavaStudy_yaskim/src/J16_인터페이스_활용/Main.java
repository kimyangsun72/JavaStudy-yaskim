package J16_인터페이스_활용;

import J16_인터페이스_활용.controller.APIController;
import J16_인터페이스_활용.service.AuthUserService;
import J16_인터페이스_활용.service.Auth2UserService;

public class Main {

	public static void main(String[] args) {
		APIController company = new APIController(new AuthUserService());
		company.addUser();
		company.getUser();
		company.modifiUser();
		company.removeUser();
		

	}

}
