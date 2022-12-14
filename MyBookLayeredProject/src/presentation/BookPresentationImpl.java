package presentation;

import java.util.Collection;
import java.util.Scanner;

import entity.Book;
import service.BookService;
import service.BookServiceImpl;

public class BookPresentationImpl implements BookPresentation {

	
	private BookService bookService;
	
	
	public void setBookService(BookService bookService) {
		this.bookService = bookService;
	}

	@Override
	public void showMenu() {
		System.out.println("===========================");
		System.out.println("1. List All Books");
		System.out.println("2. Search Book By ID");
		System.out.println("3. Add New Book");
		System.out.println("4. Exit");
		System.out.println("============================");

	}

	@Override
	public void performMenu(int choice) {
		Scanner scanner=new Scanner(System.in);
		switch (choice) {
		case 1:
			Collection<Book> book=bookService.getAllBooks();
			for(Book bk:book) {
				System.out.println(bk);
			}
			break;
		case 2:
			System.out.println("Enter Book ID : ");
			int id=scanner.nextInt();
			Book books=bookService.searchBookById(id);
			if(books!=null)
				System.out.println(books);
			else
				System.out.println("Book with id "+id+" doesnot exist");
			break;
		case 3:
			Book newBook=new Book();
			
			System.out.println("Enter Book id : ");
			newBook.setBookId(scanner.nextInt());
			System.out.println("Enter Book Title : ");
			newBook.setBookName(scanner.next());
			System.out.println("Enter Book author's name : ");
			newBook.setAuthorName(scanner.next());;
			System.out.println("Enter book number of copies: ");
			newBook.setNoOfCopies(scanner.nextDouble());
			
			if(bookService.addBook(newBook))
				System.out.println("Book Record Added");
			else
				System.out.println("Book with id "+newBook.getBookId()+" already exist, so cannot add it as a new book!");
			
			break;
		
		case 4:
			System.out.println("Thank you!");
			System.exit(0);
		default:
			System.out.println("Invalid Choice!");
			break;
		}

	}

}
