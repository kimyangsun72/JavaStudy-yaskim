package J15_인터페이스;

public class SmartPhone {
	
	private final Hdmi hdmi; //final 상수, 생성될 때 값이 주어져야함
	
	public SmartPhone(Hdmi hdmi) {
		this.hdmi = hdmi;
		
	}
	public void powerOn() {
		System.out.println("스마트폰 전원을 켭니다");
		hdmi.connect();
		
		
	}

	public void powerOff() {
		System.out.println("스마트폰 전원을 끕니다");
		hdmi.disconnect();
}
}