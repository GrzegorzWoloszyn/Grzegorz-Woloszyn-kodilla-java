package com.kodilla.testing.forum.statistics;

import org.junit.*;

import java.text.CollationElementIterator;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class StatisticsExecutorTestSuite {
    private static int testCounter = 0;
    private List<String> posts = new ArrayList<>();
    private List<String> comments = new ArrayList<>();
    private List<String> users = new ArrayList<>();


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
    public void testCalculateAdvStatisticsWith0Posts() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        StatisticsExecutor statisticsExecutor = new StatisticsExecutor(statisticsMock);

        when(statisticsMock.postsCount()).thenReturn(Collections.emptyList().size());
        //When
        int result = statisticsExecutor.calculateAdvStatistics(statisticsMock.postsCount());

        //Then
        assertEquals(0, result);
    }

    @Test
    public void testCalculateAdvStatisticsWith1000Posts() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        StatisticsExecutor statisticsExecutor = new StatisticsExecutor(statisticsMock);
        for (int i = 0; i <1000; i++) {
            posts.add("Post #" + i);
        }

        when(statisticsMock.postsCount()).thenReturn(posts.size());
        //When
        int result = statisticsExecutor.calculateAdvStatistics(statisticsMock.postsCount());

        //Then
        assertEquals(1000, result);
    }

    @Test
    public void testCalculateAdvStatisticsWith0Comments() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        StatisticsExecutor statisticsExecutor = new StatisticsExecutor(statisticsMock);

        when(statisticsMock.commentsCount()).thenReturn(Collections.emptyList().size());
        //When
        int result = statisticsExecutor.calculateAdvStatistics(statisticsMock.commentsCount());
        //Then
        assertEquals(0, result);
    }

    @Test
    public void testCalculateAdvStatisticsWithLessCommentsThanPosts() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        StatisticsExecutor statisticsExecutor = new StatisticsExecutor(statisticsMock);
        for (int i = 0; i <100; i++) {
            posts.add("Post #" + i);
        }
        for (int i = 0; i <50; i++) {
            comments.add("Comment #" + i);
        }

        when(statisticsMock.commentsCount()).thenReturn(comments.size());
        when(statisticsMock.postsCount()).thenReturn(posts.size());

        //When
        int result1 = statisticsExecutor.calculateAdvStatistics(statisticsMock.postsCount());
        int result2 = statisticsExecutor.calculateAdvStatistics(statisticsMock.commentsCount());

        //Then

    }

    @Test
    public void testCalculateAdvStatisticsWithMoreCommentsThanPosts() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        StatisticsExecutor statisticsExecutor = new StatisticsExecutor(statisticsMock);
        for (int i = 0; i <50; i++) {
            posts.add("Post #" + i);
        }
        for (int i = 0; i <100; i++) {
            comments.add("Comment #" + i);
        }

        when(statisticsMock.commentsCount()).thenReturn(comments.size());
        when(statisticsMock.postsCount()).thenReturn(posts.size());
        //When
        int result1 = statisticsExecutor.calculateAdvStatistics(statisticsMock.postsCount());
        int result2 = statisticsExecutor.calculateAdvStatistics(statisticsMock.commentsCount());
        //Then
    }

    @Test
    public void testCalculateAdvStatisticsWith0Users() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        StatisticsExecutor statisticsExecutor = new StatisticsExecutor(statisticsMock);

        when(statisticsMock.userNames()).thenReturn(Collections.emptyList());
        //When
        int result = statisticsExecutor.calculateAdvStatistics(statisticsMock.userNames().size());
        //Then
        assertEquals(0, result);
    }

    @Test
    public void testCalculateAdvStatisticsWith100Users() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        StatisticsExecutor statisticsExecutor = new StatisticsExecutor(statisticsMock);
        for (int i = 0; i <100; i++) {
            users.add("User #" + i);
        }
        when(statisticsMock.userNames()).thenReturn(users);
        //When
        int result = statisticsExecutor.calculateAdvStatistics(statisticsMock.userNames());
        //Then
        assertEquals(100, result);
    }

    @Test
    public void testShowStatistics() {
        Statistics statisticsMock = mock(Statistics.class);
        StatisticsExecutor statisticsExecutor = new StatisticsExecutor(statisticsMock);
        statisticsExecutor.showStatistics();
    }

}
