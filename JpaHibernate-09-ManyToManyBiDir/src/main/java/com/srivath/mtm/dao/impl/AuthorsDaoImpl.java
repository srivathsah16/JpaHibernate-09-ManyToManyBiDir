package com.srivath.mtm.dao.impl;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.srivath.mtm.dao.AuthorsDao;
import com.srivath.mtm.entities.Author;

public class AuthorsDaoImpl implements AuthorsDao {
	private EntityManagerFactory factory = Persistence.createEntityManagerFactory("test");

	@Override
	public void saveAuthor(Author author) {
		EntityManager em = factory.createEntityManager();
		EntityTransaction txn = em.getTransaction();
		try {
			txn.begin();
			em.persist(author);
			txn.commit();
			System.out.println("Author persisted");
		} catch (Exception e) {
			txn.rollback();
			System.out.println("Error while persisting author " + e);
		} finally {
			em.close();
		}
	}

	@Override
	public Author getAuthor(Integer authorId) {
		EntityManager em = factory.createEntityManager();
		Author author = em.find(Author.class, authorId);
		em.close();
		return author;
	}

	@Override
	public void deleteAuthor(Integer authorId) {
		EntityManager em = factory.createEntityManager();
		Author author = em.find(Author.class, authorId);
		EntityTransaction txn = em.getTransaction();
		try {
			txn.begin();
			em.remove(author);
			txn.commit();
			System.out.println("Author removed");
		} catch (Exception e) {
			txn.rollback();
			System.out.println("Error while removing author " + e);
		} finally {
			em.close();
		}
	}
}
