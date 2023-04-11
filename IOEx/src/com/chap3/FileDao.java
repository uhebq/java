package com.chap3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileDao {

	public static void main(String[] args) {
		FileDao dao = new FileDao();
		dao.fileSave();
		try (BufferedReader br
					= new BufferedReader(new FileReader("bookList.txt"));){
			String str = "";
			List<Book> list = new ArrayList<>();
			
			while ((str = br.readLine()) != null) {
				String[] strArray = str.split(" ");
				int no = Integer.parseInt(strArray[0]);
				String title = strArray[1];
				String author = strArray[2];
				boolean isRent = Boolean.parseBoolean(strArray[3]);
				
				list.add(new Book(no, title, author, isRent));
			}
			System.out.println("파일로부터 읽어들인 책 정보를 출력합니다.");
			for(Book book : list) {
				System.out.println(book.toString());
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			// TODO: handle exception
		} catch (IOException e) {
			e.printStackTrace();
		
		}
		
		String str = "1/타이틀1/작가1/false";
		// 책을 생성하는데 필요한 값들을 구분자를 이용하여 배열로 반환
		// 파라메터로 입력된 구분자를 이용하여 문자열을 자르고 배열로 반환
		String[] strArray = str.split("/");
		
		// 타입 변환
		int no = Integer.parseInt(strArray[0]);
		String title = strArray[1];
		String author = strArray[2];
		boolean isRent = Boolean.parseBoolean(strArray[3]);
		Book book = new Book(no, title, author, isRent);
		System.out.println(book.toString());
		
//		split 테스트
//		int i=0;
//		for(String s : strArray) {
//			System.out.println("방번호 : " + i + " 값 : " + s);
//		}
	}
	/** 파일을 읽어서 책리스트를 생성
	 * 
	 */
	public void fileRead() {
		
		try (BufferedReader bf = 
				new BufferedReader(new FileReader("bookList.txt"));){
			String str = "";
			List<Book> list = new ArrayList<>();
			System.out.println("책 리스트 정보를 읽어옵니다.");
			while((str = bf.readLine()) != null) {
				// 공백으로 끊어서 배열에 담습니다.
				String[] strArray = str.split(" ");
				// 책을 생성할때 필요한 파라미터
				int no = Integer.parseInt(strArray[0]);
				String title = strArray[1];
				String author = strArray[2];
				boolean isreturn = Boolean.parseBoolean(strArray[3]);
				
				// 책을 생성
				Book book = new Book(no, title, author, isreturn);
				// 리스트에 담아줍니다.
				list.add(book);
			}
			System.out.println("생성된 리스트를 출력합니다.");
			for(Book book:list) {
				System.out.println(list.toString());
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		String str = "1 타이틀1 작가1 false";
		// 구분자로 끊어서 배열로 반환
		// {1, 타이틀1, 작가1, false}
		String[] strArray = str.split(" ");
		// new Book(1,"타이틀1","작가1",false);
		new Book(Integer.parseInt(strArray[0])
				, strArray[1]
				, strArray[2]
				,Boolean.parseBoolean(strArray[3]));
	}

	/**
	 * 리스트에 담겨있던 책의 정보를 출력
	 */
	public void fileSave() {
		// 데이터 생성
		List<Book> list = new ArrayList<>();
		list.add(new Book(1, "타이틀1", "작가1", false));
		list.add(new Book(2, "타이틀2", "작가2", false));
		list.add(new Book(3, "타이틀3", "작가3", false));

		// 파일 출력
		try (BufferedWriter bw
			= new BufferedWriter(new FileWriter("bookList.txt"));) {
			
			for(Book book : list) {
				// 콘솔출력
				// System.out.println(book.toString());
				bw.write(book.toString());
				bw.newLine();
			}
			bw.flush();
			
			System.out.println("파일 출력");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
