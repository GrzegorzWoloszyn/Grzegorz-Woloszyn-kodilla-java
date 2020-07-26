package com.kodilla.patterns2.adapter.bookclasifier;

import com.kodilla.patterns2.adapter.bookclasifier.librarya.Book;
import com.kodilla.patterns2.adapter.bookclasifier.librarya.Classifier;
import com.kodilla.patterns2.adapter.bookclasifier.libraryb.BookSignature;

import java.util.*;

public class MedianAdapter extends MedianAdaptee implements Classifier {

    @Override
    public int publicationYearMedian(Set<Book> bookSet) {
        Map<BookSignature, Book> books = new HashMap<>();
        Iterator<Book> bookIterator = bookSet.stream()
                     .iterator();

        while(bookIterator.hasNext()) {
            Book book = bookIterator.next();
            for (int i = 0; i < bookSet.size() ; i++) {
                books.put(new BookSignature("Basic signature"), book);
            }
        }
        int[] years = new int[books.size()];
        for (int j = 0; j < books.size() ; j++) {
            for(Map.Entry<BookSignature, Book> entry : books.entrySet()) {
                years[j] = entry.getValue().getPublicationYear();
            }
        }
        Arrays.sort(years);
        if(years.length % 2 != 0) {
            int m = years[(years.length / 2)];
            System.out.println(m);
            return m;
        } else {
            int m = years[(years.length / 2) - 1] + (years[years.length / 2]);
            return m / 2;
        }
    }
}
