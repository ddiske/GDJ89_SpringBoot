package com.root.app.board;

import java.util.List;

import com.root.app.util.Pager;

public interface BoardService {
	
	public List<BoardVO> getList(Pager pager);
	
	public BoardVO getDetail(BoardVO boardVO);
	
	public int add(BoardVO boardVO);
	
	public int update(BoardVO boardVO);
	
	public int delete(BoardVO boardVO);

}
