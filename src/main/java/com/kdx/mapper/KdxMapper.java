package com.kdx.mapper;

import java.util.List;

import com.kdx.pojo.Kdx;

public interface KdxMapper {

	int insertSelective(List<Kdx> kdxlist);

}