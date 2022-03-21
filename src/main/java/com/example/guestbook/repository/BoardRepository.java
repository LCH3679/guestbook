package com.example.guestbook.repository;

import com.example.guestbook.entity.guestBook;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;

public interface BoardRepository extends JpaRepository<guestBook, Long>, QuerydslPredicateExecutor<guestBook> {
}
