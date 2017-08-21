package com.ssm.service.Impl;

import com.ssm.dao.UserMapper;
import com.ssm.dmo.User;
import com.ssm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by sgl on 17/8/17.
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public User getUserById(int userId){
        System.out.println("111111111");
        return userMapper.getUserById(userId);
    }

}
