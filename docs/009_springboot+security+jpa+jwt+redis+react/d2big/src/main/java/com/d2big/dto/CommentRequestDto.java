// CommentRequestDto.java
package com.d2big.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CommentRequestDto {
    private String content;
    //////////////////////////////////////////////
    private Long parentId; // 대댓글일 경우 부모 댓글 ID
}
