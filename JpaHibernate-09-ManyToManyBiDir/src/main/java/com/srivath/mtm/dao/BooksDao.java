package com.srivath.mtm.dao;

import javax.transaction.Transactional;

import com.srivath.mtm.entities.Book;

public interface BooksDao {
	void saveBook(Book book);

	Book getBook(Integer bookId);

	@Transactional
	void deleteBook(Integer bookId);

}
