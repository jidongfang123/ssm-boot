package com.kdx.service;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.kdx.mapper.UserMapper;
import com.kdx.pojo.User;


@Service("userService")
public class UserServiceiml implements UserService {

	@Resource
	private UserMapper Userdao;
	
	  
    @Override  
    public List<User> getUserForExcel(User user) {  
        List<User> list = Userdao.getUserForExcel(user);  
        Integer order;  
        for (int i = 0; i < list.size(); i++) {  
            order = i + 1;  
            list.get(i).setOrder(order.toString());  
            if (list.get(i).getStudentsex().equals("1")) {  
                list.get(i).setStudentsex("��");  
            } else {  
                list.get(i).setStudentsex("Ů"); 
            }  
        }  
        return list;  
    }


    @Override
	public int insertStudentlist(List<User> userlist) {
		// TODO Auto-generated method stub
		int count=Userdao.insertStudentlist(userlist);
		return count;
	}  


    

}
