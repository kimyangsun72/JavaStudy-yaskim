package J18_최상위클래스;

import java.util.Scanner;

public class StringObj {

	public static void main(String[] args) {
		String name = "김양선";  //리터럴 주소이다, 그래서 주소값이 아래와 같다
		String name2 = "김양선";  // 새로 생성된것이 아니고 문자열을 담아놓은 주소를 반환함
		
		System.out.println(name == name2); //조소값 비교
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("이름1:");
		name = scanner.nextLine();
		System.out.println("이름2:");
		name2 = scanner.nextLine();
		
		System.out.println(name == name2);
		
		
		name = new String("김양선");
		name2 = new String("김양선");
		
		System.out.println(name == name2);
		System.out.println(name.equals(name2));//주소값 다르지만 이름이 같을 때 들어있는 값을 비교
		
		

	}

}
