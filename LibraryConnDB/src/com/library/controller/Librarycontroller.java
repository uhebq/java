package com.library.controller;

import java.util.Scanner;

import com.library.service.BookService;
import com.library.service.MemberService;
import com.library.vo.BookVo;

// 11.
public class Librarycontroller {
	BookService bookService = new BookService();
	// 16.
	MemberService memberService = new MemberService();
	// 16. 끝
	public void start() {
		System.out.println("====================");
		System.out.println("도서관에 오신걸 환영합니다.");
		System.out.println("====================");
		
		// 13. 로그인 요청
		
		MemberVo memberVo = login();
		
		bookService.getlist();
		
		if("Y".equalsIgnoreCase(memberVo.getAdminYN())) {
			// 관리자 계정
			adminMenu();
		} else {
			// 사용자 계정
			userMenu();
		}
		
	}
	

	private void adminMenu() {
		Outter:
		while(true) {
			
			System.out.println("관리자 메뉴=============");
			System.out.println("1. 도서등록 2. 도서삭제 3. 사용자등록 4. 사용자삭제 0. 이전메뉴 q. 종료");
			
			System.out.println("메뉴를 입력해주세요.");
			int menu = getInt();
			// 일련번호
			int bookNo = 0;
			String id = "";
			// 17.
			switch (menu) {
			case 1:
				// 도서 등록
				System.out.println("도서 일련번호를 입력해주세요.");
				bookNo = getInt();
				System.out.println("도서명을 입력해주세요.");
				String title = getString();
				System.out.println("작가를 입력해주세요.");
				String author = getString();
				
				int res = bookService.insertBook(new BookVo(bookNo,title,author,"N"));
				
				break;
			case 2:
				// 도서 삭제
				System.out.println("삭제할 도서의 일련번호를 입력해주세요.");
				bookNo = getInt();
				bookService.deleteBook(bookNo);
				break;
			case 3:
				// 사용자 등록
				System.out.println("아이디를 입력하세요.");
				id = getString();
				System.out.println("비밀번호를 입력하세요.");
				String pw = getString();
				System.out.println("이름을 입력하세요.");
				String name = getString();
				System.out.println("관리자계정은 Y를 입력해주세요.");
				String adminYNstr = getString();
				String adminYN = adminYNstr.equalsIgnoreCase("Y")?"Y":"N";

				MemberVo memberVo = new MemberVo(id, pw, name, "N");
				memberService.insertMember(memberVo);
				break;
			case 4:
				System.out.println("삭제할 id를 입력해주세요.");
				id = getString();
				
				memberService.deleteMember(id);
			
				break;
			case 0:
				
				break Outter;
			default :
				System.out.println("메뉴를 확인 후 다시 입력해주세요.");
				break;
				
			}
		}
		
	}
	private void userMenu() {
		
		while(true) {
			
			System.out.println("사용자 메뉴=============");
			System.out.println("1. 도서대여 2. 도서반납 0. 이전메뉴 q. 종료");
			int menu = getInt();
			int bookNo = 0;
			switch (menu) {
			case 1:
				System.out.println("대여할 도서의 일련번호를 입력해주세요.");
				bookNo = getInt();
				bookService.rentBook(bookNo);
				break;
			case 2:
				System.out.println("반납할 도서의 일련번호를 입력해주세요.");
				bookNo = getInt();
				bookService.returnBook(bookNo);
				break;
			case 0:
				
				break;
			default :
				System.out.println("메뉴를 확인 후 다시 입력해주세요.");
				break;
				
			}
		}
	}
	
	/**
	 * 로그인
	 * ID/PW를 입력받아서 일치하는 고객이 있는지 확인
	 * @return
	 */
	// 13. MemberVo 클래스 생성
	public MemberVo login() {
		// 16-2.
		
		while(true) {
			System.out.println("아이디를 입력해주세요.");
			String id = getString();
			System.out.println("비밀번호를 입력해주세요.");
			String pw = getString();
			
			MemberVo memberVo = memberService.login(id, pw);
			if(memberVo != null) {
				// 로그인 성공
				return memberVo;
			
			}
		}
	}
	
	public static Scanner scan = new Scanner(System.in);
	public static String getString() {
		String str = "";
		str = scan.next();
		if(str.equalsIgnoreCase("q")) {
			// q, Q가 입력되면 종료
			System.exit(0);
		}
		
		return str;
	}
	
	public static int getInt() {
		int i = 0;
		
		while(true) {
			
			try {
				String str = scan.next();
				if(str.equalsIgnoreCase("q")) {
					// q, Q가 입력되면 종료
					System.exit(0);
				}
			
				i = Integer.parseInt(str);
				return i;
				
			} catch (Exception e) {
				System.out.println(e.getMessage());
				System.out.println("숫자 입력 중 오류가 발생하였습니다.");
				}
		
		}
	}

}
