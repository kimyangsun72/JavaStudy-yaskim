package Exercise.다형성;

public class CMain2 {

	public static void main(String[] args) {
		Company[] companies = new Company[7];
		
//		companies[0] = new HWC();
//		companies[1] = new SWC();
		
		for(int i = 0; i< companies.length; i++) {
			companies[i] = i%2==0 ? new HWC() : new SWC() ;
				
			
		}
		for(Company company : companies) {
			company.start();
		}
		int i = 10;
		double d = i;
		int iiiiiiiii = (int)d;
		
		System.out.println();
		
		for(Company company : companies) {
			if(company instanceof HWC) {
				HWC hwc = (HWC) company;
				hwc.showHW();
			}else if(company instanceof SWC) {
				SWC swc = (SWC) company;
				swc.showSW();
			}else {
				System.out.println("다운캐스팅 할 수 없습니다.");
			}
			
		}
	}

}
