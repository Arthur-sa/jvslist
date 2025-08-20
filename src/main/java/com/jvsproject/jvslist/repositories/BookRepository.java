package com.jvsproject.jvslist.repositories;

import com.jvsproject.jvslist.entities.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {

}
