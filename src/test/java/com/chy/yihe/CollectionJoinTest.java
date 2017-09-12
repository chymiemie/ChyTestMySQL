package com.chy.yihe;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.chy.yihe.dao.StudentinfoMapper;
import com.chy.yihe.model.Studentinfo;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = {App.class})
public class CollectionJoinTest {

	@Autowired
	private StudentinfoMapper studentinfoMapper;
	
	@Test
	public void getStuAndCourse(){
		List<Studentinfo> studentinfos = studentinfoMapper.selectStuAndCouese("张三");
		System.out.println(studentinfos);
	}
	
	
}
