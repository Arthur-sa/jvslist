package com.jvsproject.jvslist.dto;

import com.jvsproject.jvslist.entities.Book;

public class BookMinDTO {
    private Long id;
    private String title;
    private String imgUrl;
    private String shortDescription;

    public BookMinDTO() {
    }

    public BookMinDTO(Book entity) {
        id = entity.getId();
        title = entity.getTitle();
        imgUrl = entity.getImgUrl();
        shortDescription = entity.getShortDescription();
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public String getShortDescription() {
        return shortDescription;
    }
}
