package com.library.vo;

// 6. 
public class BookVo {
	int bookNo;
	String title;
	String author;
	String rentYN;
	
	public BookVo(int bookNo, String title, String author, String rentYN) {
		super();
		this.bookNo = bookNo;
		this.title = title;
		this.author = author;
		this.rentYN = rentYN;
	}
	
	// 10. 
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String str = getRentYN().equals("Y")? "대여중":"";
		return getBookNo()
				+ " " + getTitle()
				+ " " + getAuthor()
				+ " " + str;
	}
	// 10.end

	public int getBookNo() {
		return bookNo;
	}

	public void setBookNo(int bookNo) {
		this.bookNo = bookNo;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAythor(String author) {
		this.author = author;
	}

	public String getRentYN() {
		return rentYN;
	}

	public void setRentYN(String rentYN) {
		this.rentYN = rentYN;
	}
}
