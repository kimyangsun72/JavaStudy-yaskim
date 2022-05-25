package J08_클래스;

public class CarMain {
	public static void main(String[] args) {
		Car c1 = new Car();  // 생성자 특징 2가지(class와 이름이 같다, 반환자료형이 생략됨<- 주소값을 무조건 반환, 앞에 new가 붙는다 )
		Car c2 = new Car();
		Car c3 = new Car();
		
		c1.company = "KIA";
		c2.company = "현대";
		c3.company = "Tesla";
		
		c1.model = "K7";
		c2.model = "sonata";
		c3.model = "T";
		
		c1.color = "black";
		c2.color = "pink";
		c3.color = "white";
		
		System.out.println();
		
		c1.showCompanyInfo();
		c2.showCompanyInfo();
		c3.showCompanyInfo();
		
		System.out.println();
		
		c1.showInfoAll();
		c2.showInfoAll();
		c3.showInfoAll();
		
		System.out.println();
		
		System.out.println(c1.getCar());
		System.out.println(c2.getCar());
		System.out.println(c3.getCar());
		
		System.out.println();
		
		c1.setColor("sky");
		c2.setColor("ocean");
		c3.setColor("ivory");
		
		c1.showInfoAll();
		c2.showInfoAll();
		c3.showInfoAll();
	}
}
