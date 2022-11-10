package database;

import java.util.LinkedHashMap;
import java.util.Map;

import entity.Book;


public class BookDataBase {

	static private Map<Integer, Book> bookList=new LinkedHashMap<Integer, Book>();
	
	
	static {
		bookList.put(101, new Book(101, "AAAA", "BBB", 12000));
		bookList.put(102, new Book(102, "CCC", "DDDD", 93000));
		bookList.put(103, new Book(103, "EEE", "FFFF", 18000));
		
		
	}

	public static Map<Integer, Book> getBookList() {
		return bookList;
	}
	
	
}
