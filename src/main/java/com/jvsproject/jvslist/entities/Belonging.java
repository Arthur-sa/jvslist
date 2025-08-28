package com.jvsproject.jvslist.entities;

import java.util.Objects;

public class Belonging {
    private Integer position;
    private BelongingPK id = new BelongingPK();

    public Belonging() {
    }

    public Belonging(Integer position, Book book, BookList bookList) {
        this.position = position;
        id.setBook(book);
        id.setBookList(bookList);
    }

    public Integer getPosition() {
        return position;
    }

    public void setPosition(Integer position) {
        this.position = position;
    }

    public BelongingPK getId() {
        return id;
    }

    public void setId(BelongingPK id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Belonging belonging = (Belonging) o;
        return Objects.equals(id, belonging.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}

