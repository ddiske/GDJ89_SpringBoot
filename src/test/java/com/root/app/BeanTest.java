package com.root.app;

import static org.junit.jupiter.api.Assertions.*;

import com.root.app.dao.Robot;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.root.app.dao.SampleDAO;

@SpringBootTest
class BeanTest {

	@Autowired
	private SampleDAO sampleDAO;
	
	@Autowired
	private Robot robot;
	
	@Test
	void test() {
		assertNotNull(robot);
	}

}
