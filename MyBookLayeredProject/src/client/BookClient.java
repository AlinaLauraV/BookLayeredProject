package client;

import java.util.Scanner;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import presentation.BookPresentation;


public class BookClient {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		

		AnnotationConfigApplicationContext springContainer=new AnnotationConfigApplicationContext(BookConfiguration.class);
		
		BookPresentation bookPresentation=(BookPresentation)springContainer.getBean("bPresentation");
		while(true) {
			bookPresentation.showMenu();
			System.out.println("Enter Choice : ");
			int choice=scanner.nextInt();
			bookPresentation.performMenu(choice);
		}

	}

}
