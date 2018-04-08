package com.kdx.service;

import java.util.List;

import com.kdx.pojo.User;


public interface UserService {


	public List<User> getUserForExcel(User user);

	int insertStudentlist(List<User> userlist);

}
