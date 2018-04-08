package com.kdx.mapper;

import java.util.List;

import com.kdx.pojo.User;

public interface UserMapper {
    int insert(User record);

    int insertSelective(User record);
    
 
    List<User> getUserForExcel(User user);  
  
    int insertStudentlist(List<User>userlist);
}