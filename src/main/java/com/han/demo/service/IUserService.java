package com.han.demo.service;

import com.han.demo.pojo.User;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by hanhansongjiang on 16/4/27.
 */

public interface IUserService {
    public User findUserById(int id);
    public List<User> getAllUsers();
}
