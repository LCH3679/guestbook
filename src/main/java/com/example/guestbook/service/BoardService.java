package com.example.guestbook.service;


import com.example.guestbook.dto.BoardDTO;
import com.example.guestbook.dto.PageRequestDTO;
import com.example.guestbook.dto.PageResultDTO;
import com.example.guestbook.entity.guestBook;

public interface BoardService {

    Long register(BoardDTO dto);

    PageResultDTO<BoardDTO, guestBook> getList(PageRequestDTO requestDTO);

    BoardDTO read(Long gno);

    void modify(BoardDTO dto);

    void remove(Long gno);

    default guestBook dtoToEntity(BoardDTO dto) {
        guestBook entity = guestBook.builder()
                .gno(dto.getGno())
                .title(dto.getTitle())
                .content(dto.getContent())
                .writer(dto.getWriter())
                .build();
        return entity;
    }

    default BoardDTO entityToDto(guestBook entity) {

        BoardDTO dto = BoardDTO.builder()
                .gno(entity.getGno())
                .title(entity.getTitle())
                .content(entity.getContent())
                .writer(entity.getWriter())
                .regDate(entity.getRegDate())
                .modDate(entity.getModDate())
                .build();

        return dto;
    }
}
