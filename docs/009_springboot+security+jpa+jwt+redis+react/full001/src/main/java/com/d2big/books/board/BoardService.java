package com.d2big.books.board;

import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import com.company.project001.member.MemberMapper;
import com.d2big.books.domain.Board;
import com.d2big.books.domain.Member;
import com.d2big.books.util.UtilUpload; 

@Service
public class BoardService {

    @Autowired  private BoardMapper  boardMapper;
    @Autowired  private MemberMapper memberMapper;

    @Autowired  private UtilUpload upload;

    public List<Board> getPaging(int page) {
        return boardMapper.findAllPaged(page * 10, 10);
    }

    public List<Board> findAll() {
        return boardMapper.findAllByOrderedByDesc();
    }

    @Transactional
    public Board find(Long id) {
        Board board = boardMapper.findById(id);
        if (board != null) {
            Long curr = board.getBhit() == null ? 0L : board.getBhit();
            board.setBhit(curr + 1);
            boardMapper.updateByIdAndBpass(board);
        }
        return board;
    }

    public int insert(MultipartFile file, Board board) {
        // 작성자 정보 조회
        String username = board.getMember() != null ? board.getMember().getUsername() : null;
        if (username != null) {
            Member member = memberMapper.findByUsername(username);
            if (member != null) {
                board.setMember(member);
            } else {
                throw new IllegalArgumentException("유효하지 않은 사용자입니다.");
            }
        }

        // 파일 업로드
        try {
            board.setBfile(upload.fileUpload(file));
        } catch (IOException e) {
            e.printStackTrace();
        }

        // 조회수 초기값
        if (board.getBhit() == null) {
            board.setBhit(0L);
        }

        // IP 주소
        try {
            board.setBip(InetAddress.getLocalHost().getHostAddress());
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }

        return boardMapper.insert(board);
    }

    public Board update_view(Long id) {
        return boardMapper.findById(id);
    }

    public int update(MultipartFile file, Board board) {
        String save = board.getBfile();
        if (file != null && file.getOriginalFilename().length() > 0) {
            try {
                save = upload.fileUpload(file);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        board.setBfile(save);
        return boardMapper.updateByIdAndBpass(board);
    }

    public int delete(Board board) {
        return boardMapper.deleteByIdAndBpass(board);
    }
}
