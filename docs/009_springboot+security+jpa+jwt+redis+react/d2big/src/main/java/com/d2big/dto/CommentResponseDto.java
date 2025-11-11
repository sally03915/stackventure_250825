// CommentResponseDto.java
package com.d2big.dto;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import com.d2big.entity.Comment;

import lombok.Getter;

@Getter
public class CommentResponseDto {
    private Long id;
    private String content;
    private String writerUsername;
    private LocalDateTime createDate;
    private Long parentId;
    private List<CommentResponseDto> children = new ArrayList<>();

    public CommentResponseDto(Comment comment) {
        this.id = comment.getId();
        this.content = comment.getContent();
        this.writerUsername = comment.getWriter().getUsername();
        this.createDate = comment.getCreateDate();
        this.parentId = comment.getParent() != null ? comment.getParent().getId() : null;
    }
}

/*
@Getter
public class CommentResponseDto {
    private Long id;
    private String content;
    private String writerUsername;
    private LocalDateTime createDate;

    public CommentResponseDto(Comment comment) {
        this.id = comment.getId();
        this.content = comment.getContent();
        this.writerUsername = comment.getWriter().getUsername();
        this.createDate = comment.getCreateDate();
    }
    
    
}
*/
