
package com.han.demo.controller;

import com.han.demo.pojo.User;
import com.han.demo.service.IUserService;
import org.springframework.stereotype.Controller;
/**
 * Created by hanhansongjiang on 16/4/27.
 */

import org.springframework.stereotype.Controller;
import javax.annotation.Resource;
import javax.json.JsonObject;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;


@Controller
@RequestMapping("/user")
public class UserController {
    @Resource
    private IUserService userService;

    @RequestMapping("/showUser")
    public String toIndex(HttpServletRequest request, Model model) {
        int userId = Integer.parseInt(request.getParameter("id"));
       // User user = this.userService.findUserById(userId);
        User user=new User(3,"han",4);
        model.addAttribute("user", user);
        return "show";
    }

    //获取所有的用户列表
    @RequestMapping("/getUsers")
     public String getAllUsers(){
        List<User> users=this.userService.getAllUsers();

      return "show";

     }

    @ResponseBody
    @RequestMapping("/testjson")
    public HashMap<String,String> get(HttpServletRequest request, Model model) {
       HashMap<String,String >  hash=new HashMap<String,String >();
        hash.put("key","value");
        hash.put("key2","value2");
        return hash;


    }




}