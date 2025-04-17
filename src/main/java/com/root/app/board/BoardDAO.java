package com.root.app.board;

import java.util.List;

import com.root.app.util.Pager;

public interface BoardDAO {
	
	public List<BoardVO> getList(Pager pager);
	
	public BoardVO getDetail(BoardVO boardVO);
	
	public int add(BoardVO boardVO);
	
	public Long getTotalCount(Pager pager);

}
