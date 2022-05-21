package J06_반복;

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// 주석 작성 구간 비워둠
		boolean loopFlag = true;
		
		System.out.println("프로그램 시작");

		
		while(loopFlag) {
			char select = 0;
			
			System.out.println("[메뉴 선택]");
			System.out.println("1. Java");
			System.out.println("2. Phython");
			System.out.println("3. Javascript");
			System.out.println("q. 프로그램 종료");
			
			System.out.print("명령을 입력하세요:");
			select = scanner.next().charAt(0); // 문자열에서 0번째 인덱스를 받는다
			System.out.println(select);
			scanner.nextLine();
			 
			if(select == 'q') {
				break;
			}else if(select =='1') {
				System.out.println("Java를 선택하셨습니다.");
				while(true) {
					System.out.println("java 메뉴");
					System.out.println("1. java란");
					System.out.println("b. 뒤로가기");
					System.out.println("프로그램 종료");
					
					System.out.print("명령을 입력하시오: ");
					select = scanner.next().charAt(0);
					scanner.nextLine();
					
					if(select == 'b') {
						break;
					}else if(select =='q') {
						loopFlag = false;
						break;
						
					}else if(select =='1') {
						System.out.println("자바란 ...입니다.");
						System.out.print("계속하려면 엔터를 눌러주세요: ");
						scanner.nextLine();
						
					}else {
						System.out.println("해당 명령은 보기에 없습니다");
					    System.out.println("다시 입력하세요.");
						
					}
				
				}
				
				
			}else if(select =='2') {
				
				System.out.println("Python를 선택하셨습니다.");
				
				while (true) {
					System.out.println("Python 메뉴");
					System.out.println("2 Python이란");
					System.out.println("b. 뒤로가기");
					
					System.out.print("명령을 입력하시오: ");
					select = scanner.next().charAt(0);
					scanner.nextLine();
					
					if(select =='b') {
						break;
						
					}else if(select =='2' ) {
						System.out.println("Python란 ...입니다.");
						System.out.print("계속하려면 엔터를 눌러주세요: ");
						scanner.nextLine();
							
					}else {
						System.out.println("해당 명령은 보기에 없습니다");
					    System.out.println("다시 입력하세요.");
						
					}
				}
				
					
			}else if(select =='3') {
				System.out.println("Javascript를 선택하셨습니다.");
				
				while (true) {
					System.out.println("Javascrippt 메뉴");
					System.out.println("2 Javascript이란");
					System.out.println("b. 뒤로가기");
					
					System.out.print("명령을 입력하시오: ");
					select = scanner.next().charAt(0);
					scanner.nextLine();
					
					if(select =='b') {
						break;
						
					}else if(select =='3' ) {
						System.out.println("Javascript란 ...입니다.");
						System.out.print("계속하려면 엔터를 눌러주세요: ");
						scanner.nextLine();
							
					}else {
						System.out.println("해당 명령은 보기에 없습니다");
					    System.out.println("다시 입력하세요.");
				}
				System.out.println("계속하시려면 엔터를 눌러주세요.");
				scanner.nextLine();  // 1번 선택 후 머물게 하고 싶다
		
			}
			System.out.println();
		}
	
		System.out.println("프로그램 종료");

	}
 
	}
}