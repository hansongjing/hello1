package com.han.demo.test;
import com.han.demo.pojo.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;

import javax.annotation.Resource;

import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.han.demo.service.IUserService;


@RunWith(SpringJUnit4ClassRunner.class)		//表示继承了SpringJUnit4ClassRunner类
@ContextConfiguration(locations = {"classpath:spring-mybatis.xml"})
public class UserDao1{
    //	private ApplicationContext ac = null;
    @Resource
    private IUserService userService = null;

//	@Before
//	public void before() {
//		ac = new ClassPathXmlApplicationContext("applicationContext.xml");
//		userService = (IUserService) ac.getBean("userService");
//	}

    @Test
    public void test1() {
        User user = userService.findUserById(1);
         System.out.println(user);

    }




}
