package com.d2big.entity;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "boards")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Board {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "board_seq_gen")
    @SequenceGenerator(name = "board_seq_gen", sequenceName = "board_seq", allocationSize = 1)
    private Long id;

    @Column(nullable = false, length = 200)
    private String btitle;

    @Column(columnDefinition = "CLOB")
    private String bcontent;
 
    private String bip;
    private String bpass;
    private Long bhit = 0L;

    @Column(name = "create_date", columnDefinition = "TIMESTAMP")
    private LocalDateTime createDate = LocalDateTime.now();

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "member_id")
    private Member writer;
    
    //////////////////
    @Column(name = "bfile")
    private String bfile; // 실제 파일명 또는 저장된 경로
}
