package com.example.collections;

import com.example.collections.config.CollectionConfig;
import com.example.collections.service.CollectingBean;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

    public static void main(String[] args) {

        try (AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext()) {

            context.register(CollectionConfig.class);
            context.scan("com.example.collections");
            context.refresh();

            CollectingBean collectingBean =
                    context.getBean(CollectingBean.class);

            collectingBean.displayCollections();
        }
    }
}
