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
		
/*
 * 
4	조직상황
4.1	조직과 상황에 대한 이해
4.2	이해관계자의 요구화 기대에 대한 이해
4.3	정보보호경영시스템의 범위결정
4.4	정보보호경영시스템 
5	리더십
5.1	리더십과 의지
5.2	방침
5.3	조직의 역할, 책임 및 권한
6	계획
6.1	리스크와 기회에 따른 조치
6.1.1	일반사항
6.1.2	정보보호 위험성평가
6.1.3	정보보호 위험성처리(soa -적용명세서)
6.2	정보보호 목표 및 달성계획
7	지원
7.1	자원
7.2	적격성
7.3	인식
7.4	의사소통
7.5	문서정보
7.5.1	일반사항
7.5.2	생성 및 갱신
7.5.3	문서의 통제
8	운영
8.1	운영계획 및 통제
8.2	정보보호 위험성평가
8.3	정보보호 위험성처리
9	성과평가
9.1	모니터링, 측정, 분석 및 평가
9.2	내부심사
9.3	경영검토
10	개선
10.1	부적합 및 시정조치
10.2	지속적개선
A.5	보호정책
A.5.1	정보보호를 위한 경영방침
A.5.1.1	정보보호를 위한 정책
A.5.1.2	정보보호 정책의 검토
A.6	정보보호 조직
A.6.1	내부 조직
A.6.1.1	정보보호 역할 및 책임
A.6.1.2	직무 분리
A.6.1.3	관련 기관과의 연계
A.6.1.4	전문가 그룹과의 연계
A.6.1.5	프로젝트 관리에서의 정보 보호
A.6.2	모바일 기기 및 원격근무
A.6.2.1	모바일 기기 정책
A.6.2.2	원격근무
A.7	인적자원 보안
A.7.1	고용전
A.7.1.1	적격심사
A.7.1.2	고용 계약조건
A.7.2	고용 중
A.7.2.1	경영진 책임
A.7.2.2	정보보호 인식, 교육, 훈련
A.7.2.3	징계 처분
A.7.3	고용 종료 및 직무 변경
A.7.3.1	고용 책임의 종료 또는 변 경
A.8	자산 관리
A.8.1	자산에 대한 책임
A.8.1.1	자산 목록
A.8.1.2	자산 소유권 
A.8.1.3	자산 이용
A.8.1.4	자산 반환
A.8.2	정보 등급화
A.8.2.1	정보 등급화
A.8.2.2	정보 표식
A.8.2.3	자산 취급
A.8.3	매체 취급
A.8.3.1	이동식 매체 관리
A.8.3.2	매체 폐기
A.8.3.3	물리적 매체 이송
A.9	접근통제
A.9.1	접근통제 업무 요구사항
A.9.1.1	접근통제 정책
A.9.1.2	네트워크 및 네트워크 서 비스 접근통제
A.9.2	사용자 접근관리
A.9.2.1	사용자 등록 및 해지
A.9.2.2	사용자 접근 권한설정
A.9.2.3	특수 접근권한 관리
A.9.2.4	사용자 비밀 인증정보 관 리
A.9.2.5	사용자 접근권한 검토
A.9.2.6	접근권한 제거 또는 조정
A.9.3	사용자 책임
A.9.3.1	기밀 인증정보 사용
A.9.4	시스템 및 애플리케이션 접근통제
A.9.4.1	정보 접근제한
A.9.4.2	안전한 로그인 절차
A.9.4.3	패스워드 관리 시스템
A.9.4.4	특수 유틸리티 프로그램 사용
A.9.4.5	프로그램 소스코드 접근통 제
A.10	암호화
A.10.1	암호 통제
A.10.1.1	암호 통제 사용 정책
A.10.1.2	키 관리
A.11	물리적 및 환경적 보안
A.11.1	보안 구역
A.11.1.1	물리적 보안 경계
A.11.1.2	물리적 출입 통제
A.11.1.3	사무 공간 및 시설 보안
A.11.1.4	외부 및 환경 위협에 대비 한 보호
A.11.1.5	보안 구역 내 작업
A.11.1.6	배송 및 하역 구역
A.11.2	장비
A.11.2.1	장비 배치 및 보호
A.11.2.2	지원 설비
A.11.2.3	배선 보안
A.11.2.4	장비 유지보수
A.11.2.5	자산 반출
A.11.2.6	구외 장비 및 자산 보안
A.11.2.7	장비 안전 폐기 및 재사용
A.11.2.8	방치된 사용자 장비
A.11.2.9	책상 정리 및 화면보호 정 책
A.12	운영 보안
A.12.1	운영 절차 및 책임
A.12.1.1	운영 절차 문서화
A.12.1.2	변경 관리
A.12.1.3	용량 관리
A.12.1.4	개발, 시험, 운영 환경 분 리
A.12.2	악성코드 방지
A.12.2.1	악성코드 통제
A.12.3	백업
A.12.3.1	정보 백업
A.12.4	로그기록 및 모니터링
A.12.4.1	이벤트 로그기록
A.12.4.2	로그 정보 보호
A.12.4.3	관리자 및 운영자 로그
A.12.4.4	시각 동기화
A.12.5	운영 소프트웨어 통제
A.12.5.1	운영 시스템 소프트웨어 설치
A.12.6	기술적 취약점 관리
A.12.6.1	기술적 취약점 관리
A.12.6.2	소프트웨어 설치 제한
A.12.7	정보시스템 감사 고려사항
A.12.7.1	정보시스템 감사 통제
A.13	통신 보안
A.13.1	네트워크 보안 관리
A.13.1.1	네트워크 통제
A.13.1.2	네트워크 서비스 보안
A.13.1.3	네트워크 분리
A.13.2	정보 전송
A.13.2.1	정보 전송 정책 및 절차
A.13.2.2	정보 전송 협약
A.13.2.3	전자 메시지 교환
A.13.2.4	기밀유지 협약
A.14	시스템 도입, 개발, 유지보수
A.14.1	정보시스템 보안 요구사항
A.14.1.1	정보보호 요구사항 분석 및 명세
A.14.1.2	공중망 응용 서비스 보안
A.14.1.3	응용 서비스 거래 보호
A.14.2	개발 및 지원 프로세스 보안
A.14.2.1	개발 보안 정책
A.14.2.2	시스템 변경 통제 절차
A.14.2.3	운영 플랫폼 변경 후 애플 리케이션 기술적 검토
A.14.2.4	소프트웨어 패키지 변경 제한
A.14.2.5	시스템 보안 공학 원칙
A.14.2.6	개발 환경 보안
A.14.2.7	외주 개발
A.14.2.8	시스템 보안 시험
A.14.2.9	시스템 인수 시험
A.14.3	시험 데이터
A.14.3.1	시험 데이터 보호
A.15	공급자 관계
A.15.1	공급자 관계 정보보호
A.15.1.1	공급자 관계 정보보호 정 책
A.15.1.2	공급자 협약 내 보안 명시
A.15.1.3	정보통신기술 공급망
A.15.2	공급자 서비스 전달 관리
A.15.2.1	공급자 서비스 모니터링 및 검토
A.15.2.2	공급자 서비스 변경 관리
A.16	정보보호 사고 관리
A.16.1	정보보호 사고 관리 및 개선
A.16.1.1	책임 및 절차
A.16.1.2	정보보호 이벤트 보고
A.16.1.3	정보보호 약점 보고
A.16.1.4	정보보호 이벤트 평가 및 의사결정
A.16.1.5	정보보호 사고 대응
A.16.1.6	정보보호 사고로부터 학습
A.16.1.7	증거 수집
A.17	업무연속성 관리의 정보보호 측면
A.17.1	정보보호 연속성
A.17.1.1	정보보호 연속성 계획
A.17.1.2	정보보호 연속성 구현
A.17.1.3	정보보호 연속성 검증, 검 토, 평가
A.17.2	이중화
A.17.2.1	정보처리 시설 가용성
A.18	준거성
A.18.1	법적 및 계약 요구사항 준수
A.18.1.1	적용 법규 및 계약 요구사 항 식별
A.18.1.2	지적재산권
A.18.1.3	기록 보호
A.18.1.4	프라이버시 및 개인정보 보호
A.18.1.5	암호 통제 규제
A.18.2	정보보호 검토
A.18.2.1	정보보호 독립적 검토
A.18.2.2	보안 정책 및 표준 준수
A.18.2.3	기술 준거성 검토

 * 
 * 
 * 
 * 
 * 
 * 		
 */
		
		
		/*
		 * 문재현
		 * 1) 내부심사
		 * 2) 경영검토 
		 * 3) SOA(적용명세서, 6.1.3) - 적용성보고서(무결성 기밀성 가용성 )- 위험성평가 후 적용가능성을 결정함
		 *    3개 제외
		 *    위험성평가 - 자산 기준으로 위협 및 위험성을 평가함 <- 평가분류표(자산기준) 선행
		 *    리스크 관리 절차서 (통합)- 자산분류 및 관리 절차서/프로세스 <- 자사관리등록
		 *    identify, analysis, evaluate
		 *    >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
		 *    (오후)
		 *    6.1.2 위험성평가(RA - Objective - issue 심사방향 - 경영시스템 확인 심사
		 *    c. 정보보호의 위험식별- 1) 시스템범위 내의 기밀성(, 가용성, 무결성(변조, 파괴)과 연관된 위험식별 
		 *                            2) 위험 소유자의 식별
		 *    RTO 3시간 <- BIA 수행했는지? <- 유지보수 업체를 통해서 관리함(9001 8.2.2 b 서비스 요구사항을 보장)
		 *    A17. 정보보호의 연속성 -> 검증
		 *    <- 비상사태 대응훈련보고서 
		 *    RTO 복구목표시간개념, RPO(Recovery Point Objective) 마지막 복구시점 목표 - 재해발생 이전 롤백
		 *    
		 *    자산 시스템으로 거의 통제함(인적 정보보안 관리사항은 장비로 보완하고 있음, 인적관리항목 거의 없음)
		 *    
		 *    
		 *    
		 *    
		 *    
		 *    
		 *    
		 *    
		 *    
		 *    8.2 정보보안 위험평가(변경관리) -- 평가 결과를 문서정보로 보유할 것
		 * 
		 * 임창무
		 * 1) 경영검토 시 보안관련 목표 및 검토 확인 하는지?
		 * 2) 위험요인 식별 (자산의 CIA 평가 -> Top 10 위협Threat: 누락됨-씨넷) -> RA (위협에 대한 RA = 위협*빈도*심각성)
		 * RA결과를 각 자산에 반영하여 예방 및 조치방법 결정(부속서 실행 지침으로 가서 통제)- 1번 서버, 원격서버 등
		 * 관리가 필요한 Target 자산 및 취약성울 확인하여 관리항목을 선택과 집중으로 연결.
		 * 
		 * 
		 * 
		 * 2일차. 이윤한 수석 기술전문가 및 심사원보로 참여함
		 * 
		 * 씨넷 전산 흐름도
		 * 
		 *                      업무망(인터넷)
		 *                      방화벽(Anlab TrusGuard 70B)
		 *                                
		 * 개인정보보호
		 * 더존시스템 사용시 데이터 보안 - 백업관련 사항
		 * Access 통제가 가장 중요함. 
		 * 정보취급자 책임과 권한 - 취급자 명단? 개인정보취급서약서(명단으로 갈음함) 
		 * 절차서에는 누가/ 무엇을 에 대한 것이 없다 ==> 프로세스로 관리하는 게 좋다
		 * 
		 * 자산관리와 개인정보관리자도 연계해서 관리가 필요함.
		 * 자산관리대장- 유형별(그룹웨어, 시스템, 네트워크, 응용프로그램(AP), 문서, 물리적자산 ET(설비) 
		 * 자산관리대장을 만들도록 하는 지침? - 자산분류 및관리 절차서
		 * 자산관리대장 작성은 부록1 자산분류표를 참조해라.... 기록물인데 절차서에 작성방법을 정의하지 않음
		 * 체계?
		 * 예) 공정분석 - 요인 - 위협 - RA - 처리
		 * 
		 * -. 자산관리대장 및 중요도 평가(=CIA(중요도 평가)  => 자산에 대한 위협(threat)을 식별
		 * 
		 * -. 리스크(RI) 기준( 위협 threat index/ 취약점평가 vulnerability index/ 중요도평가 critical index)
		 * RI 4점이상(위험등급 2등급) 처리함.
		 * 
		 * -. 리스크영향등록부(FO-81) 기록하고 영향을 낮추는 조치를 취한다. <- 재평가해서 잔여리스크를 확인하여 효과성 확인도 고려해야함.
		 *    팀/ 공정(활동)을 기준으로 배열하고 있음(14001/45001 기준), 완화조치 칼럼이 없음
		 *    -- 리스크관리절차서, 통합하면서 서식이 표준별로 명확히 해야함. 서식은 별도로 관리하는 것이 유리할 것임
		 * -. 처리방법이 soa에 연결되어야 함
		 * 
		 *   (참고) 대상이 다르므로 통합을 모든 문구를 통합할 필요는 없음
		 *   
		 *   
		 * 개인정보관리는 ? 자산명에 대하여 활동이 개인정보관리로 통합하여 관리하고 있음
		 * <- 개인정보에 대한 부분을 별도로 평가하지 않으니 상세한 개인정보 위험성이 파악되지 않음.
		 * 
		 * 목표 및 세부목표;
		 * 9.1항 정보보호경영시스템 및 성과(우리가 추구하는 레시피대로 한 결과)의 효과성을 확인
		 * 침해사고 제로(랜섬웨어/ 그룹웨어/ 전자메일 해킹)
		 * 
		 * SEES 설명;
		 * smart environment   system - 3.0 목표 - 고객요구사항을 최종 담는 작업
		 * 고객이 원하는 정보 -> Platform화로 진화 예정
		 * 고객의 운항정보를 받아 활용할 수 있음
		 * 향후에는 Cloud 사용 예정임
		 * 
		 * 선박회사 정보만 담아주는 정도, 원격운항관련 적용 검토 중임
		 * 고객사 선박의 설비 운전 정보를 관리하는 program 
		 * 세월호 후속선들은 sees 프로그램이 설치되어 육상에서 관제할 수 있게함. 씨월드 선사 3척
		 * 
		 * 
		 * 문서:
		 * 
		 * 결론-
		 * 위험성평가 - soa(관리점-침해사고(보안사고)대응 절차서, 27003), 법(운영적)
		 * 
		 * 
		 * 임창무
		 * 안전(의도하지 않는 사고 관리)과 보안 차이점(의도적 접근)
		 * 
		 * 위험수준을 관리수준을 내려서 관리항목 확인
		 * 
		 * 기술전문가(이윤한)
		 * sees
		 * 기기가 제어하는 시대, 제품개발시 보안의 역할/ 취약점 관리가 중요함
		 * 
		 * 최근 보안 트랜드 - 기술적이 아닌 사람에 의한 랜썸웨어/ 외주업체 USB, 원격 서비스 제공시 보안침해-- 사용자 교육
		 * 
		 * 
		 */
		System.out.println(a);
		
		
		
		a = sc.nextLine();
		System.out.println("4. 조직환경:" + a);
		
		System.out.println(sc.nextLine());
	}

}
