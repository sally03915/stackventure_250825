package com.d2big.service;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.d2big.dto.CommentRequestDto;
import com.d2big.dto.CommentResponseDto;
import com.d2big.entity.Board;
import com.d2big.entity.Comment;
import com.d2big.entity.Member;
import com.d2big.repository.BoardRepository;
import com.d2big.repository.CommentRepository;
import com.d2big.repository.MemberRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class CommentService {

    private final CommentRepository commentRepository;
    private final BoardRepository boardRepository;
    private final MemberRepository memberRepository;

    /*
    public Comment create(Long boardId, CommentRequestDto dto, String username) {
        Board board = boardRepository.findById(boardId)
            .orElseThrow(() -> new IllegalArgumentException("게시글이 존재하지 않습니다."));
        Member writer = memberRepository.findByUsername(username)
            .orElseThrow(() -> new IllegalArgumentException("작성자 정보가 없습니다."));

        Comment comment = Comment.builder()
            .content(dto.getContent())
            .board(board)
            .writer(writer)
            .build();

        return commentRepository.save(comment);
    }*/
    //////////////// 대댓글
    public Comment create(Long boardId, CommentRequestDto dto, String username) {
        Board board = boardRepository.findById(boardId)
            .orElseThrow(() -> new IllegalArgumentException("게시글이 존재하지 않습니다."));
        Member writer = memberRepository.findByUsername(username)
            .orElseThrow(() -> new IllegalArgumentException("작성자 정보가 없습니다."));

        Comment parent = null;
        if (dto.getParentId() != null) {
            parent = commentRepository.findById(dto.getParentId())
                .orElseThrow(() -> new IllegalArgumentException("부모 댓글이 존재하지 않습니다."));
        }

        Comment comment = Comment.builder()
            .content(dto.getContent())
            .board(board)
            .writer(writer)
            .parent(parent)
            .build();

        return commentRepository.save(comment);
    }


    public List<Comment> findByBoard(Long boardId) {
        Board board = boardRepository.findById(boardId)
            .orElseThrow(() -> new IllegalArgumentException("게시글이 존재하지 않습니다."));
        return commentRepository.findByBoardOrderByCreateDateAsc(board);
    }

    public void delete(Long commentId, String username) {
        Comment comment = commentRepository.findById(commentId)
            .orElseThrow(() -> new IllegalArgumentException("댓글이 존재하지 않습니다."));
        if (!comment.getWriter().getUsername().equals(username)) {
            throw new SecurityException("작성자만 삭제할 수 있습니다.");
        }
        commentRepository.delete(comment);
    }
    //// 댓글트리구조
    public List<CommentResponseDto> getCommentTree(Long boardId) {
        Board board = boardRepository.findById(boardId)
            .orElseThrow(() -> new IllegalArgumentException("게시글이 존재하지 않습니다."));
        List<Comment> allComments = commentRepository.findByBoardOrderByCreateDateAsc(board);

        // 트리 구조로 변환
        Map<Long, CommentResponseDto> dtoMap = new LinkedHashMap<>();
        List<CommentResponseDto> roots = new ArrayList<>();

        for (Comment comment : allComments) {
            CommentResponseDto dto = new CommentResponseDto(comment);
            dtoMap.put(dto.getId(), dto);

            if (dto.getParentId() == null) {
                roots.add(dto);
            } else {
                CommentResponseDto parentDto = dtoMap.get(dto.getParentId());
                if (parentDto != null) {
                    parentDto.getChildren().add(dto);
                }
            }
        }

        return roots;
    }
    ///// 댓글수정
    public Comment update(Long commentId, CommentRequestDto dto, String username) {
        Comment comment = commentRepository.findById(commentId)
            .orElseThrow(() -> new IllegalArgumentException("댓글이 존재하지 않습니다."));
        if (!comment.getWriter().getUsername().equals(username)) {
            throw new SecurityException("작성자만 수정할 수 있습니다.");
        }
        comment.setContent(dto.getContent());
        return commentRepository.save(comment);
    }


}
