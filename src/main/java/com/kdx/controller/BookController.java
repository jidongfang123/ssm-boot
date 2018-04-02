package com.kdx.controller;

import java.util.Map;

import javax.validation.constraints.NotNull;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.kdx.pojo.Book;
import com.kdx.service.BookService;

@Controller
public class BookController {

		@Autowired
		private BookService bookService;
		
		
		@RequestMapping(value = "selectbook")
		String selectbook() {
			return "main";
		}
		
		
		@RequestMapping(value = "ShowBook")
		@ResponseBody
		Map<String , Object> ShowBook(Book book,@NotNull Integer page,@NotNull Integer rows){
			return bookService.ShowBook(book,page,rows);
			
		}
}
