package com.kodilla.patterns2.observer.homework;

public interface HomeworkObservable {

    void registerObserver(MentorObserver mentorObserver);
    void notifyObserver();
    void removeObserver(MentorObserver mentorObserver);
}
