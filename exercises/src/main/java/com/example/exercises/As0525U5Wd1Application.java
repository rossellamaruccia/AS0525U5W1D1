package com.example.exercises;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class As0525U5Wd1Application {

    public static void main(String[] args) {

        SpringApplication.run(As0525U5Wd1Application.class, args);
        try (var context = new AnnotationConfigApplicationContext(AppConfig.class)) {
            Menu menu = context.getBean(Menu.class);
            menu.printMenu();
        }
    }
}
