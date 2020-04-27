package com.kodilla.spring.portfolio;

import java.util.ArrayList;
import java.util.List;

public class TaskList {

    private List<String> tasks;

    public TaskList() {
        this.tasks = new ArrayList<>();
    }

    public List<String> addTask() {
        tasks.add("New Task");
        return tasks;
    }

    public String getTasks() {
        return tasks.get(0);
    }

    @Override
    public String toString() {
        return " " + tasks;
    }
}
