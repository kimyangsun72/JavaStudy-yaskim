package J06_반복;

public class GuGuDan {

	public static void main(String[] args) {
		 /*
		  * 구구단
		  * 
		  * 반복문 포기는 programing 포기한 것 => 자기것 만들어야!
		  */
		
	/*	for(int i = 0; i+1<9; i++) {
			for(int j=0; j<i+1; j++) {
				System.out.println(i + "x"+(j+1)+"="+i*(j+1));
				++j;
			
			}
			System.out.println();
			*/
		
		for (int dan =0; dan <8 ; dan++) {
			System.out.println((dan +2)+"단");
			
			for(int i = 0; i<9; i++) {
				int result = (dan +2)*(i+1);
				
				System.out.println((dan +2)+ "x" +(i+1) + "=" + result);
			}
			System.out.println();
		}

	}

}
