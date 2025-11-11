package com.d2big.controller;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.d2big.dto.BoardRequestDto;
import com.d2big.dto.BoardResponseDto;
import com.d2big.entity.Board;
import com.d2big.service.BoardService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/board")
@RequiredArgsConstructor
public class BoardController {

    private final BoardService boardService;

    // 전체 조회
    @GetMapping("/all")
    public ResponseEntity<List<BoardResponseDto>> getAllBoards() {
        List<Board> boards = boardService.findAllDesc();
        List<BoardResponseDto> response = boards.stream()
            .map(BoardResponseDto::new)
            .collect(Collectors.toList());
        return ResponseEntity.ok(response);
    }

    // 페이징 조회
    @GetMapping("/page")
    public ResponseEntity<List<BoardResponseDto>> getPagedBoards(@RequestParam int page, @RequestParam int size) {
        List<Board> boards = boardService.findAllPaged(page, size);
        List<BoardResponseDto> response = boards.stream()
            .map(BoardResponseDto::new)
            .collect(Collectors.toList());
        return ResponseEntity.ok(response);
    }

    // 상세 조회
    @GetMapping("/{id}")
    public ResponseEntity<BoardResponseDto> getBoard(@PathVariable Long id) {
        Board board = boardService.findById(id);
        return ResponseEntity.ok(new BoardResponseDto(board));
    }

    // 작성
    @PostMapping
    public ResponseEntity<BoardResponseDto> createBoard(@RequestBody BoardRequestDto requestDto,
                                                        Authentication authentication) {
        String username = authentication.getName();
        Board board = boardService.create(requestDto, username);
        return ResponseEntity.ok(new BoardResponseDto(board));
    }

    // 수정
    @PutMapping("/{id}")
    public ResponseEntity<BoardResponseDto> updateBoard(@PathVariable Long id,
                                                        @RequestBody BoardRequestDto requestDto,
                                                        Authentication authentication) {
        String username = authentication.getName();
        Board board = boardService.update(id, requestDto, username);
        return ResponseEntity.ok(new BoardResponseDto(board));
    }

    // 삭제
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteBoard(@PathVariable Long id,
                                            Authentication authentication) {
        String username = authentication.getName();
        boardService.delete(id, username);
        return ResponseEntity.ok().build();
    }
    ///////////////////////// (1) 파일업로드
    /*
    @PostMapping("/upload")
    public ResponseEntity<String> uploadFile(@RequestParam("file") MultipartFile file) throws IOException {
        String uploadDir = "uploads/";
        String originalFilename = file.getOriginalFilename();
        String filePath = uploadDir + UUID.randomUUID() + "_" + originalFilename;

        File dest = new File(filePath);
        dest.getParentFile().mkdirs(); // 디렉토리 없으면 생성
        file.transferTo(dest);

        return ResponseEntity.ok(filePath); // 또는 URL 반환
    }*/

    ///////////////////////// (2) 다중파일업로드, 미리보기
    @PostMapping("/upload")
    public ResponseEntity<List<String>> uploadFiles(@RequestParam("files") List<MultipartFile> files) throws IOException {
        String uploadDir = "uploads/";
        List<String> savedPaths = new ArrayList<>();

        for (MultipartFile file : files) {
            String originalFilename = file.getOriginalFilename();
            String filePath = uploadDir + UUID.randomUUID() + "_" + originalFilename;

            File dest = new File(filePath);
            dest.getParentFile().mkdirs();
            file.transferTo(dest);

            savedPaths.add(filePath);
        }

        return ResponseEntity.ok(savedPaths); // 클라이언트에서 미리보기 가능
    }


}
