package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookclasifier.MedianAdapter;
import com.kodilla.patterns2.adapter.bookclasifier.librarya.Book;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

public class MedianAdapterTestSuite {

    @Test
    public void publicationYearMedianTestForEven() {
        //Given
        MedianAdapter medianAdapter = new MedianAdapter();
        Set<Book> books = new HashSet<>();
        books.add(new Book("Author1", "Title1", 2000, "Signature1"));
        books.add(new Book("Author2", "Title2", 2020, "Signature2"));
        books.add(new Book("Author3", "Title3", 2015, "Signature3"));
        books.add(new Book("Author4", "Title4", 2005, "Signature4"));

        //When
        int result = medianAdapter.publicationYearMedian(books);

        //Then
        System.out.println(books);
        Assert.assertEquals(2010, result);
    }

    @Test
    public void publicationYearMedianTestForOdd() {
        //Given
        MedianAdapter medianAdapter = new MedianAdapter();
        Set<Book> books2 = new HashSet<>();
        books2.add(new Book("Author1", "Title1", 2000, "Signature1"));
        books2.add(new Book("Author2", "Title2", 2020, "Signature2"));
        books2.add(new Book("Author3", "Title3", 2015, "Signature3"));
        books2.add(new Book("Author4", "Title4", 2010, "Signature4"));
        books2.add(new Book("Author5", "Title5", 1990, "Signature5"));

        //When
        int result = medianAdapter.publicationYearMedian(books2);

        //Then
        System.out.println(books2);
        Assert.assertEquals(2010, result);
    }
}
