package Exercise;

public class Ex_220525_Car {
	String company;
	String name;
	String color;
	
	
	void showCompanyInfo() {
		
		System.out.println(company + "에서 제작된 차량입니다.");
		
	}
	
	void showInfoAll() {
		System.out.println("제조자:" + company);
		System.out.println("이름:" + name);
		System.out.println("색깔:" + color);
	}
	
	String getCar() {
		return company + "-" + name + "-" + color;
	}
	void setColor(String color) {
		this.color = color;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}
	

}
