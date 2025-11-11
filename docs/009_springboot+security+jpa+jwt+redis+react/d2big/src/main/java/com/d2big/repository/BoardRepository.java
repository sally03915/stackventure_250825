package com.d2big.repository;

import com.d2big.entity.Board;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface BoardRepository extends JpaRepository<Board, Long> {

    // 게시글 전체 조회 (ID 내림차순)
    List<Board> findAllByOrderByIdDesc();

    // 페이징 조회 (Pageable 사용)
    @Query("SELECT b FROM Board b ORDER BY b.id DESC")
    List<Board> findAllPaged(Pageable pageable);
}
