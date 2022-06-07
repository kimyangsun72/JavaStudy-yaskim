package Exercise.Interface.Controller;

import Exercise.Interface.Service.US;

public class Apic {

	private final US us;
	
	public Apic (US us) {
		this.us = us;
		
	}
	public void addUser() {
		System.out.println("사용자 추가");
		us.create();
		
	}
	public void getUser() {
		System.out.println("사용자 정보 가져오기");
		us.read();
	}
	public void modifiUser() {
		System.out.println("사용자 정보 수정");
		us.update();
	}
	public void removeUser() {
		System.out.println("사용자 삭제");
		us.delete();
	}
}
