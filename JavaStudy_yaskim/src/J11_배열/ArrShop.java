package J11_배열;

import javax.swing.JOptionPane;

public class ArrShop {
	/*
	 * 나이키
	 * 강남점, 홍대점, 명동점
	 * 키즈, 성인
	 * 강남점K, 홍대점K, 명동점K
	 * 강남점A, 홍대점A, 명동점A
	 * 
	 * 
	 * 
	 * 
	 */

	public static void main(String[] args) {
		int [][] arrIncome = new int[2][3];
		int[] arASum = new int[2];
		int[] arBSum = new int[3];
		int sum = 0;
		double [] aAvg = new double[2];
		double [] bAvg = new double[3];
		double  avg = 0.0;
		
		
		String[][] arrName = {  // 연령별, 지점별
				{"강남점A", "홍대점A", "신촌점A"},
				{"강남점K", "홍대점K", "신촌점K"}
		};
		
		String inputMsg ="매출액을 입력하세요.";
		
		for(int i= 0; i <arrIncome.length; i++) {
			
			for(int j=0; j<arrIncome[0].length; j++) {
				
				arrIncome[i][j]=Integer.parseInt(JOptionPane.showInputDialog(arrName[i][j] + inputMsg));
				arASum[i] += arrIncome[i][j];
				arBSum[j] += arrIncome[i][j];
				sum += arrIncome[i][j];
				
			}
		}
		
		
		

	}

}
