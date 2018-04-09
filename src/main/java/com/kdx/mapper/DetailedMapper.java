package com.kdx.mapper;

import java.util.List;

import com.kdx.pojo.Detailed;

public interface DetailedMapper {
	  
	  int insertDetailed(List<Detailed> detailed);

	List<Detailed> showDetailed(Detailed detailed);

	
}