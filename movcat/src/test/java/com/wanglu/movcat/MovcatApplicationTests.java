package com.wanglu.movcat;

import com.wanglu.movcat.model.User;
import com.wanglu.movcat.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MovcatApplicationTests {

	@Autowired
	private UserService userService;

	@Test
	public void contextLoads() {

	}

	@Test
	public void register() {
		User user = new User("xiaofa", "1241933832@qq.com", "1241933832@qq.com", "c4ca4238a0b923820dcc509a6f75849b");
		User user1 = userService.saveUser(user);
		System.out.println(user1);
	}

}
