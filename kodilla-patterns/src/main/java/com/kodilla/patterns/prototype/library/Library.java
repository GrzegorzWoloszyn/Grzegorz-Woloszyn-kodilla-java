package com.kodilla.patterns.prototype.library;

import com.kodilla.patterns.prototype.Prototype;
import java.util.HashSet;
import java.util.Set;

public class Library extends Prototype {
    String name;
    Set<Book> books = new HashSet<>();

    public Library( String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Book> getBooks() {
        return books;
    }

    @Override
    public String toString() {
        String s = "Library: " + name + ", includes " + books.size() + " books:" + "\n";
        for (Book theBook : books) {
            s = s + theBook.toString();
        }
        return s;
    }

    public Library shallowCopy()throws CloneNotSupportedException {
        return (Library)super.clone();
    }

    public Library deepCopy() throws CloneNotSupportedException {
        Library deepClonedLibrary = (Library)super.clone();
        deepClonedLibrary.books = new HashSet<>();
        for(Book theBook : books) {
            deepClonedLibrary.getBooks().add(new Book(theBook.getTitle(), theBook.getAuthor(), theBook.getPublicationDate()));
        }
        return deepClonedLibrary;
    }
}
