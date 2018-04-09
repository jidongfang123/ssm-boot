package com.kdx.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kdx.mapper.DetailedMapper;
import com.kdx.mapper.KdxMapper;
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

}
