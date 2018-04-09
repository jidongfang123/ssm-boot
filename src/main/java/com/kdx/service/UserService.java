package com.kdx.service;

import java.util.List;

import com.kdx.pojo.Detailed;
import com.kdx.pojo.Kdx;


public interface UserService {



	   int insertSelective(List<Kdx> kdxlist);

	   int insertDetailed(List<Detailed> detailed);


}
