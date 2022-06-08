package J20_컬렉션.HashMap;

import java.util.HashMap;
import java.util.Iterator;

import J20_컬렉션.entity.Student;



public class HashMapEx3 {

	public static void main(String[] args) {
		HashMap<Integer, Student> students = new HashMap<Integer, Student>();
		students.put(20220001, new Student(20220001, "김양선", "부산대학교"));
		students.put(20220002, new Student(20220002, "김양이", "부경대학교"));
		students.put(20220003, new Student(20220003, "김양삼", "동아대학교"));
		students.put(20220004, new Student(20220004, "김재현", "경상대학교"));
		students.put(20220005, new Student(20220005, "김양오", "경북대학교"));
		
		System.out.println(students);
		
		/*
		 * 1. 이름이 김재현인 학생의 대학을 서울대학교로 변경하라.
		 * 2. 2022003 학번 학생을 2022003, "박호훈", "고려대학교"로 변경
		 * 3. 20220005 의 학생을 삭제
		 * 4. 20220002 학번 학생정보 출력
		 * 
		 */

		//1번 .. Key 값을 모르므로, key값을 확인하는 작업을 먼저함
		
		Iterator<Integer> iterator = students.keySet().iterator();
		while(iterator.hasNext()) {
			Integer key = iterator.next();
			Student student = students.get(key);
			if(students.get(key).getName().equals("김재현")) {
				student.setSchoolName("서울대학교");
				break;
			
			}
		}
		
		for(Student student : students.values()) {
			if(student.getName().equals("김재현")) {
				student.setSchoolName("서울대학교");
				break;
				
			}
			
		}
		
		students.forEach((k, v) -> {
			if(v.getName().equals("김재현")) {
				v.setSchoolName("서울대학교");  //반복문이 아니므로 break를 사용하디 않는다
				
			}
		});
	
		System.out.println(students.get(20220004));
		
		// 2.번
	
			students.replace(20220003, new Student(20220003, "박호훈", "고려대학교"));
			System.out.println(students.get(20220003));
			
			
		//3번	
			students.remove(2022005);
			
		//4번	
			
			System.out.println(students.get(20220002));
			
		
	}

}
