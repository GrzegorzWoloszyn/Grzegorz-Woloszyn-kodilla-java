package com.kodilla.testing.forum;

import com.kodilla.testing.user.SimpleUser;
import org.junit.*;

public class ForumTestSuite {
    @Before
    public void before() {
        System.out.println("Test Case: beginn...");
    }
    @After
    public void after() {
        System.out.println("Test Case: end.");
    }
    @BeforeClass
    public static void beforeClass() {
        System.out.println("Test Suite: beginn...");
    }
    @AfterClass
    public static void afterClass() {
        System.out.println("Test Suite: end.");
    }
    @Test
    public void testCaseUsername() {
        //Given
        SimpleUser simpleUser = new SimpleUser("theForumUser", "John McArthur");
        //When
        String result = simpleUser.getUsername();
        System.out.println("Testing: " +  result);
        //Then
        Assert.assertEquals("theForumUser", result);
    }
    @Test
    public void testCaseRealname() {
        //Given
        SimpleUser simpleUser = new SimpleUser("theForumUser", "John McArthur");
        //When
        String result = simpleUser.getRealname();
        System.out.println("Testing: " +  result);
        //Then
        Assert.assertEquals("John McArthur", result);
    }
}
