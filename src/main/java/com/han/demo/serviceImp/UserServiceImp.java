package com.han.demo.serviceImp;

import com.han.demo.dao.UserDao;
import com.han.demo.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.han.demo.service.IUserService;

import javax.annotation.Resource;
import java.util.List;


/**
 * Created by hanhansongjiang on 16/4/27.
 */
@Service("userService")
public class UserServiceImp implements IUserService {

    @Resource
    private UserDao userdao;


    public User findUserById(int id) {
        User user= userdao.findUserById(id);
        return user;

    }

    public List<User> getAllUsers() {
        return   userdao.getAllUsers();
    }
}
