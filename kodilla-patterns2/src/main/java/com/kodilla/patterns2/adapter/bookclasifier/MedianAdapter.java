package com.kodilla.patterns2.adapter.bookclasifier;

import com.kodilla.patterns2.adapter.bookclasifier.librarya.Book;
import com.kodilla.patterns2.adapter.bookclasifier.librarya.Classifier;
import com.kodilla.patterns2.adapter.bookclasifier.libraryb.BookSignature;

import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class MedianAdapter extends MedianAdaptee implements Classifier {

    @Override
    public int publicationYearMedian (Set<Book> bookSet) {

        Map<BookSignature, com.kodilla.patterns2.adapter.bookclasifier.libraryb.Book> books = bookSet.stream()
            .collect(Collectors.toMap(this::createSignature, this::mapBookAToBookB));

        return medianPublicationYear(books);
    }

    private com.kodilla.patterns2.adapter.bookclasifier.libraryb.Book mapBookAToBookB(Book book) {
        return new com.kodilla.patterns2.adapter.bookclasifier.libraryb.Book
                (book.getAuthor(), book.getTitle(), book.getPublicationYear());
    }
    private BookSignature createSignature(Book book) {
        return new BookSignature(book.getSignature());
    }
}
