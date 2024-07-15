package com.srivath.mtm.dao.impl;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.srivath.mtm.dao.BooksDao;
import com.srivath.mtm.entities.Book;

public class BooksDaoImpl implements BooksDao {
	private EntityManagerFactory factory = Persistence.createEntityManagerFactory("test");

	@Override
	public void saveBook(Book book) {
		EntityManager em = factory.createEntityManager();
		EntityTransaction txn = em.getTransaction();
		txn.begin();
		try {
			em.merge(book);
			txn.commit();
			System.out.println("Book entity persisted");
		} catch (Exception e) {
			txn.rollback();
			System.out.println("Error in persisting");
			e.printStackTrace();
		} finally {
			em.close();
		}
	}

	@Override
	public Book getBook(Integer bookId) {
		EntityManager em = factory.createEntityManager();
		Book book = em.find(Book.class, bookId);
		em.close();
		return book;
	}

	@Override
	public void deleteBook(Integer bookId) {
		EntityManager em = factory.createEntityManager();
		EntityTransaction txn = em.getTransaction();
		Book book = em.find(Book.class, bookId);
		txn.begin();
		try {
			em.remove(book);
			txn.commit();
			System.out.println("Book entity removed");
		} catch (Exception e) {
			txn.rollback();
			System.out.println("Error in removing");
			e.printStackTrace();
		} finally {
			em.close();
		}
	}

}
