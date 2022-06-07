package J11_배열;

public class ArTask {

	public static void main(String[] args) {
		// 배열선언 후 1~5까지의 값 넣기(for문 사용)
		
		// 10~1까지의 까지의 값 넣기(for문 사용)
	
		int[] arTask = new int[5];
		int[] arNum2 = new int[10];
		
		for (int i = 0; i < arTask.length; i++) {
			arTask[i]=1+i;
		}	
		for (int i = 0; i < arTask.length; i++) {
		System.out.println(arTask[i]);

		}
		for (int i = 0; i < arNum2.length; i++) {
			arNum2[i] = 10-i;
			
			System.out.println(arNum2[i]);
			
			
		}

}
}
