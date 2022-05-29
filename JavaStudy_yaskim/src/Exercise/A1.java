package Exercise;

public class A1 {

	public static void main(String[] args) {
		System.out.println();
		int[] numbers = new int[10];
		
		int[] numbers2 = {1,2,3,4,5,6,7,8,9,10};
		char[] characters = {'a', 'b'};
		boolean[] booleans = {true, false, false};
		
		String[] strArray = new String[5];
		String str = "test";
		
		for(int i = 0; i < numbers.length; i++) {
			System.out.println("i:" + i);
			System.out.println("numbers:" + numbers[i]);
			System.out.println("numbers2:" + numbers2[i]);
			
		}
		
		for(int i = 0; i < strArray.length; i++) {
			System.out.println(strArray[i]);
		}
	}
}
