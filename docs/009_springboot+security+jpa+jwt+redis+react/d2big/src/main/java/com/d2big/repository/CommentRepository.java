package com.d2big.repository;

import com.d2big.entity.Comment;
import com.d2big.entity.Board;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CommentRepository extends JpaRepository<Comment, Long> {

    List<Comment> findByBoardOrderByCreateDateAsc(Board board);
}
