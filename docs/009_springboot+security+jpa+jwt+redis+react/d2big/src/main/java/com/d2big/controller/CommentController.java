package com.d2big.controller;

import com.d2big.dto.CommentRequestDto;
import com.d2big.dto.CommentResponseDto;
import com.d2big.entity.Comment;
import com.d2big.service.CommentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/comments")
@RequiredArgsConstructor
public class CommentController {

    private final CommentService commentService;

    // 댓글 작성
    @PostMapping("/{boardId}")
    public ResponseEntity<CommentResponseDto> createComment(@PathVariable Long boardId,
                                                            @RequestBody CommentRequestDto dto,
                                                            Authentication authentication) {
        String username = authentication.getName();
        Comment comment = commentService.create(boardId, dto, username);
        return ResponseEntity.ok(new CommentResponseDto(comment));
    }

    // 게시글별 댓글 조회
    @GetMapping("/{boardId}")
    public ResponseEntity<List<CommentResponseDto>> getComments(@PathVariable Long boardId) {
        List<Comment> comments = commentService.findByBoard(boardId);
        List<CommentResponseDto> response = comments.stream()
            .map(CommentResponseDto::new)
            .collect(Collectors.toList());
        return ResponseEntity.ok(response);
    }

    // 댓글 삭제
    @DeleteMapping("/delete/{commentId}")
    public ResponseEntity<Void> deleteComment(@PathVariable Long commentId,
                                              Authentication authentication) {
        String username = authentication.getName();
        commentService.delete(commentId, username);
        return ResponseEntity.ok().build();
    }
    
    ////////////////////////////
 // 댓글 트리 조회
    @GetMapping("/tree/{boardId}")
    public ResponseEntity<List<CommentResponseDto>> getCommentTree(@PathVariable Long boardId) {
        return ResponseEntity.ok(commentService.getCommentTree(boardId));
    }

    // 댓글 수정
    @PutMapping("/{commentId}")
    public ResponseEntity<CommentResponseDto> updateComment(@PathVariable Long commentId,
                                                            @RequestBody CommentRequestDto dto,
                                                            Authentication authentication) {
        String username = authentication.getName();
        Comment updated = commentService.update(commentId, dto, username);
        return ResponseEntity.ok(new CommentResponseDto(updated));
    }

}
