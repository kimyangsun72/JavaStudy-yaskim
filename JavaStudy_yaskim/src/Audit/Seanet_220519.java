package Audit;

import java.util.Scanner;

import javax.swing.Spring;

public class Seanet_220519 {

	public static void main(String[] args) {
		/*
		 * 선박 네트워크에 관련된 업종(한신, 대양 등) 해운회사(TMSA 항목에 포함됨- 권고사항)
		 * 기자재 업체 - 육상 anti drone에 관련됨. 강제성이 없어 인증 확산에 한계 있음
		 * 시장 선도를 위해서 경쟁력확보(보안에 대한 체계 및 개선 효과) 차원에서 인증유지하고 있음
		 * 경향 - 사람이 일하는 시대는 지났다. ERP, 자동화 등등 (70% 이상이 network 시장임, 30% 제품)
		 * 
		 * 표준에 대한 적합성 점검
		 * 2단계로 초기심사 적용(LR에 이미 인증받음)
		 * 
		 * 
		 */

		Scanner sc = new Scanner(System.in);
		
		String a = null;
		String b = null;
		Spring c = null;
		
		a = "4. 조직상황" 
				+ "4.1 조직과 상황에 대한 이해"
				+ "4.2 이해당사자의 요구와 기대에 대한 이해"
				+ "4.3 정보보안경영시스템의 번위 결정"
				+ "4.4 정보보안경영시스템";
		
		System.out.println(a);
		
		
		
		a = sc.nextLine();
		System.out.println("4. 조직환경:" + a);
		
		System.out.println(sc.nextLine());
	}

}
