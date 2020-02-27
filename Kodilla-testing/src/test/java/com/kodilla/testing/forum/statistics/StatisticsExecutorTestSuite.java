package com.kodilla.testing.forum.statistics;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class StatisticsExecutorTestSuite {

    private static int testCounter;

    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterClass
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @Before
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    @Test
    public void testCalculateAdvStatisticsWith0Post() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);

        when(statisticsMock.postCount()).thenReturn(0);
        when(statisticsMock.usernames()).thenReturn(Arrays.asList("John", "Poll", "Eva", "David", "Alex"));

        StatisticsExecutor statisticsExecutor = new StatisticsExecutor(statisticsMock);
        //When/Then
        statisticsExecutor.calculateAdvStatistics(statisticsMock);
        statisticsExecutor.showStatistics();
    }

    @Test
    public void testCalculateAdvStatisticsWith1000Post() {
        Statistics statisticsMock = mock(Statistics.class);

        when(statisticsMock.postCount()).thenReturn(1000);
        when(statisticsMock.usernames()).thenReturn(Arrays.asList("John", "Poll", "Eva", "David", "Alex"));

        StatisticsExecutor statisticsExecutor = new StatisticsExecutor(statisticsMock);
        //When
        statisticsExecutor.calculateAdvStatistics(statisticsMock);
        statisticsExecutor.showStatistics();
    }

    @Test
    public void testCalculateAdvStatisticsWith0comments() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);

        when(statisticsMock.commentsCount()).thenReturn(0);
        when(statisticsMock.usernames()).thenReturn(Arrays.asList("John", "Poll", "Eva", "David", "Alex"));

        StatisticsExecutor statisticsExecutor = new StatisticsExecutor(statisticsMock);
        //When
        statisticsExecutor.calculateAdvStatistics(statisticsMock);
        statisticsExecutor.showStatistics();

    }

    @Test
    public void testCalculateAdvStatisticsWithMorePostsThanComments() {
        Statistics statisticsMock = mock(Statistics.class);
        when(statisticsMock.commentsCount()).thenReturn(10);
        when(statisticsMock.postCount()).thenReturn(100);
        when(statisticsMock.usernames()).thenReturn(Arrays.asList("John", "Poll", "Eva", "David", "Alex"));

        StatisticsExecutor statisticsExecutor = new StatisticsExecutor(statisticsMock);
        //When
        statisticsExecutor.calculateAdvStatistics(statisticsMock);
        statisticsExecutor.showStatistics();
    }

    @Test
    public void testCalculateAdvStatisticsWithMorsCommentsThanPosts() {
        Statistics statisticsMock = mock(Statistics.class);
        when(statisticsMock.commentsCount()).thenReturn(100);
        when(statisticsMock.postCount()).thenReturn(10);
        when(statisticsMock.usernames()).thenReturn(Arrays.asList("John", "Poll", "Eva", "David", "Alex"));

        StatisticsExecutor statisticsExecutor = new StatisticsExecutor(statisticsMock);
        //When
        statisticsExecutor.calculateAdvStatistics(statisticsMock);
        statisticsExecutor.showStatistics();
    }

    @Test
    public void testCalculateAdvStatisticsWith0Users() {
        Statistics statisticsMock = mock(Statistics.class);
        when(statisticsMock.commentsCount()).thenReturn(100);
        when(statisticsMock.postCount()).thenReturn(10);
        when(statisticsMock.usernames()).thenReturn(Collections.emptyList());

        StatisticsExecutor statisticsExecutor = new StatisticsExecutor(statisticsMock);
        //When
        statisticsExecutor.calculateAdvStatistics(statisticsMock);
        statisticsExecutor.showStatistics();
    }

    @Test
    public void testCalculateAdvStatisticsWith100Users() {
        Statistics statisticsMock = mock(Statistics.class);
        when(statisticsMock.commentsCount()).thenReturn(100);
        when(statisticsMock.postCount()).thenReturn(10);
        List<String> users = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            users.add(i + ". user");
        }

        when(statisticsMock.usernames()).thenReturn(users);

        StatisticsExecutor statisticsExecutor = new StatisticsExecutor(statisticsMock);
        //When
        statisticsExecutor.calculateAdvStatistics(statisticsMock);
        statisticsExecutor.showStatistics();
    }

}
