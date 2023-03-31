package com.library;

import java.util.ArrayList;

import java.util.List;

public class Library_bk {
	
	List<Book> bookList = new ArrayList<>();
	public Library_bk() {
		
	}
	public Library_bk(List<Book> bookList) {
		this.bookList = bookList;
	}
	/**
	 * 책 추가
	 * @param title
	 * @param author
	 */
	public void addBook(String title, String author) {
		Book book = new Book(title, author);
		bookList.add(book);
	}
	@Override
	public String toString() {
		String res = "";
		for(Book book : bookList) {
			res += book.getTitle() + "/" 
		+ book.getAuthor() + "/" + book.IsRent() + "/n";
		}
		return super.toString();
	}
}
