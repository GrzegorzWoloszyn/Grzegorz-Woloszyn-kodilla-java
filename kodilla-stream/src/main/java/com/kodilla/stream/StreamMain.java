package com.kodilla.stream;

import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;
import java.util.Date;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {
    public static void main(String[] args) {
        Forum forum = new Forum();
        Date limitDate = new Date();

        Map<Integer, ForumUser> theResultMapOfForumusers = forum.getUserList().stream()
                .filter(forumUser -> forumUser.getBd().getYear() <= 2000)
                .filter(forumUser -> forumUser.getSex() == 'M')
                .filter(forumUser -> forumUser.getPostCount() >= 1)
                .collect(Collectors.toMap(ForumUser::getId, forumUser -> forumUser));

        System.out.println("# users in the map: " + theResultMapOfForumusers.size());
        theResultMapOfForumusers.entrySet().stream()
                .map(entry -> entry.getKey() + " >> " + entry.getValue())
                .forEach(System.out::println);
    }

}
