package J14_추상;

public class SamsungFctory extends Factory{

	@Override
		public void start() {
			System.out.println("삼성팩토리 가동");
	
}
	@Override
		public void stop() {
			System.out.println("삼성 공장 멈춤");
		}

}