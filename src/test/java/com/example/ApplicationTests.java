package com.example;

import com.example.mapper.DiscussPostMapper;
import com.example.mapper.UserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@ContextConfiguration(classes = Application.class)
public class ApplicationTests implements ApplicationContextAware {
	private ApplicationContext applicationContext;
	@Autowired
	private UserMapper userMapper;

	@Autowired
	private DiscussPostMapper discussPostMapper;

	@Test
	public void testApplicationContext() {
		System.out.println(applicationContext);
		System.out.println(discussPostMapper.selectDiscussPostRows(120));
		System.out.println(userMapper.selectById(1));
		System.out.println(userMapper.selectById(0));
	}


	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		this.applicationContext = applicationContext;

	}
}