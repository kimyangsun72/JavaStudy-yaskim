package J22_람다식;

public class Main {
// 람다식은 하나의 메소드만 허용한다
	public static void main(String[] args) {
		Math2 m2_1 = new Math2Impl();
		Math2 m2_2 = new Math2() {
			
			@Override
			public double calc(double value1, double value2) {
				value1 += 2;
				value2 -= 1;
				
				return value1 * value2;
			}
		
		};
		// 결과가 return 밖에 없을 때 중괄호 ({}) 생략(return만 있을 때)
		Math2 m2_3 = (v1, v2) -> v1 / v2; // <- return 역할을 한다
		
		Math2 m2_4 = (v1, v2) -> {
			v1 += 2;
			v2 -= 1;
			
			return v1 % v2;
			} ; // 메소드 용 중괄호{}
	
		double t = m2_3.calc(10, 3);
		System.out.println();
	
			
		

	}
}
