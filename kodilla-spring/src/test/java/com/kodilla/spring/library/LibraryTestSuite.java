package com.kodilla.spring.library;

import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;


@SpringBootTest
public class LibraryTestSuite {
    @Test
    public void testLoadFromDB() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");

        Library library = context.getBean(Library.class);

        library.loadFromDB();
    }

    @Test
    public void testSaveToDB() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");

        Library library = context.getBean(Library.class);

        library.saveToDB();
    }

    @Test
    public void testContext() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");

        System.out.println("====== Bean list: ======>>");
        Arrays.stream(context.getBeanDefinitionNames())
                .forEach(System.out::println);
        System.out.println("<====== Beans list ======");
    }

}
