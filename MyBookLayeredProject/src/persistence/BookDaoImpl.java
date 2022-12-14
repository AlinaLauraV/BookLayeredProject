package persistence;

import java.util.Collection;
import java.util.List;

import database.BookDataBase;
import entity.Book;

public class BookDaoImpl implements BookDao {

	
	
	@Override
	public Collection<Book> getAllRecords() {
		return BookDataBase.getBookList().values();
	}

	@Override
	public Book searchRecord(int id) {
		return BookDataBase.getBookList().get(id);
		
	}

	@Override
	public Book insertRecord(Book book) {
		return BookDataBase.getBookList().put(book.getBookId(), book);
	}

	

}