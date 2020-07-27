package com.kodilla.patterns2.adapter.bookclasifier;

import com.kodilla.patterns2.adapter.bookclasifier.librarya.Book;
import com.kodilla.patterns2.adapter.bookclasifier.librarya.Classifier;
import com.kodilla.patterns2.adapter.bookclasifier.libraryb.BookSignature;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MedianAdapter extends MedianAdaptee implements Classifier {

    @Override
    public int publicationYearMedian( Set<Book> bookSet) {
        Map<BookSignature, com.kodilla.patterns2.adapter.bookclasifier.libraryb.Book> books = new HashMap<>();
        Iterator<Book> iterator = bookSet.stream()
                .iterator();

        while( iterator.hasNext()) {
            Book book = iterator.next();
            com.kodilla.patterns2.adapter.bookclasifier.libraryb.Book bookB = mapBookAToBookB(book);
            books.put(new BookSignature(book.getSignature()), bookB);
        }
        return medianPublicationYear(books);
    }

    private static com.kodilla.patterns2.adapter.bookclasifier.libraryb.Book mapBookAToBookB( Book book) {
        return new com.kodilla.patterns2.adapter.bookclasifier.libraryb.Book
                (book.getAuthor(), book.getTitle(), book.getPublicationYear());
    }
}
