package Exercise.Static;

public class STMain {
	
	public static void main(String[] args) {
		GT t1 = new GT();
		GT t2 = new GT();
		GT t3 = new GT();
		
		t1.count = 100;
		t2.count = 200;
		t3.count = 300;
		
		
		t1.method();
		t2.method();
		t3.method();
		
		ST st1 = new ST();
		ST st2 = new ST();
		ST st3 = new ST();
		
		st1.count = 15;
		st2.count = 25;
		st3.count = 35;
		
		
		st1.staticmethod();
		st2.staticmethod();
		st3.staticmethod();
		
	}

}
