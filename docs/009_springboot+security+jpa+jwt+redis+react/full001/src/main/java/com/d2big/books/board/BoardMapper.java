package com.d2big.books.board;

import java.util.List;

import com.d2big.books.domain.Board;

@Mapper
public interface BoardMapper {
	public List<Board>  findAllPaged(int offset , int limit);  // 페이징
	public List<Board>  findAllByOrderedByDesc();  // 정렬 내림차순
	public Board findById(Long id);  // 상세보기, 수정하기폼
	
	public  int  insert(Board board);
	public  int  updateByIdAndBpass(Board board);
	public  int  deleteByIdAndBpass(Board board);
}
