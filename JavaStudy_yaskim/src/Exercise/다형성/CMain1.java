package Exercise.다형성;

public class CMain1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Company[] companies = new Company[3];
		
		
		Company HWC = new HWC();
		Company SWC = new SWC();
		
		HWC.start();
		SWC.start();
		HWC.start();
		SWC.start();
		HWC.start();
		SWC.start();
		HWC.start();
	//	SWC.showSW();
	//	HWC.showHW();  ?
	}

}
