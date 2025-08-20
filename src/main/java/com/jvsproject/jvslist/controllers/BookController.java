package com.jvsproject.jvslist.controllers;

import com.jvsproject.jvslist.dto.BookMinDTO;
import com.jvsproject.jvslist.entities.Book;
import com.jvsproject.jvslist.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/books")
public class BookController {

    @Autowired
    private BookService bookService;

    @GetMapping
    public List<BookMinDTO> findAll() {
        List<BookMinDTO> result = bookService.findAll();
        return result;
    }
}
