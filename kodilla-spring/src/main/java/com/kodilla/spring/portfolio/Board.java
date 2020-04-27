package com.kodilla.spring.portfolio;

import java.util.List;

public class Board {

    TaskList toDoList;
    TaskList inProgressList;
    TaskList doneList;
    final TaskList taskList;

    public Board(final TaskList taskList) {
        this.taskList = taskList;
    }

    public List<String> addTask() {
        return taskList.addTask();
    }

    public String getTasks() {
        System.out.println("Tasks in the list:" + taskList);
        return taskList.getTasks();
    }
}
