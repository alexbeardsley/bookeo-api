package com.alexbeardsley.bookeoapi.service;

public class Pagination {
    private final Integer itemsPerPage;
    private final Integer pageNumber;
    private String pageNavigationToken;

    public Pagination(Integer itemsPerPage, Integer pageNumber) {
        this.itemsPerPage = itemsPerPage;
        this.pageNumber = pageNumber;
    }

    Pagination(Integer itemsPerPage, Integer pageNumber, String pageNavigationToken) {
        this.itemsPerPage = itemsPerPage;
        this.pageNumber = pageNumber;
        this.pageNavigationToken = pageNavigationToken;
    }

    public Integer getItemsPerPage() {
        return itemsPerPage;
    }

    public Integer getPageNumber() {
        return pageNumber;
    }

    String getPageNavigationToken() {
        return pageNavigationToken;
    }
}