package J09_접근지정자.b;

public class Teacher {
	private String name; // private 지향
	private String address;
	private String phone;
	
	
	public String getName() {   // 쉬프트+알트+s
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
		
	// 캡슐화
	
	public void showInfo() {
		String _address = createMassage(name, address);
		String _phone = createMassage(name, phone);
		
		System.out.println(_address);
		System.out.println(_phone);
		
		
	}
	private String createMassage(String name, String value) {
		return name + "님:" + value;
		
	}
	
	
}
