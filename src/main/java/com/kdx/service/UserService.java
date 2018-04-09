package com.kdx.service;

import java.util.List;
import java.util.Map;

import com.kdx.pojo.Detailed;
import com.kdx.pojo.Kdx;


public interface UserService {



	   int insertSelective(List<Kdx> kdxlist);

	   int insertDetailed(List<Detailed> detailed);

	Map<String, Object> showDetailed(Detailed detailed, Integer page, Integer rows);


}
