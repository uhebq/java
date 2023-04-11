package com.library;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.library.dao.FileDao;
import com.library.vo.Book;

public class App {
	static Scanner scan = new Scanner(System.in);
	// 2. 메인메서드 만들고
	public static void main(String[] args) {

		// 14. 도서를 리스트에 추가하기 실행
		// 라이브러리 생성
		Library lib = new Library("DB");
		// app를 생성하지 않고 getString(), getInt() 메서드를 사용할 수 없다.
		// main 메소드는 static 메소드 정적메서드
		// 정적필드에서는 인스턴스 필드를 사용할 수 없어서
		// 생성하고 사용해야 합니다.
		
		// 또는 getString(), getInt()를 정적 멤버로 만들어 줍니다.
		App app = new App();
//		app.getInt();
		
		// 17. 로그인 만들기
		while(true) {
			// 로그인
			// id를 입력 받아서 admin이면 관리자 아니면 사용자
			System.out.println("id : ");

			// 자주 사용하는 로직은 메서드로 빼서 만들면 코드가 간결해집니다.
			// 스캐너로부터 입력을 받아서 리턴해주는 역할
			String id = getString();
			if(id.equalsIgnoreCase("q")) {
				System.err.println("프로그램을 종료합니다.");
				System.exit(0); // 0이면 정상종료
			}
			outter:
			if(id.equalsIgnoreCase("admin")) {
				System.out.println("관리자 메뉴입니다.");
				// 관리자 메뉴 반복 시작
				while(true) {
					System.out.println("1. 도서등록 2. 도서삭제 0. 로그아웃 q. 종료");
					System.out.println("메뉴를 입력해주세요.");
					// 20. 로직만들기
					// 메뉴를 입력 받습니다.
					int menu = getInt();
					
					switch (menu) {
					case 1:
						// 일련번호
						System.out.println("일련번호를 입력해주세요.");
						int no = getInt();
						// 도서명
						System.out.println("제목을 입력해주세요.");
						String title = getString();
						// 작가
						System.out.println("작가를 입력해주세요.");
						String author = getString();
						
						lib.insertBook(no, title, author, false);
						break;
						
					case 2:
						System.out.println("삭제할 일련번호를 입력해주세요.");
						no = getInt();
						lib.deleteBook(no);
						break;
					
					case 0:
						System.out.println("로그아웃 되었습니다.");
						break outter;
						
					default:
						System.out.println(menu + "는 없는 메뉴입니다.");
						break;
					}
				} // 관리자 메뉴 반복 끝
				
			} else {
				System.out.println(id + "님 환영합니다.");
				// 사용자 메뉴 반복 시작
				while(true) {
					System.out.println("1. 도서대여 2. 도서반납 0. 로그아웃 q. 종료");
					int menu = getInt();
					switch (menu) {
					case 1:
						System.out.println("대여할 항목을 입력해주세요.");
						int no = getInt();
						lib.rentBook(no);
						break;
					case 2:
						System.out.println("반납할 항목을 입력해주세요.");
						no = getInt();
						lib.returnBook(no);
						break;
					case 0:
						System.out.println("로그아웃 되었습니다.");
						break outter;
						
					default:
						System.out.println(menu + "는 없는 메뉴입니다.");
						break;
					}
					
				} // 사용자 메뉴 반복 끝
				
			}
		}
		
		
		// admin - 책 등록, 책 삭제
		// 사용자 - 책 대여, 책 반납
		
		// 책 추가
//		lib.insertBook(4, "불편한편의점", "나카사키", false);
//		lib.insertBook(1, "불편한편의점", "나카사키", false);
		
//		System.out.println(lib.toString());
		
		// 책 삭제
//		int no=0;
//		boolean res = false;
//		res = lib.deleteBook(4);
//		System.out.println(lib.toString());
		// = System.out.println(lib);
		// 15. 책 대여
		
//		boolean res = false;
//		res = lib.rentBook(2);
//		System.out.println(lib.toString());

		// 16. 책 반납
//		boolean res =  false;
//		res = lib.returnBook(2);
//		System.out.println(lib.toString());
		
		// 12. 도서를 등록하고 실행
//		FileDao dao = new FileDao();
//		List<Book> list = new ArrayList<>();
//		list.add(new Book(3, "오늘도", "우리는", false));
//		dao.listToFile(list);
		
		// 9. 
//		Library lib = new Library();
		
		
		// 7. 만든 리스트를 테스트
//		FileDao dao = new FileDao();
//		List<Book> list = dao.getlist();
//		for(Book book : list) {
//			System.out.println(book.toString());
//		}
				
	}

	// 18. 로그인시 숫자 입력하면 재입력을 요청하기
	/**
	 * 사용자로부터 입력받은 문자열을 반환합니다.
	 * 숫자가 입력될 경우 다시 입력을 요청
	 * Q, q가 입력될 경우 프로그램 종료
	 * @return
	 */
	
	public static String getString(){
		String str = "";
		while(true) {
			try {
				str = scan.next();
				// Q, q 입력되었으면 프로그램 종료
				if(str.equalsIgnoreCase("Q")) {
					System.out.println("프로그램을 종료합니다.");
					System.exit(0);
				}
				// 숫자로 변환시 숫자로 변경되면 문자를 입력해달라고 다시요청
				Integer.parseInt(str);
				System.err.println("문자를 입력해주세요.");
			} catch (Exception e) {
				// 문자가 입력된 경우 반복문 탈출
				break;
			}
		}
		return str;
	}
	
	// 19. 메뉴 선택시 문자 입력하면 재입력을 요청하기
	/**
	 * 사용자로부터 정수를 입력받아 반환합니다.
	 * 문자가 입력되었을 경우 다시 입력받습니다.
	 * Q, q가 입력되었을 경우 프로그램을 종료합니다.
	 * @return
	 */
	public static int getInt() {
		int i = 0;
		String str = "";
		while(true) {
			try{
				// 사용자 입력받기
				str = scan.next();
				// Q인지 확인하기
				if("q".equalsIgnoreCase(str)) {
					System.out.println("프로그램을 종료합니다.");
					System.exit(0);
				}
				// 숫자로 변환하기
				i = Integer.parseInt(str);
				break;
			} catch (Exception e) {
				// 오류가 발생시 다시 사용자 입력으로
				System.out.println("숫자를 입력해주세요.");
			}
		}
		return i;
	}
}
