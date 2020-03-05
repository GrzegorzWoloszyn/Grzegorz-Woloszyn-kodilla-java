package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.Objects;

public class ForumUser {
    private final int id;
    private final String username;
    private final char sex;
    final LocalDate bd;
    private final int postCount;

    public ForumUser(final int id, final String username, final char sex, final int yearOfBirth, final int monthOfBirth, final int dayOfBirth, final int postCount) {
        this.id = id;
        this.username = username;
        this.sex = sex;
        this.bd = LocalDate.of(yearOfBirth, monthOfBirth, dayOfBirth);
        this.postCount = postCount;
    }

    public int getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public char getSex() {
        return sex;
    }

    public LocalDate getBd() {
        return bd;
    }

    public int getPostCount() {
        return postCount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ForumUser forumUser = (ForumUser) o;
        return id == forumUser.id &&
                sex == forumUser.sex &&
                postCount == forumUser.postCount &&
                username.equals(forumUser.username) &&
                bd.equals(forumUser.bd);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, username, sex, bd, postCount);
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", sex=" + sex +
                ", bd=" + bd +
                ", postCount=" + postCount +
                '}';
    }
}
