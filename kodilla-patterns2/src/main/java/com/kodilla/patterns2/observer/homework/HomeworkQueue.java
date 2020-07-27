package com.kodilla.patterns2.observer.homework;

import java.util.ArrayList;
import java.util.List;

public class HomeworkQueue implements HomeworkObservable {

    private final List<MentorObserver> mentors;
    private final List<String> homeworks;
    private String name;

    public HomeworkQueue(String name) {
        this.name = name;
        this.mentors = new ArrayList<>();
        this.homeworks = new ArrayList<>();
    }

    public void addHomework(String title) {
        homeworks.add(title);
        notifyObservers();
    }

    @Override
    public void registerObserver(MentorObserver mentorObserver) {
        mentors.add(mentorObserver);
    }

    @Override
    public void notifyObservers() {
        for (MentorObserver mentor : mentors) {
            mentor.update(this);
        }
    }

    @Override
    public void removeObserver(MentorObserver mentorObserver) {
        mentors.remove(mentorObserver);
    }

    public List<String> getHomeworks() {
        return homeworks;
    }

    public String getName() {
        return name;
    }
}
