package member.service;

import java.util.Scanner;

public class MemberServiceMain3 {
	public static void main(String[] args) {
		MemberService3 service = new MemberService3("홍길동", "1234");
		
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			// 사용자로부터 id/pw를 입력받는다.
			System.out.println("id : ");
			String id = scan.next();
			System.out.println("pw : ");
			String pw = scan.next();
			// ==========================
			
			boolean res = service.login(id, pw);
			if(res) {
				System.out.println("환영합니다.");
				break;
			} else {
				System.out.println("id/pw가 일치하지 않습니다.");
			}
		}
		
		System.out.println("로그아웃을 하시하면 q를 입력해주세요.");
		
		String exit = scan.next();
		
		if("q".equals(exit)) {
			System.out.println("로그아웃 되었습니다.");
			System.exit(0);
		} else {
			System.out.println("인식할 수 없는 키입니다.");
		}
	}

}
