package J21_익명클래스;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import Exercise.배열.Array;
import J20_컬렉션.ArrayList.ArrayListEx;

public class PrincipalDetailse {

	public static void main(String[] args) {
		ArrayList<String> strList = new ArrayList<String>();
		strList.add("a");
		strList.add("b");
		strList.add("c");
		strList.add("d");
		strList.add("e");
		strList.add("f");
		
		
		
		
		GrantedAuthority grantedAuthority = new GrantedAuthority() { //여기서 부터 클래스인에 이름이 없다 = 익명클래스
			                                                         // 한번 쓰고 말때 사용함
			@Override
			public Collection<String> getRoles(List<String> roles) {
				// TODO Auto-generated method stub
				return roles;
			}
		};
		GrantedAuthority grantedAuthority2 = new GrantedAuthority() { //여기서 부터 클래스인에 이름이 없다 = 익명클래스
            // 한번 쓰거 말때 사용함
			
			@Override
			public Collection<String> getRoles(List<String> roles) {

				return roles;
			}
		};

	    GrantedAuthority grantedAuthority3 = new GrantedAuthorityImp();

			grantedAuthority.getRoles(strList).forEach(r -> {System.out.println(r);});
			grantedAuthority2.getRoles(strList).forEach(r -> {System.out.println(r);});
			grantedAuthority3.getRoles(strList).forEach(r -> {System.out.println(r);});

	}

}
