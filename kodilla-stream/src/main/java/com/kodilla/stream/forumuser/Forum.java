package com.kodilla.stream.forumuser;

import java.util.ArrayList;
import java.util.List;

public class Forum {
    private final List<ForumUser> forumUserList = new ArrayList<>();

    public Forum() {
        forumUserList.add(new ForumUser(101, "Pawel", 'M', 1990, 4,10, 0 ));
        forumUserList.add(new ForumUser(102, "Gienek", 'M', 2001, 1,11, 110 ));
        forumUserList.add(new ForumUser(103, "Ola", 'F', 2002, 11,16, 120 ));
        forumUserList.add(new ForumUser(104, "Kasia", 'F', 2003, 7,30, 90 ));
        forumUserList.add(new ForumUser(105, "Jerzy", 'M', 1989, 9,20, 910 ));
        forumUserList.add(new ForumUser(106, "Placek", 'M', 1970, 8,20, 1 ));
        forumUserList.add(new ForumUser(107, "Janek", 'M', 1989, 9,20, 9 ));
        forumUserList.add(new ForumUser(108, "Krysia", 'F', 2010, 9,20, 10 ));
        forumUserList.add(new ForumUser(109, "Marcel", 'M', 1700, 9,20, 21 ));
        forumUserList.add(new ForumUser(110, "Asia", 'F', 1410, 11,20, 10 ));
        forumUserList.add(new ForumUser(110, "Jakub", 'M', 2000, 02,20, 7 ));
    }

    public List<ForumUser> getUserList() {
        return new ArrayList<>(forumUserList);

    }
}
