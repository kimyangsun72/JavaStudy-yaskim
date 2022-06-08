package J20_컬렉션.HashMap;

import java.util.HashMap;
import java.util.Iterator;

public class HashMapEx {

	public static void main(String[] args) {
		HashMap<Integer, String> studentMap = new HashMap<Integer, String>();
		
		// 값 추가,, Key 값은 중복되지 않음. 마지막 값으로 덮어씀, 순서도 없다. Key 값이 다르면 중복으로 들어감
		studentMap.put(2022000, "김양선");
		studentMap.put(2022001, "김양이");
		studentMap.put(2022002, "김양삼");
		studentMap.put(10, "김양사");
		studentMap.put(2022004, "김양오");
		studentMap.put(22, "김양육");
		
		System.out.println(studentMap);
		
		// key로v alue 가져오기
		System.out.println(studentMap.get(2022000)); // 인덱스가 아니라 key값임
		
		studentMap.put(10, "김양육"); //값을 추가
		studentMap.replace(10, "배치석"); // 수정만 원하는 경우
		
		studentMap.remove(10);
		
		Iterator<Integer> iterator = studentMap.keySet().iterator(); // 줄세움
		while(iterator.hasNext()) {
			Integer key = iterator.next();
			String value = studentMap.get(key);
//			if(value.equals("김양선")) {
//				System.out.println(studentMap.get(key));
//			}
			System.out.println(value);
		}
		
		
		// (k, v)를 한셑씩 하나씩 가져와서, 중괄호 안에서 사용한다.
		// 람다식(함수형 프로그래밍)
		studentMap.forEach(                  // 함수명이 없으므로 익명함수(void생략)라 함
				(k, v) -> {                 // 메소드 안에 중괄호 ==> 람다식
			System.out.println("key:"+ k);
			System.out.println("value:"+ v);
			}
				);

		 	System.out.println(studentMap.containsKey(22));
		 	System.out.println(studentMap.containsValue("김양육"));
}
}
