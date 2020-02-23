package com.kodilla.testing.forum.statistics;

import java.util.ArrayList;
import java.util.List;

public class StatisticsApp implements Statistics {

    Statistics statistics;
    private int usersCount;
    private int postsCount;
    private int commentsCount;
    int averageCountOfPostsPerUser = 0;
    int averageCountOfUserscComments = 0;
    int averageCountOfCommentsPerPost = 0;
    private List<String> usersName = new ArrayList<>();
    private List<String> comments = new ArrayList<>();

    public StatisticsApp(Statistics statistics) {
        this.statistics = statistics;
    }

    @Override
    public List<String> userNames() {
        int position = 0;
        for (String name :statistics.userNames()) {
            position++;
            usersName.add("user #: " + position + ".git ");
        }
        return usersName;
    }

    @Override
    public int postsCount(int postNumber) {

        for (int i = 0; i <postNumber; i++) {
            comments.add("User " + i);
        }

        return comments.size();
    }

    @Override
    public int commentsCount() {
        commentsCount = comments.size();
        return commentsCount;
    }

    public void calculateAdvStatistics(Statistics statistics) {

        usersCount = statistics.userNames().size();

        if (usersCount != 0 || postsCount != 0) {
            averageCountOfUserscComments = commentsCount / usersCount;
            averageCountOfPostsPerUser = postsCount / usersCount;
            averageCountOfCommentsPerPost = commentsCount / postsCount;
        }

    }

    public int showStatistics() {
        return 0;

    }

}
