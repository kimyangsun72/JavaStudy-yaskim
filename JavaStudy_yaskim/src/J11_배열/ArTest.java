package J11_배열;

import java.net.StandardSocketOptions;
import java.util.Scanner;

public class ArTest {

	public static void main(String[] args) {
		// 1동
		// 1호, 2호, 3호
		
		int [] ho = new int[3];
		int sum = 0;
		double avg = 0.0;
		
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < ho.length; i++) {
			System.out.println(i+1 + "호 월세를 입력하세요(단위 : 만원)");
			ho[i] = sc.nextInt();
			sum +=ho[i];
			
		//	System.out.println(ho[i]);
			
		}
		System.out.println("1동 총 월세 :" + sum + "만원");
		avg = Double.parseDouble(String.format("%.2f" , (double)sum/ho.length));
		System.out.printf("평균 월세:" + avg + "만원");
	}

}
