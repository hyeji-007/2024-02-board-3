package com.green.board2;

import com.green.board2.model.BoardInsReq;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface BoardMapper {
    int insBoard(BoardInsReq p);
}
