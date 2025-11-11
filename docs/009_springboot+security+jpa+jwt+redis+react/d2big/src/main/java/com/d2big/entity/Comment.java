package com.d2big.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "comments")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Comment {

   @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "comments_seq")
    @SequenceGenerator(name = "comments_seq", sequenceName = "comments_seq", allocationSize = 1)
    private Long id;

    @Column(nullable = false, length = 1000)
    private String content;

    @Column(name = "create_date")
    private LocalDateTime createDate = LocalDateTime.now();

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "board_id")
    private Board board;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "member_id")
    private Member writer;

    //////////////////////////////////////////////
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "parent_id")
    private Comment parent; // 대댓글용
}



///   CREATE SEQUENCE comments_seq START WITH 1 INCREMENT BY 1;ㄴ