package Exercise.Static.Singleton;

public class Iacs_Main {
	
	public static void main(String[] args) {
		KR k1 = KR.getInstance();
		KR k2 = KR.getInstance();
		KR k3 = KR.getInstance();
		
		Iacs cert1_01 = k1.createIacs("cert1");
		Iacs cert1_02 = k1.createIacs("cert1");
		Iacs cert1_03 = k1.createIacs("cert1");
		
		k1.IacsInfo(cert1_01);
		k2.IacsInfo(cert1_02);
		k3.IacsInfo(cert1_03);
		
		Iacs cert2_01 = k1.createIacs("cert2");
		Iacs cert2_02 = k1.createIacs("cert2");
		Iacs cert2_03 = k1.createIacs("cert2");
		
		k1.IacsInfo(cert2_01);
		k2.IacsInfo(cert2_02);
		k3.IacsInfo(cert2_03);
		
		
		
	}

}
