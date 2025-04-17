package com.root.app.util;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import lombok.extern.slf4j.Slf4j;

@SpringBootTest
@Slf4j
class PagerTest {

	private Pager pager;
	
	@Test
	void test() {
		pager = new Pager();
		pager.setPage(3L);
		log.info(pager.getPage().toString());
		log.info(pager.getPerPage().toString());
		log.info(pager.getStartNum().toString());
	}

}
