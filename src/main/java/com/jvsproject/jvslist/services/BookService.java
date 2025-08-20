package com.jvsproject.jvslist.services;

import com.jvsproject.jvslist.dto.BookMinDTO;
import com.jvsproject.jvslist.entities.Book;
import com.jvsproject.jvslist.repositories.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;

    public List<BookMinDTO> findAll() {
        List<Book> result = bookRepository.findAll();
        return result.stream().map(x -> new BookMinDTO(x)).toList();
    }
}
