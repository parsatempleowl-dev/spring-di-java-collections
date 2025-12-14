package com.example.collections.domain;

public class Book {

    private Long id;
    private String isbn;
    private String title;
    private Float price;

    public Book(Long id, String isbn, String title, Float price) {
        this.id = id;
        this.isbn = isbn;
        this.title = title;
        this.price = price;
    }

    public Long getId() {
        return id;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getTitle() {
        return title;
    }

    public float getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", isbn='" + isbn + '\'' +
                ", title='" + title + '\'' +
                ", price=" + price +
                '}';
    }
}
