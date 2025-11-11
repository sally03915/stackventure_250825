package com.d2big.service;

import com.d2big.dto.BoardRequestDto;
import com.d2big.dto.BoardResponseDto;
import com.d2big.entity.Board;
import com.d2big.entity.Member;
import com.d2big.repository.BoardRepository;
import com.d2big.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BoardService {

    private final BoardRepository boardRepository;
    private final MemberRepository memberRepository;

    // 전체 조회
    public List<Board> findAllDesc() {
        return boardRepository.findAllByOrderByIdDesc();
    }

    // 페이징 조회
    public List<Board> findAllPaged(int page, int size) {
        Pageable pageable = PageRequest.of(page, size);
        return boardRepository.findAllPaged(pageable);
    }

    // 상세 조회
    public Board findById(Long id) {
        return boardRepository.findById(id)
            .orElseThrow(() -> new IllegalArgumentException("게시글을 찾을 수 없습니다."));
    }

    // 작성
    public Board create(BoardRequestDto requestDto, String username) {
        Member writer = memberRepository.findByUsername(username)
            .orElseThrow(() -> new IllegalArgumentException("작성자를 찾을 수 없습니다."));

        Board board = Board.builder()
            .btitle(requestDto.getBtitle())
            .bcontent(requestDto.getBcontent())
            .bfile(requestDto.getBfile())
            .writer(writer)
            .build();

        return boardRepository.save(board);
    }

    // 수정 (작성자만 가능)
    public Board update(Long boardId, BoardRequestDto requestDto, String username) {
        Board board = boardRepository.findById(boardId)
            .orElseThrow(() -> new IllegalArgumentException("게시글을 찾을 수 없습니다."));

        if (!board.getWriter().getUsername().equals(username)) {
            throw new AccessDeniedException("작성자만 수정할 수 있습니다.");
        }

        board.setBtitle(requestDto.getBtitle());
        board.setBcontent(requestDto.getBcontent());
        board.setBfile(requestDto.getBfile());

        return boardRepository.save(board);
    }

    // 삭제 (작성자만 가능)
    public void delete(Long boardId, String username) {
        Board board = boardRepository.findById(boardId)
            .orElseThrow(() -> new IllegalArgumentException("게시글을 찾을 수 없습니다."));

        if (!board.getWriter().getUsername().equals(username)) {
            throw new AccessDeniedException("작성자만 삭제할 수 있습니다.");
        }

        boardRepository.delete(board);
    }
}
