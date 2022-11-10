package service;

import java.util.Collection;

import entity.Book;
import persistence.BookDao;
import persistence.BookDaoImpl;

public class BookServiceImpl implements BookService {

	
	private BookDao bookDao;
	
	
	public BookServiceImpl(BookDao bookDao) {
		super();
		this.bookDao = bookDao;
	}

	@Override
	public Collection<Book> getAllBooks() {
		return bookDao.getAllRecords();
	}

	@Override
	public Book searchBookById(int id) {
		return bookDao.searchRecord(id);
	}

	@Override
	public boolean addBook(Book book) {
		bookDao.insertRecord(book);
		return true;
	}
}

