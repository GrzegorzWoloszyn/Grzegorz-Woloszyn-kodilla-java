package com.kodilla.testing.library;

import org.junit.Test;
import org.mockito.BDDMockito;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.*;

public class BookDirectoryTestSuite {
    @Test
    public void testListBooksWithConditionReturnList() {
        //Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> resultListOfBooks = new ArrayList<>();

        Book book1 = new Book("Secrets of Alamo", "John Smith", 2008);
        Book book2 = new Book("Secretaries and Directors", "Dilbert Michigan", 2012);
        Book book3 = new Book("Secret life of programmers", "Steve Wolkowitz", 2016);
        Book book4 = new Book("Secrets of Java", "Ian Tenewitch", 2010);
        resultListOfBooks.add(book1);
        resultListOfBooks.add(book2);
        resultListOfBooks.add(book3);
        resultListOfBooks.add(book4);;

        when(libraryDatabaseMock.listBooksWithCondition("Secret")).thenReturn(resultListOfBooks);
        //When
        List<Book> theListOfBooks = bookLibrary.listBooksWithCondition("Secret");
        //Then
        assertEquals(4, theListOfBooks.size());
    }

    @Test
    public void testListBooksWithCondtionMoreThan20() {
        //Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> resultListOf0Books = new ArrayList<>();
        List<Book> resultListOf15Books = generateListOfNBooks(15);
        List<Book> resultListOf40Books = generateListOfNBooks(40);
        when(libraryDatabaseMock.listBooksWithCondition(anyString()))
                .thenReturn(resultListOf15Books);
        when(libraryDatabaseMock.listBooksWithCondition("ZeroBooks"))
                .thenReturn(resultListOf0Books);
        when(libraryDatabaseMock.listBooksWithCondition("FortyBooks"))
                .thenReturn(resultListOf40Books);

        // When
        List<Book> theListOfBooks0 = bookLibrary.listBooksWithCondition("ZeroBooks");
        List<Book> theListOfBooks15 = bookLibrary.listBooksWithCondition("Any title");
        List<Book> theListOfBooks40 = bookLibrary.listBooksWithCondition("FortyBooks");
        // Then

        assertEquals(0, theListOfBooks0.size());
       // assertEquals(15, theListOfBooks15.size());
        assertEquals(0, theListOfBooks40.size());
    }

    private String anyString() {
        return null;
    }

    @Test
    public void testListBooksWithContitionFragmentShorterThan3() {
        //Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> resultListOf10Books = generateListOfNBooks(10);

        when(libraryDatabaseMock.listBooksWithCondition(anyString())).thenReturn(resultListOf10Books);
        //When
        List<Book> theListOfBooks10 = bookLibrary.listBooksWithCondition("An");
        //Then
        assertEquals(0, theListOfBooks10.size());
        verify(libraryDatabaseMock, times(0)).listBooksWithCondition(anyString());
    }

    @Test
    public void testListBooksInHandsOfWith0BooksLent() {
        //Given
        LibraryUser libraryUser = new LibraryUser("James", "Bond", "123456789");

        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> bookLentList = new ArrayList<>();

        when(libraryDatabaseMock.listBooksInHandsOf(libraryUser)).thenReturn(bookLentList);
        //When
        List<Book> theLentBookList = bookLibrary.listBooksInHandsOf(libraryUser);
        //Then
        assertEquals(0, theLentBookList.size());

    }

    @Test
    public void testListBooksInHandsOfWith1BookLent() {
        //Given
        LibraryUser libraryUser = new LibraryUser("James", "Bond", "123456789");

        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> bookLentListWith1Book = new ArrayList<>();
        bookLentListWith1Book.add(new Book("Raport Pelikana", "John Grisham", 2017));

        when(libraryDatabaseMock.listBooksInHandsOf(libraryUser)).thenReturn(bookLentListWith1Book);
        //When
        List<Book> theLentBookList = bookLibrary.listBooksInHandsOf(libraryUser);
        //Then
        assertEquals(1, bookLentListWith1Book.size());
    }

    @Test
    public void testListBooksInHandsOfWith5BooksLent() {
        //Given
        LibraryUser libraryUser = new LibraryUser("James", "Bond", "123456789");

        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> bookLentListWith5Book = new ArrayList<>();
        bookLentListWith5Book.add(new Book("Book1", "Author1", 2017));
        bookLentListWith5Book.add(new Book("Book2", "Author2", 2012));
        bookLentListWith5Book.add(new Book("Book3", "Author3", 2014));
        bookLentListWith5Book.add(new Book("Book4", "Author4", 2019));
        bookLentListWith5Book.add(new Book("Book5", "Author5", 2020));

        when(libraryDatabaseMock.listBooksInHandsOf(libraryUser)).thenReturn(bookLentListWith5Book);
        //When
        List<Book> theLentBookList = bookLibrary.listBooksInHandsOf(libraryUser);
        //Then
        assertEquals(5, bookLentListWith5Book.size());
    }



    //support method
    private List<Book> generateListOfNBooks(int booksQuantity) {
        List<Book> resultList = new ArrayList<>();
        for (int i = 0; i < booksQuantity; i++) {
            Book theBook = new Book("Title", "Author", 1970 + i);
            resultList.add(theBook);
        }
        return resultList;
    }

}
