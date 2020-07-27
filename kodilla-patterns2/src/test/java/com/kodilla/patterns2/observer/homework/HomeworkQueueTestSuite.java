package com.kodilla.patterns2.observer.homework;

import org.junit.Assert;
import org.junit.Test;

public class HomeworkQueueTestSuite {
    @Test
    public void testUpdate() {
        //Given
        HomeworkQueue done = new QueueDone();
        HomeworkQueue inProgress = new QueueInProgress();
        HomeworkQueue toDo = new QueueToDo();

        Mentor alex = new Mentor("Alex Alex");
        Mentor ola = new Mentor("Aleksandra Aleksandra");

        done.registerObserver(alex);
        done.registerObserver(ola);
        inProgress.registerObserver(ola);
        toDo.registerObserver(alex);

        //When
        done.addHomework("Task: write a letter");
        done.addHomework("Task: send a mail");
        inProgress.addHomework("Task: buying a car. ");
        inProgress.addHomework("Task: don't do something");
        toDo.addHomework("Task: do something ");
        toDo.addHomework("Task: repair your watch");

        //Then
        Assert.assertEquals(4, alex.getCount());
        Assert.assertEquals(4, ola.getCount());

    }
}
