package Exercise.Static.Singleton;

public class Iacs {
	private int s_Number;
	private String company;
	private String model;
	
	public Iacs() {
		
	}
	
	public Iacs(int s_Number, String company, String model) {
		super();
		this.s_Number = s_Number;
		this.company = company;
		this.model = model;
	}

	public int getS_Number() {
		return s_Number;
	}

	public void setS_Number(int s_Number) {
		this.s_Number = s_Number;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	@Override
	public String toString() {
		return "Iacs [s_Number=" + s_Number + ", company=" + company + ", model=" + model + "]";
	}
	
		
	

}
