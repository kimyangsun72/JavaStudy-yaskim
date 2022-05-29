package J10_클래스기본정리;

import J10_클래스기본정리.controller.UserManagementController;
import J10_클래스기본정리.service.UserService;

public class UserManagementApplication {

	public static void main(String[] args) {
		
		UserManagementController userManagementController 
		= new UserManagementController(new UserService());
		userManagementController.createUser(); //메소드 호출
		userManagementController.createUser(); //메소드 호출
		userManagementController.createUser(); //메소드 호출
	
		

	}

}
