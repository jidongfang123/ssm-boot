package com.kdx.service;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.kdx.mapper.DetailedMapper;
import com.kdx.mapper.KdxMapper;
import com.kdx.pojo.Book;
import com.kdx.pojo.Detailed;
import com.kdx.pojo.Kdx;


@Service("userService")
public class UserServiceiml implements UserService {

	@Autowired
	private KdxMapper kdxMapper;
	@Autowired
	private DetailedMapper detailedMapper;


	@Override 
	public int insertSelective(List<Kdx> kdxlist) {
			int count=kdxMapper.insertSelective(kdxlist);
			System.out.println("导入成功");
			return count;
	}


	@Override
	public int insertDetailed(List<Detailed> detailed) {
		int count = detailedMapper.insertDetailed(detailed);
		System.out.println("导入成功");
		System.out.println(count);
		return count;
	}


	@Override
	public Map<String, Object> showDetailed(Detailed detailed, Integer page, Integer rows) {
		//需要分页
				PageHelper.startPage(Integer.valueOf(page), Integer.valueOf(rows));
				List<Detailed> list = detailedMapper.showDetailed(detailed);
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
