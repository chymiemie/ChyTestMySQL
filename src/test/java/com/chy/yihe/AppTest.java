package com.chy.yihe;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.chy.yihe.dao.TMobileMapper;
import com.chy.yihe.model.TMobile;

/**
 * 
 * @author Administrator
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = {App.class})
public class AppTest {
	
	@Autowired
	private TMobileMapper tMobileMapper;
	
	@Test
	public void getTMobileTest(){
		int i = 1;
		List<TMobile> tMobiles = tMobileMapper.selectAll(i);
		
		TMobile tMobile = tMobileMapper.selectByPrimaryKey(i);
		System.out.println(tMobiles);
		System.out.println(tMobile);
		
	}

}
