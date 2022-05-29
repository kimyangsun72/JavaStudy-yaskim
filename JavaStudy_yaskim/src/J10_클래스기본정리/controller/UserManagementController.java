package J10_클래스기본정리.controller;

import J10_클래스기본정리.repository.User;
import J10_클래스기본정리.service.UserService;

public class UserManagementController {
	private UserService userService; //변수를 선언만 하고 각지역에서 필요하여생성하여 사용
	private User[] users;
	
	public UserManagementController(UserService userService) {
		this.userService = userService;
		users = new User[2];
		
		
	}
	
	public void createUser() {
		int indexResult = findEmptyInUsers();
		if(indexResult != -1) {
			users[indexResult] = userService.insertUser();
			
			User user = userService.insertUser(); // 변수= 주소값 
			System.out.println("[새로추가된 사용자]");
			System.out.println(user.toString());
			}
	}
	private int findEmptyInUsers(){
		for (int i = 0; i < users.length; i++) {
			if(users[i] == null) {
				return i;
			}
		}
		return -1;
		
	}
	
	public void updateUser() {
		
	}
	

}

