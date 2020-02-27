package com.kodilla.testing.forum.statistics;

public class StatisticsExecutor {

    public StatisticsExecutor(Statistics statistics) {
    }

    private int userSize;
    private int posts;
    private int comments;
    private double averageCountOfPostsPerUser;
    private double averageCountOfUsersComments;
    private double averageCountOfCommentsPerPost;

    public void calculateAdvStatistics(Statistics statistics) {
        userSize = statistics.usernames().size();
        posts = statistics.postCount();
        comments = statistics.commentsCount();
        if (posts != 0) {
            averageCountOfCommentsPerPost = comments / posts;
        }else averageCountOfCommentsPerPost = -1;

        if(userSize != 0) {
            averageCountOfUsersComments = comments / userSize;
            averageCountOfPostsPerUser = posts / userSize;
        }else {
            averageCountOfUsersComments = -1;
            averageCountOfPostsPerUser = -1;
        }
    }

    public void showStatistics() {
        System.out.println("Number of forum users: " + userSize);
        System.out.println("Number of all posts: " + posts);
        System.out.println("Number of all comments: " + comments);
        System.out.println("Average number of posts per user: " + averageCountOfPostsPerUser);
        System.out.println("Average number of comments per user: " + averageCountOfUsersComments);
        System.out.println("Average number of comments per post: " + averageCountOfCommentsPerPost);
    }
}
