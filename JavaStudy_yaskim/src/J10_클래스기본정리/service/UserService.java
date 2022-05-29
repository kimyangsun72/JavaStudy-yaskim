package J10_클래스기본정리.service;

import java.util.Scanner;

import J10_클래스기본정리.repository.User;

public class UserService {
	private Scanner scanner;
	
	public UserService() {
		scanner = new Scanner(System.in);
		
	}
	
	public User insertUser() {
		
		showInsertView();
		String usercode = null;
		String email = null;
		String name = null;
		String username = null;
		String password = null;
		
		System.out.println("사용자번호 입력;");
		usercode = scanner.nextLine();
		System.out.println("이메일;");
		email = scanner.nextLine();
		System.out.println("이름;");
		name = scanner.nextLine();
		System.out.println("사용자이름;");
		username = scanner.nextLine();
		System.out.println("비밀번호;");
		password = scanner.nextLine();
		
		User user = new User(usercode, email, name, username, password); //User 클래스에 있는 생성자 호출
		return user;	
		
	}
	
	private void showInsertView() {  //메소드 호출(=명령실행) -- 메소드 안의 명령이 순서대로 실행
		System.out.println("[사용자 추가");
		System.out.println("아래의 양식에 맞게 정보를 입력하세요");
	}

}
