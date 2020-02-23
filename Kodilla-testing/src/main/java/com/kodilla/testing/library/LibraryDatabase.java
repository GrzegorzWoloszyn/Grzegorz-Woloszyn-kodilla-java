package com.kodilla.testing.library;

import java.util.List;

public interface LibraryDatabase {

    //lists books having title beginning with titleFragment
    List<Book> listBooksWithCondition(String titleFragment);

    //list books borrowed by libraryUser
    List<Book> listBooksInHandsOf(LibraryUser libraryUser);

    //try to rent a book from library, returns true if success, falls if book is unavailable
    boolean rentABook(LibraryUser libraryUser, Book book);

    //return all books borrowed by libraryUser to the library, return number of books returned back
    int returnBooks(LibraryUser libraryUser);
}
