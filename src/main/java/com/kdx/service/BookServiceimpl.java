package com.kdx.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.kdx.mapper.BookMapper;
import com.kdx.pojo.Book;

@Service
public class BookServiceimpl implements BookService{

	@Autowired
	private BookMapper bookMapper;
	
	@Override
	public Map<String, Object> ShowBook(Book book, Integer page, Integer rows) {
	
		//需要分页
		PageHelper.startPage(Integer.valueOf(page), Integer.valueOf(rows));
		List<Book> list = bookMapper.showbook(book);
		int pageNum = ((Page) list).getPageNum();
		int pages = ((Page) list).getPages();
		long total = ((Page) list).getTotal();
		System.out.println("当前页：" + pageNum);
		System.out.println("当条数：" + total);
		Map<String, Object> map = new HashMap<>();
		map.put("total", total);
		map.put("rows", list);
		return map;
	}

}
