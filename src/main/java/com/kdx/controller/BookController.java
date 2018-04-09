package com.kdx.controller;

import java.util.Map;

import javax.validation.constraints.NotNull;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.kdx.pojo.Book;
import com.kdx.pojo.Detailed;
import com.kdx.service.BookService;
import com.kdx.service.UserService;

@Controller
public class BookController {

		@Autowired
		private BookService bookService;
		@Autowired
		private UserService userService;
		
		
		@RequestMapping(value = "selectbook")
		String selectbook() {
			return "main";
		}
		
		
		@RequestMapping(value = "ShowBook")
		@ResponseBody
		Map<String , Object> ShowBook(Book book,@NotNull Integer page,@NotNull Integer rows){
			return bookService.ShowBook(book,page,rows);
		}
		@RequestMapping(value ="showDetailed")
		@ResponseBody
		Map<String ,Object> showDetailed(Detailed detailed,Integer page ,Integer rows){
			return userService.showDetailed(detailed, page,rows);
		}
}
