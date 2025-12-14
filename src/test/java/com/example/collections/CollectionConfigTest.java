package com.example.collections;

import com.example.collections.config.CollectionConfig;
import com.example.collections.domain.Category;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

public class CollectionConfigTest {

    @Test
    void shouldLoadCollectionsAndCategories() {

        try (AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(CollectionConfig.class)) {

            Category listCategory = context.getBean("categoryBeanList", Category.class);
            Category setCategory = context.getBean("categoryBeanSet", Category.class);
            Category mapCategory = context.getBean("categoryBeanMap", Category.class);

            assertNotNull(listCategory);
            assertNotNull(setCategory);
            assertNotNull(mapCategory);

            assertNotNull(listCategory.getBooksList());
            assertFalse(listCategory.getBooksList().isEmpty());

            assertNotNull(setCategory.getBooksSet());
            assertFalse(setCategory.getBooksSet().isEmpty());

            assertNotNull(mapCategory.getBooksMap());
            assertFalse(mapCategory.getBooksMap().isEmpty());
        }
    }
}
