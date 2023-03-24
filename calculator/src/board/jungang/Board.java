package board.jungang;

public class Board {
	// 제목
	String title;
	// 내용
	String content;
	// 작성자
	String writer;
	// 작성일
	String date;
	// 조회수
	int hitcount;
	
	// 클래스 이름과 동일하다
	// 반환타입이 없다
	public Board(String title, String content) {
		this(title,content,"로그인한 회원아이디", "현재 컴퓨터 날짜", 0);
		this.title = title;
		this.content = content;
		this.writer = "로그인한 회원아이디";
		this.date = "현재 컴퓨터 날짜";
		this.hitcount = 0;
		
	}
	
	public Board(String title, String content, String writer,
					String date, int hitcount){
		this.title = title;
		this.content = content;
		this.writer = writer;
		this.date = date;
		this.hitcount = hitcount;
	}
}