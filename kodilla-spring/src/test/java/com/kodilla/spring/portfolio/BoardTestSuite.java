package com.kodilla.spring.portfolio;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import java.util.List;

@SpringBootTest
public class BoardTestSuite {

    @Test
    public void testTaskAddToDoList() {
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);

        Board board = context.getBean(Board.class);

        List<String> newTask = board.addTask();

        Assert.assertEquals("New Task", newTask.get(0));
    }

    @Test
    public void testTaskAddInProgressList() {
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);

        Board board = context.getBean(Board.class);

        List<String> newTask = board.addTask();

        Assert.assertEquals("New Task", newTask.get(0));
    }

    @Test
    public void testTaskAddDoneList() {
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);

        Board board = context.getBean(Board.class);

        List<String> newTask = board.addTask();

        Assert.assertEquals("New Task", newTask.get(0));
    }

}
