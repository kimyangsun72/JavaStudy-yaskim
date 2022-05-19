package J06_반복;

public class While01 {

	public static void main(String[] args) {
	// System.out.println(1+2+---+100);
		
		int i = 0;
		int result = 0;
		
		
		while(i<100) {   // i는 0, true일때만 중괄호 실행을 반복한다, 참이 아닐때 반복 멈춤
	
	/*		i = i+1;
		i+=1;  // 2, 3... 씩 증가 가능한 식 ,, 그러나 반복은 거의 1씩 증가함
		i++;  //무조건 1씩 증가,, 후증가(보통 자주 사용함)
		++i;  // 선증가 ( 
		*/
			
			
		
		result = result + (i+1); // i++ 적용 가능함(0부터 시작), ++i는 선증가로 1부터 대입됨
		i++;					// 마지막에 붙이면 1부터 시작하는 결과됨,, 조건 변화 수식
		
	}
		System.out.println(result);

}
}