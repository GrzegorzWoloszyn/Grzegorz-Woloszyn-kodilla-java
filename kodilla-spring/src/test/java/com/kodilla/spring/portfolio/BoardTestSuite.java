package com.kodilla.spring.portfolio;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootTest
public class BoardTestSuite {

    @Test
    public void testTaskAdd() {
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);

        Board board = context.getBean(Board.class);

        board.getToDoList().getTasks().add("New task to do.");
        board.getInProgressList().getTasks().add("Task in progress.");
        board.getDoneList().getTasks().add("Task done.");


        Assert.assertEquals("New task to do.", board.getToDoList().getTasks().get(0));
        Assert.assertEquals("Task in progress.", board.getInProgressList().getTasks().get(0));
        Assert.assertEquals("Task done.", board.getDoneList().getTasks().get(0));

        System.out.println(board.getToDoList().getTasks().get(0));
        System.out.println(board.getInProgressList().getTasks().get(0));
        System.out.println(board.getDoneList().getTasks().get(0));
    }

}
