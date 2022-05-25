package J09_접근지정자;

import J09_접근지정자.a.Student;
import J09_접근지정자.b.Teacher;

public class UserMain {

	public static void main(String[] args) {
		 Student student = new Student();
		 Teacher teacher = new Teacher();
		 
		 student.setName("김양선");  // 값을 넣을 때 부탁하여 매개변수로 활용함
		 System.out.println(student.getName()); // 값을 리턴만 하면됨
		 
		 teacher.setName("김양선");
		 teacher.setAddress("부산");
		 teacher.setPhone("010");
		 teacher.showInfo();
	}

}
