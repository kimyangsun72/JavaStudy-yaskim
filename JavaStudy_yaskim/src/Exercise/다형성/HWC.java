package Exercise.다형성;

public class HWC extends Company {
	
	@Override
	public void start() {
		// TODO Auto-generated method stub
		super.start();
		System.out.println("하드웨어 회사 시작");
		
		
	}
		public void showHW() {
			System.out.println("하드웨어 검사");
		}
	

}
