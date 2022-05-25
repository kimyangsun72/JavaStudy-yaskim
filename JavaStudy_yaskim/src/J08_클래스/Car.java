package J08_클래스;

public class Car { // class 틀 -> 찍어내는 행위 , 생성하다(생성자) 
	String company;
	String model;
	String color;
	
		void showCompanyInfo() {
		System.out.println(company + "에서 제조된 차량입니다.");
		
	}
	void showInfoAll() {
		System.out.println("제조자:"+ company);
		System.out.println("모델:"+ model);
		System.out.println("색깔:"+ color);
		
			
	}
	String getCar() {
		return company + "_" + model + "_" + color;
	}
	void setColor(String color) {
		this.color = color;   // 자신의 주소 = this
	}
}
