package com.kodilla.patterns2.observer.homework;

public class Mentor implements MentorObserver {

    private final String name;
    private int count;

    public Mentor(String name) {
        this.name = name;
    }

    @Override
    public void update(HomeworkQueue forum) {
        System.out.println(name + "! You got a new homework in line: " + forum.getName() + ". All your homeworks: " + forum.getHomeworks().size() + ".");
        count++;
    }

    public int getCount() {
        return count;
    }
}
