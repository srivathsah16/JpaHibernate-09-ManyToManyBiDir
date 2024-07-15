package com.srivath.mtm.dao;

import com.srivath.mtm.entities.Author;

public interface AuthorsDao {
	void saveAuthor(Author author);

	Author getAuthor(Integer authorId);

	void deleteAuthor(Integer authorId);
}
