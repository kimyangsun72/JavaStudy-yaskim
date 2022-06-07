package J15_인터페이스;  // 기능 중심 .... 관계중심- 상속

public class Main {

	public static void main(String[] args) {
		Monitor monitor = new Monitor();
		BeamProjector beamProjector = new BeamProjector();
		
		SmartPhone smartPhone  = new SmartPhone(monitor);
		smartPhone.powerOn();
		smartPhone.powerOff();
		
			
		

	}

}
