/*
package dom.kodilla.testing.forum.tdd;

import com.kodilla.testing.forum.ForumPost;
import com.kodilla.testing.forum.ForumUser;
import org.junit.*;

import javax.swing.plaf.basic.BasicFormattedTextFieldUI;

public class ForumTestSuite {
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
    public void testAddPost() {
        //Given
        ForumUser forumUser = new ForumUser("mrsmith", "John Smith");
        //When
        forumUser.addComment("mrsmith", "Hello everyone, this is my first contribution here.");
        //Then
        Assert.assertEquals(1, forumUser.getPostsQuantity());
    }

    @Test
    public void testAddComment() {
        //Given
        ForumUser forumUser = new ForumUser("mrsmith", "John Smith");
        ForumPost forumPost = new ForumPost("Hello everyone, " +
                "this is my first contribution here!", "mrsmith");
       //When
        forumUser.addComment(thePost,"mrsmith", "Thank you for all good words!");
        //Then
        Assert.assertEquals(1, forumUser.getCommentsQuantity());

    }

}
*/