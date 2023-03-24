package member.service;

import java.util.Scanner;

public class MemberServiceMain2 {

	public static void main(String[] args) {
		MemberService2 service2 = new MemberService2("홍길동", "12345");
		
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			System.out.println("아이디를 입력해주세요.");
			String id = scan.next();
			System.out.println("비밀번호를 입력해주세요.");
			String password = scan.next();
			
			int i=0;
			boolean res = service2.login(id,password);
			if(res) {
				System.out.println(service2.id+"님 환영합니다.");
				service2.logout("");
				break;
				
			} else {
				System.out.println("아이디 또는 비밀번호가 일치하지 않습니다.");
				i++;
				if(i>5) {
					System.out.println("시스템을 종료합니다.(비밀번호 불일치 5회 초과)");
					System.exit(0);
				}
			}
		}
		
	}

}
