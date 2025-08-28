package com.jvsproject.jvslist.entities;

import java.util.Objects;

public class BelongingPK {
    private Book book;
    private BookList bookList;

    public BelongingPK() {
    }

    public BelongingPK(Book book, BookList bookList) {
        this.book = book;
        this.bookList = bookList;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public BookList getBookList() {
        return bookList;
    }

    public void setBookList(BookList bookList) {
        this.bookList = bookList;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        BelongingPK that = (BelongingPK) o;
        return Objects.equals(book, that.book) && Objects.equals(bookList, that.bookList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(book, bookList);
    }
}
