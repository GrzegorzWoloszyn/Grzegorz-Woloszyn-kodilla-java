package com.kodilla.patterns.prototype;

import org.junit.Assert;
import org.junit.Test;

import java.util.stream.IntStream;

public class BoardTestSuite {
    @Test
    public void testToString() {
        //Given
        //creating the TaskList for todos
        TasksList listToDo = new TasksList("To do tasks");
        IntStream.iterate(1, n -> n + 1)
                .limit(10)
                .forEach(n -> listToDo.getTasks().add(new Task("To do task number " + n)));

        //creating the TaskList for tasks in progress
        TasksList listInProgress = new TasksList("In progress tasks");
        IntStream.iterate(1, n -> n + 1)
                .limit(10)
                .forEach(n -> listInProgress.getTasks().add(new Task("In progress task number " + n)));

        //creating the TaskList for done tasks
        TasksList listDone = new TasksList("Done tasks");
        IntStream.iterate(1, n -> n + 1)
                .limit(10)
                .forEach(n -> listDone.getTasks().add(new Task("Done task number " + n)));

        Board board = new Board("Project number 1");
        board.getLists().add(listToDo);
        board.getLists().add(listInProgress);
        board.getLists().add(listDone);

        //making shallow clone of object board
        Board shallowClonedBoard = null;
        try {
            shallowClonedBoard = board.shallowCopy();
            shallowClonedBoard.setName("Project number 2");

        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //making a deep clone fo object board

        Board deepClonedBoard = null;
        try{
            deepClonedBoard = board.deepCopy();
            deepClonedBoard.setName("Project number 3");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //When
        board.getLists().remove(listToDo);
        //Then
        System.out.println(board);
        System.out.println(shallowClonedBoard);
        System.out.println(deepClonedBoard);

        Assert.assertEquals(2, board.getLists().size());
        Assert.assertEquals(2, shallowClonedBoard.getLists().size());
        Assert.assertEquals(3, deepClonedBoard.getLists().size());

        Assert.assertEquals(shallowClonedBoard.getLists(), board.getLists());
        Assert.assertNotEquals(deepClonedBoard.getLists(), board.getLists());
}
}
