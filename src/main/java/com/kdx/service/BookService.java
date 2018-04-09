package com.kdx.service;

import java.util.Map;

import com.kdx.pojo.Book;

public interface BookService {

	Map<String, Object> ShowBook(Book book, Integer page, Integer rows);
	
}
