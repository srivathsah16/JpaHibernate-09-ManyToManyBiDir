package com.srivath.mtm.test;

import java.util.Arrays;
import java.util.List;

import com.srivath.mtm.dao.BooksDao;
import com.srivath.mtm.dao.impl.BooksDaoImpl;
import com.srivath.mtm.entities.Author;
import com.srivath.mtm.entities.Book;

public class Tester {
	public static void main(String[] args) {

		BooksDao booksDao = new BooksDaoImpl();

		/*
		 * call saveBook()
		 */
		
		
		
		// creating book instances
//		Book b1 = new Book();
//		b1.setBookId(3001);
//		b1.setBookName("Hibernate JPA");
//
//		Book b2 = new Book();
//		b2.setBookId(3002);
//		b2.setBookName("SpringBoot Essentials");
//
//		Book b3 = new Book();
//		b3.setBookId(3003);
//		b3.setBookName("AWS Essentials");
//
//		
//		//creating author instances
//		 
//		Author a1 = new Author();
//		a1.setAuthorId(101);
//		a1.setAuthorName("Shekar");
//
//		Author a2 = new Author();
//		a2.setAuthorId(102);
//		a2.setAuthorName("Ashok");
//
//		Author a3 = new Author();
//		a3.setAuthorId(103);
//		a3.setAuthorName("Ramesh");
//
//		List<Author> lst_of_Authors_of_book1 = Arrays.asList(a1, a3);
//		List<Author> lst_of_Authors_of_book2 = Arrays.asList(a1, a2, a3);
//		List<Author> lst_of_Authors_of_book3 = Arrays.asList(a2, a3);
//
//		b1.setAuthors(lst_of_Authors_of_book1);
//		b2.setAuthors(lst_of_Authors_of_book2);
//		b3.setAuthors(lst_of_Authors_of_book3);
//		
//		booksDao.saveBook(b1);
//		booksDao.saveBook(b2);
//		booksDao.saveBook(b3);
	
		

		/*
		 * call getBook()
		 */
		
		
//		Book bookFromDB = booksDao.getBook(3001);
//		System.out.println("Book Id : " + bookFromDB.getBookId() + "\n" + "Book name : " + bookFromDB.getBookName());
//		List<Author> authors=bookFromDB.getAuthors();
//		authors.forEach(System.out::println);
		
		
		/*
		 * call removeBook()
		 */
		
//		booksDao.deleteBook(3001);
		
	}

}
