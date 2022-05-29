package J10_클래스기본정리.repository;

/*
 * Entity(독립체) Class 
 * 
 * 정보를 담는 객체를 Entity 객체라고 한다
 * 
 * 
 */

public class User {
	private String usercode;  // class 내의 변수는 무조건 private -> getter 가져와서  setter 넣어주는 방식 채택
	private String email;
	private String name;
	private String username;
	private String password;
	
	// 기본생성자
	//전체생성자
	// getter
	// setter
	//toString
	
	// 기본생성자
	public User() {
		
		
	}

	//전체생성자	
	public User(String usercode, String email, String name, String username, String password) {
		super();
		this.usercode = usercode;
		this.email = email;
		this.name = name;
		this.username = username;
		this.password = password;
	}

	// getter & setter - 변수만을 위해 만든것, 변수(정보)가 핵심
	public String getUsercode() {
		return usercode;
	}

	public void setUsercode(String usercode) {
		this.usercode = usercode;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override //상속과 관련있음
	public String toString() {
		return "User [usercode=" + usercode + ", email=" + email + ", name=" + name + ", username=" + username
				+ ", password=" + password + "]";
	}
	
	
	
	
}
