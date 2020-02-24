package com.kodilla.testing.forum.statistics;

import java.util.ArrayList;
import java.util.List;

public class StatisticsExecutor{

    Statistics statistics = new Statistics() {
        @Override
        public List<String> userNames() {
            return null;
        }

        @Override
        public int postsCount() {
            return 0;
        }

        @Override
        public int commentsCount() {
            return 0;
        }
    };
    private int usersCount, postsCount, commentsCount;
    private int averageCountOfPostsPerUser;
    private int averageCountOfUsersComments;
    private int averageCountOfCommentsPerPost;
    private List<String> posts = new ArrayList<>();
    private List<String> comments = new ArrayList<>();
    private List<String> users = new ArrayList<>();

    public StatisticsExecutor(Statistics statistics) {
        this.statistics = statistics;
    }


    public void calculateAdvStatistics(Statistics statistics) {
        usersCount = statistics.userNames().size();
        postsCount = statistics.postsCount();
        commentsCount = statistics.commentsCount();
        if (usersCount != 0 || postsCount != 0) {
            averageCountOfUsersComments = commentsCount / usersCount;
            averageCountOfPostsPerUser = postsCount / usersCount;
            averageCountOfCommentsPerPost = commentsCount / postsCount;
        }
    }

    public void showStatistics() {

        System.out.println("Number of forum users: " + usersCount);
        System.out.println("Number of all posts: " + postsCount);
        System.out.println("Number of all comments: " + commentsCount);
        System.out.println("Average number of posts per user: " + averageCountOfPostsPerUser);
        System.out.println("Average number of comments per user: " + averageCountOfUsersComments);
        System.out.println("Average number of comments per post: " + averageCountOfCommentsPerPost);
    }

}
