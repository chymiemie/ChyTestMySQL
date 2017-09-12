package com.chy.yihe;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.chy.yihe.dao.TUserMapper;
import com.chy.yihe.model.vo.UserAndTelNum;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = { App.class })
public class JoinTest {
	
	@Autowired
	private TUserMapper tUserMapper;
	
	@Test
	public void getUserAndTel(){
		List<UserAndTelNum> list = tUserMapper.selectAllUserAndTelNum();
		System.out.println(list);
	}

}
