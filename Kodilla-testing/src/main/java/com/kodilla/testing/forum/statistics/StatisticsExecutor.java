package com.kodilla.testing.forum.statistics;

import java.util.ArrayList;
import java.util.List;

public class StatisticsExecutor{

    Statistics statistics;
    private int usersCount, postsCount, commentsCount;
   private int averageCountOfPostsPerUser = 0;
    int averageCountOfUserscComments = 0;
    int averageCountOfCommentsPerPost = 0;
    private List<String> posts = new ArrayList<>();
    private List<String> comments = new ArrayList<>();
    private List<String> users = new ArrayList<>();

    public StatisticsExecutor(Statistics statistics) {

        this.statistics = statistics;
    }


    public void calculateAdvStatistics(Statistics statistics) {
        usersCount = users.size();
        postsCount = statistics.postsCount();
        commentsCount = comments.size();
        if (usersCount != 0 || postsCount != 0) {
            averageCountOfUserscComments = commentsCount / usersCount;
            averageCountOfPostsPerUser = postsCount / usersCount;
            averageCountOfCommentsPerPost = commentsCount / postsCount;
        }
    }

    public void showStatistics() {
        System.out.println("Number of forum users: " + usersCount);
        System.out.println("Number of all posts: " + postsCount);
        System.out.println("Number of all comments: " + commentsCount);
        System.out.println("Average number of posts per user: " + averageCountOfPostsPerUser);
        System.out.println("Average number of comments per user: " + averageCountOfUserscComments);
        System.out.println("Average number of comments per post: " + averageCountOfCommentsPerPost);

    }

}
