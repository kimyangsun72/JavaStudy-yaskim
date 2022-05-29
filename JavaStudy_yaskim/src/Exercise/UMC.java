package Exercise;

public class UMC {
	private US us;
	
	public UMC() {
		us = new US();
		
	}
	
	public void createU() {
		U u = us.insertU();
		System.out.println("[새로추가된 사용자");
		System.out.println(u.toString());
	}

	private void updateU() {
		
	}
}
