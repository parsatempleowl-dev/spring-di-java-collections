package com.example.collections.domain;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Category {

    private Long id;
    private String name;
    private Set<Book> booksSet;
    private List<Book> booksList;
    private Map<String, Book> booksMap;

    public Category(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public void setBooksSet(Set<Book> booksSet) {
        this.booksSet = booksSet;
    }

    public void setBooksList(List<Book> booksList) {
        this.booksList = booksList;
    }

    public void setBooksMap(Map<String, Book> booksMap) {
        this.booksMap = booksMap;
    }

    public Set<Book> getBooksSet() {
        return booksSet;
    }

    public List<Book> getBooksList() {
        return booksList;
    }

    public Map<String, Book> getBooksMap() {
        return booksMap;
    }
}
