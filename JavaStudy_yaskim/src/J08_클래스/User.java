package J08_클래스;

public class User {
	String name;   // 참조 자료형
	String age;
	String phone;
	String address;
	
	User(){   // 기본생성자 - 반환자료형 생략
		System.out.println("생성");
		
	 }
	 User(String name){  // 사용자 정의 생성자(자료형이 있는) 생성자 -- 오버로딩 가능함 
		 this.name = name;
	 }
	 
	 User(String name, String age, String phone, String address){
		 this.name = name;
		 this.age = age;
		 this.phone = phone;
		 this.address = address;
		 
	 }
	 void setName(String name) {   // 모두 복사됨
		 System.out.println("setName 메소드 안에서 호출:" + this);
		 this.name = name;      // this는 자신Class의 주소
		 
	 }
}
