package com.kodilla.testing.forum.statistics;

import org.junit.*;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class StatisticsAppTestSuite {
    private static int testCounter = 0;

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
        List<String> usersList = new ArrayList<>();
        usersList.add(null);
        when(statisticsMock.userNames()).thenReturn(usersList);

        StatisticsApp statisticsApp = new StatisticsApp(statisticsMock);

        //When
        int postsCount = statisticsApp.postsCount(0);

        //Then
        Assert.assertEquals(0, postsCount);
    }

    @Test
    public void testCalculateAdvStatisticsWith1000Posts() {
        //Given
        List<String> posts = new ArrayList<>();
        Statistics statisticsMock = mock(Statistics.class);
        when(statisticsMock.userNames()).thenReturn(posts);

        StatisticsApp statisticsApp = new StatisticsApp(statisticsMock);
        //When
        int postsCount = statisticsApp.postsCount(1000);
        //Then
        Assert.assertEquals(1000, postsCount);
    }

    @Test
    public void testCalculateAdvStatisticsWith0Comments() {
        //Given
        List<String> comments = new ArrayList<>();
        Statistics statisticsMock = mock(Statistics.class);
        when(statisticsMock.userNames()).thenReturn(comments);

        StatisticsApp statisticsApp = new StatisticsApp(statisticsMock);
        //When
        int commentsCount = statisticsApp.commentsCount();
        //Then
        Assert.assertEquals(0, commentsCount);
    }

    @Test
    public void testCalculateAdvStatisticsWithLessCommentsThanPosts() {
        //Given
        List<String> comments = new ArrayList<>();
        List<String> posts = new ArrayList<>();
        Statistics statisticsMock = mock(Statistics.class);
        when(statisticsMock.userNames()).thenReturn(comments);
        when(statisticsMock.userNames()).thenReturn(posts);

        StatisticsApp statisticsApp = new StatisticsApp(statisticsMock);
        //When
        //Then

    }

    @Test
    public void testCalculateAdvStatisticsWithMoreCommentsThanPosts() {
        //Given
        //When
        //Then
    }

    @Test
    public void testCalculateAdvStatisticsWith0Users() {
        //Given

        //When

        //Then
    }

    @Test
    public void testCalculateAdvStatisticsWith100Users() {
        //Given

        //When

        //Then
    }


}
