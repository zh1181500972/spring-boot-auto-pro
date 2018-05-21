package com.example.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.demo.config.Student;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootAutoProApplicationTests {

	@Autowired
	Student student;

	@Test
	public void contextLoads() {
		System.out.println(student);
		student=new Student();
		student.setGenner('男');
		System.out.println(student);
	}

}
