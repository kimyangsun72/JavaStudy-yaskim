package Exercise;

import java.util.Scanner;

public class US {
	private Scanner scanner;
	
	public US() {
		scanner = new Scanner(System.in);
		
	}

	public U insertU() {
		
		showInsertView();    // ?
		String usercode = null;
		String email = null;
		String name = null;
		String username = null;
		String password = null;
		
		System.out.println("사용자번호 입력:");
		usercode = scanner.nextLine();
		System.out.println("이메일 입력:");
		email = scanner.nextLine();
		
		System.out.println("이름 입력:");
		name = scanner.nextLine();
		
		System.out.println("사용자이름 입력:");
		username = scanner.nextLine();
		
		System.out.println("비밀번호 입력:");
		password = scanner.nextLine();
		
		U u = new U(usercode, email, name, username, password);
		return u;
		 
		
		
	}

	private void showInsertView() {
		System.out.println("[사용자 추가]");
		System.out.println("아래의 양식에 맞게 정보를 입력하세요");
	}
}
