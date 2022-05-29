package Exercise;

public class A2 {

	public static void main(String[] args) {
			
		
		int size = 0 ;
		
		for(int i = 0; i < 100; i++) {
			if(i !=0 && i%8==0) {            //  i     0 1 2 3 4 5 6 7 8 9 10.. 16.. 24
				size++;                      //  size  0 0 0 0 0 0 0 0 0 0 0    1    2
			System.out.println(size);        //        ... 12ea
			}
		}	
		int[] numbers = new int[size];        //?
	 	
		for(int i=0, j=0; i<100; i++) {             // i 0 1 2 3 4 5 6 7 8 9 .. 16.. 24
			if(i !=0 && i%8 ==0) {                  // j 0
				numbers[j]= i;       //?            // 
		 		System.out.println(numbers[j]);     //   1
	 			System.out.println(i);              //   0
				j++;                                //   0
			 
			}
		 
		}
	 
		for(int i = 0; i < numbers.length; i++) {    //i 0 1 2 3 4 5 6 7 8 9  
			System.out.println(numbers[i]);          //  8
		 
	 }

}
}
