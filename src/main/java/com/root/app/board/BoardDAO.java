package com.root.app.board;

import java.util.List;

public interface BoardDAO {
	
	public List<BoardVO> getList();
	
	public BoardVO getDetail(BoardVO boardVO);
	
	public int add(BoardVO boardVO);

}
