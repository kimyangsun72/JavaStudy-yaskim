package Exercise.다형성;

public class SWC extends Company {
	
	@Override
	public void start() {
		// TODO Auto-generated method stub
		super.start();
		System.out.println("소프트웨어 회사 시작");
	}
	
	public void showSW() {
		System.out.println("소프트웨어를 검사");
	}

}
