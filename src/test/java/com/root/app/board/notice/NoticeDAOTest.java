package com.root.app.board.notice;

import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.patch;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.root.app.board.BoardVO;
import com.root.app.util.Pager;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootTest
class NoticeDAOTest {
	
	@Autowired
	private NoticeDAO noticeDAO;
	
//	@Test
//	void testAddAll() throws Exception {
//		List<BoardVO> ar = new ArrayList<>();
//		for(int i = 0; i < 100; i++) {
//			BoardVO boardVO = new BoardVO();
//			boardVO.setBoardTitle("title"+i);
//			boardVO.setBoardContents("contents"+i);
//			boardVO.setUserName("user"+i);
//			ar.add(boardVO);
//		}
//		int result = noticeDAO.addAll(ar);
//		
//		assertNotEquals(0, result);
//		log.info("result : {}", result);
//	}

	@Test
	void testGetList() throws Exception {
		Pager pager =  new Pager();
		
		List<BoardVO> ar = noticeDAO.getList(pager);
		
		for(BoardVO vo : ar) {
			log.info("VO : {}", vo.toString());
		}
		
	}
//
//	@Test
//	void testGetDetail() {
//		BoardVO boardVO = new BoardVO();
//		boardVO.setBoardNum(1L);
//		boardVO = noticeDAO.getDetail(boardVO);
//		log.info("VO : {}", boardVO);
//	}
//
//	@Test
//	void testAdd() {
//		BoardVO boardVO = new BoardVO();
//		boardVO.setBoardTitle("testTitle");
//		boardVO.setBoardContents("testContents");
//		boardVO.setUserName("testUser");
//		int result = noticeDAO.add(boardVO);
//		assertEquals(1, result);
//	}

}
