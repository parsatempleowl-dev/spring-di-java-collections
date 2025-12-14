package com.example.collections.service;

import com.example.collections.domain.Category;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class CollectingBean {

    private static final Logger logger =
            LoggerFactory.getLogger(CollectingBean.class);

    private final Category categoryBeanList;
    private final Category categoryBeanSet;
    private final Category categoryBeanMap;

    public CollectingBean(
            @Qualifier("categoryBeanList") Category categoryBeanList,
            @Qualifier("categoryBeanSet") Category categoryBeanSet,
            @Qualifier("categoryBeanMap") Category categoryBeanMap
    ) {
        this.categoryBeanList = categoryBeanList;
        this.categoryBeanSet = categoryBeanSet;
        this.categoryBeanMap = categoryBeanMap;
    }

    public void displayCollections() {

        logger.info("=== LIST CATEGORY ===");
        categoryBeanList.getBooksList()
                .forEach(book -> logger.info(book.toString()));

        logger.info("=== SET CATEGORY ===");
        categoryBeanSet.getBooksSet()
                .forEach(book -> logger.info(book.toString()));

        logger.info("=== MAP CATEGORY ===");
        categoryBeanMap.getBooksMap()
                .forEach((k, v) -> logger.info(k + " -> " + v));
    }
}