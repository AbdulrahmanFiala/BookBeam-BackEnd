package com.fiala.bookbeam.dao;

import com.fiala.bookbeam.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {

}
