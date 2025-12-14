package com.example.collections.config;

import com.example.collections.domain.Book;
import com.example.collections.domain.Category;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.*;

@Configuration
public class CollectionConfig {

    @Bean
    public List<Book> list() {
        return List.of(
                new Book(1L, "ISBN-001", "Spring in Action", 45.0f),
                new Book(2L, "ISBN-002", "Effective Java", 55.0f)
        );
    }

    @Bean
    public Set<Book> set() {
        return Set.of(
                new Book(3L, "ISBN-003", "Clean Code", 50.0f),
                new Book(4L, "ISBN-004", "Java Concurrency", 60.0f)
        );
    }

    @Bean
    public Map<String, Book> map() {
        Map<String, Book> map = new HashMap<>();
        map.put("spring", new Book(5L, "ISBN-005", "Spring Boot", 48.0f));
        map.put("hibernate", new Book(6L, "ISBN-006", "Hibernate Tips", 42.0f));
        return map;
    }

    @Bean
    public Category categoryBeanList() {
        Category category = new Category(1L, "List Category");
        category.setBooksList(list());
        return category;
    }

    @Bean
    public Category categoryBeanSet() {
        Category category = new Category(2L, "Set Category");
        category.setBooksSet(set());
        return category;
    }

    @Bean
    public Category categoryBeanMap() {
        Category category = new Category(3L, "Map Category");
        category.setBooksMap(map());
        return category;
    }
}
