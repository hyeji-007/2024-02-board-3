package com.green.board2;

import com.green.board2.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/board")
public class BoardController {
    private final BoardService service;

    @PostMapping
    public int insBoard(@RequestBody BoardInsReq p) {
        return service.insBoard(p);
    }

    @GetMapping
    public List<BoardSelRes> sleBoardList() {
        return service.selBoardList();
    }

    @GetMapping("{boardId}")
    public BoardSelOneRes sleBoardOne(@PathVariable int boardId) {
        return service.selBoardOne(boardId);
    }

    @PutMapping
    public int updBoard(@RequestBody BoardUpdReq p) {
        return service.updBoard(p);
    }

    @DeleteMapping
    public int delBoard(@ModelAttribute BoardDelReq p) {
        return service.delBoard(p);
    }


}
