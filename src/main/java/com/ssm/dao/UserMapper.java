package com.ssm.dao;

import com.ssm.dmo.User;
import org.springframework.stereotype.Repository;

/**
 * Created by sgl on 17/8/17.
 */
@Repository
public interface UserMapper {

    User getUserById(int userId);
}
