package member.service;

public class MemberService2 {
	public String id;
	public String password;
	
	// 생성자
	public MemberService2(String id,String password) {
		this.id = id;
		this.password = password;
	}
	// 로그인
	public boolean login(String id,String password) {
		// id, pw 필드의 값과 비교하여 일치하면 true, 아니면 false
		// this.id : 필드
		// id : 매개변수
		
		if(this.id.equals(id)
				&& this.password.equals(password)) {
			return true;
		}
		return false;
	}
		
	
	// 로그아웃
	// id님이 로그아웃 하셨습니다. 메시지 출력
	public void logout(String id) {
		
	}
	
}
