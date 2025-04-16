package com.root.app.board.notice;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.root.app.board.BoardVO;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootTest
class NoticeDAOTest {
	
	@Autowired
	private NoticeDAO noticeDAO;

	@Test
	void testGetList() throws Exception {
		List<BoardVO> ar = noticeDAO.getList();
		
		for(BoardVO vo : ar) {
			log.info("VO : {}", vo.toString());
		}
		
	}

	@Test
	void testGetDetail() {
		BoardVO boardVO = new BoardVO();
		boardVO.setBoardNum(1L);
		boardVO = noticeDAO.getDetail(boardVO);
		log.info("VO : {}", boardVO);
	}

	@Test
	void testAdd() {
		BoardVO boardVO = new BoardVO();
		boardVO.setBoardTitle("testTitle");
		boardVO.setBoardContents("testContents");
		boardVO.setUserName("testUser");
		int result = noticeDAO.add(boardVO);
		assertEquals(1, result);
	}

}
