package com.d2big.dto;

import com.d2big.entity.Board;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class BoardResponseDto {

    private Long id;
    private String btitle;
    private String bcontent;
    private String bfile;
    private Long bhit;
    private LocalDateTime createDate;
    private String writerUsername;

    public BoardResponseDto(Board board) {
        this.id = board.getId();
        this.btitle = board.getBtitle();
        this.bcontent = board.getBcontent();
        this.bfile = board.getBfile();
        this.bhit = board.getBhit();
        this.createDate = board.getCreateDate();
        this.writerUsername = board.getWriter().getUsername();
    }
}
