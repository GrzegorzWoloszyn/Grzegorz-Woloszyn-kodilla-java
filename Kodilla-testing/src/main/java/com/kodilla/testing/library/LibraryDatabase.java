package com.kodilla.testing.library;

import java.util.List;

public interface LibraryDatabase {
    // lists books having title beginning with titleFragment
    List<Book> listBooksWithCondition(String titleFragment);

    // list books borrowed by libraryUser
    List<Book> listBooksInHandsOf(LibraryUser libraryUser);


    boolean rentABook(LibraryUser libraryUser);

    int retunrBooks(LibraryUser libraryUser);

}
