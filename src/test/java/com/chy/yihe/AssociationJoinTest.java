package com.chy.yihe;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.chy.yihe.dao.CourseinfoMapper;
import com.chy.yihe.model.Courseinfo;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = {App.class})
public class AssociationJoinTest {
	
	@Autowired 
	private CourseinfoMapper courseinfoMapper;
	
	@Test
	public void getCourseAndStu(){
		List<Courseinfo> courseinfo = courseinfoMapper.selectCourseAndStu("张三");
		System.out.println(courseinfo);
	}

}
