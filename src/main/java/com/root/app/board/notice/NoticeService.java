package com.root.app.board.notice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.root.app.board.BoardService;
import com.root.app.board.BoardVO;
import com.root.app.util.Pager;

@Service
public class NoticeService implements BoardService {

	@Autowired
	private NoticeDAO noticeDAO;
	
	@Override
	public List<BoardVO> getList(Pager pager) {
		List<BoardVO> ar = noticeDAO.getList(pager); 
		return ar;
	}

	@Override
	public BoardVO getDetail(BoardVO boardVO) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int add(BoardVO boardVO) {
		// TODO Auto-generated method stub
		return 0;
	}

}
