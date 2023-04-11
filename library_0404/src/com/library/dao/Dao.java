package com.library.dao;

import java.util.List;
import com.library.vo.Book;

public interface Dao {
	// 파일로부터 데이터를 읽어서 리스트에 담아 반환합니다.
	// 추상메서드를 만들어 놓음
	List<Book> getList();
	boolean saveFile(List<Book> list);
}
