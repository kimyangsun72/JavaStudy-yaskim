package Exercise.Static.Singleton;

public class KR {
	
	private static KR instance;
	private int s_auto_increment = 2022000;
	
	private KR() {}
	
	public static KR getInstance() {
		if(instance == null) {
			instance = new KR();
			
		}
		return instance;
		
	}

	public Iacs createIacs(String model) {
		return new Iacs(++s_auto_increment, 
				KR.class.getSimpleName(), model);
		
	}
	public void IacsInfo(Iacs iacs) {
		System.out.println(iacs.toString());
	}
}
