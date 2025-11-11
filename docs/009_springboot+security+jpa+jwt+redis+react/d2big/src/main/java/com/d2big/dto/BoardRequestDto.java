package com.d2big.dto;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BoardRequestDto {
    private String btitle;
    private String bcontent;
    private String bfile;
    
    private List<String> bfiles; // 다중 이미지 경로
}
