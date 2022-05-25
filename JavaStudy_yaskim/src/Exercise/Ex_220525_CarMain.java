package Exercise;

public class Ex_220525_CarMain {

	public static void main(String[] args) {
		Ex_220525_Car c1 = new Ex_220525_Car();
		Ex_220525_Car c2 = new Ex_220525_Car();
		Ex_220525_Car c3 = new Ex_220525_Car();
		Ex_220525_Car c4 = new Ex_220525_Car();
		Ex_220525_Car c5 = new Ex_220525_Car();
		 
		c1.company = "KIA";
		c2.company = "RNOUT";
		c3.company = "HD";
		c4.company = "SABE";
		c5.company = "SS";
		
		c1.color = "WHITE";
		c2.color = "BLACK";
		c3.color = "BLUE";
		c4.color = "MARINE";
		c5.color = "RED";
		
		c1.name = "REX";
		c2.name = "SM";
		c3.name = "SONATA";
		c4.name = "SUB";
		c5.name = "REXTON";
		
		System.out.println();
		
		c1.showCompanyInfo();
		c2.showCompanyInfo();
		c3.showCompanyInfo();
		c4.showCompanyInfo();
		c5.showCompanyInfo();
		
		System.out.println();
		
		c1.showInfoAll();
		c2.showInfoAll();
		c3.showInfoAll();
		c4.showInfoAll();
		c5.showInfoAll();
		
		System.out.println();
		
		System.out.println(c1.getCar());
		System.out.println(c2.getCar());
		System.out.println(c3.getCar());
		System.out.println(c4.getCar());
		System.out.println(c5.getCar());
		
		System.out.println();

		c1.setColor("SKY");
		c2.setColor("OCEAN");
		c3.setColor("MIDNIGHT");
		c4.setColor("MUD");
		c5.setColor("TREE");
		
		System.out.println();
		
		c1.showInfoAll();
		c2.showInfoAll();
		c3.showInfoAll();
		c4.showInfoAll();
		c5.showInfoAll();
}

}
