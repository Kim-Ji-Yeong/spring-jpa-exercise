package com.jpa.exercise.repository;

import com.jpa.exercise.domain.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRespository extends JpaRepository<Book, Long> {
}