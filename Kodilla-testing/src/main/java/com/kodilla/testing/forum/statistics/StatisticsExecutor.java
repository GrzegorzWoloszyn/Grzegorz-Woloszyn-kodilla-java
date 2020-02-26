package com.kodilla.testing.forum.statistics;

import java.util.ArrayList;
import java.util.List;

public class StatisticsExecutor {
    Statistics statistics;

    public StatisticsExecutor(Statistics statistics) {
        this.statistics = statistics;
    }

    private int users, posts, comments;
    private double averageCountOfPostsPerUser;
    private double averageCountOfUsersComments;
    private double averageCountOfCommentsPerPost;
    private List<String> user = new ArrayList<>();

    public void calculateAdvStatistics(Statistics statistics) {
        users = statistics.username().size();
        posts = statistics.postCount();
        comments = statistics.commentsCount();
        if (posts != 0) {
            averageCountOfCommentsPerPost = comments / posts;
        }else averageCountOfCommentsPerPost = -1;

        if(users != 0) {
            averageCountOfUsersComments = comments / users;
            averageCountOfPostsPerUser = posts / users;
        }else {
            averageCountOfUsersComments = -1;
            averageCountOfPostsPerUser = -1;
        }
    }

    public void showStatistics() {
        System.out.println("Number of forum users: " + users);
        System.out.println("Number of all posts: " + posts);
        System.out.println("Number of all comments: " + comments);
        System.out.println("Average number of posts per user: " + averageCountOfPostsPerUser);
        System.out.println("Average number of comments per user: " + averageCountOfUsersComments);
        System.out.println("Average number of comments per post: " + averageCountOfCommentsPerPost);
    }
}
