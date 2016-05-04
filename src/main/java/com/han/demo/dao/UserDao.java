package com.han.demo.dao;

import com.han.demo.pojo.User;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by hanhansongjiang on 16/4/27.
 */
@Repository
public interface UserDao {
    public User findUserById(int userId);
    public List<User> getAllUsers();

}
