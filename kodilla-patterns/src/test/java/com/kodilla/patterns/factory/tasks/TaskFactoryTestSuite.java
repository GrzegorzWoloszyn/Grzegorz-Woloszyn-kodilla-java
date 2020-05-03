package com.kodilla.patterns.factory.tasks;

import org.junit.Assert;
import org.junit.Test;

public class TaskFactoryTestSuite {
    @Test
    public void testExecuteShopping() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task shopping = factory.executeTask(TaskFactory.SHOPPING);
        boolean isExecuted = shopping.isTaskExecuted();
        //Then
        Assert.assertEquals("Shopping in LA.", shopping.getTaskName());
        Assert.assertFalse(isExecuted);
    }

    @Test
    public void testExecutePainting() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task painting = factory.executeTask(TaskFactory.PAINTING);
        boolean isExecuted = painting.isTaskExecuted();
        //Then
        Assert.assertEquals("Painting...", painting.getTaskName());
        Assert.assertTrue(isExecuted);
    }

    @Test
    public void testExecuteDriving() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task driving = factory.executeTask(TaskFactory.DRIVING);
        boolean isExecuted = driving.isTaskExecuted();
        //Then
        Assert.assertEquals("Driving to...", driving.getTaskName());
        Assert.assertTrue(isExecuted);
    }

}
