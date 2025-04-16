package com.root.app.board;

import java.util.List;

public interface BoardService {
	
	public List<BoardVO> getList();
	
	public BoardVO getDetail(BoardVO boardVO);
	
	public int add(BoardVO boardVO);

}
