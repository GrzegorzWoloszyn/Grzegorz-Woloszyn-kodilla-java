package com.kodilla.patterns.prototype.library;

import org.junit.Assert;
import org.junit.Test;
import java.time.LocalDate;

public class LibraryTestSuite {
    @Test
    public void testGetBooks() {
        //Given
        Book book1 = new Book("Wlam sie do mozgu", "Radek Kotarski", LocalDate.ofYearDay(2017, 1));
        Book book2 = new Book("Sztuka efektywnosci", "Daniel J. Kubach", LocalDate.ofYearDay(2015, 10));
        Book book3 = new Book("Badz pro", "Eric Worre", LocalDate.ofYearDay(2014, 30));
        Book book4 = new Book("Wywieranie wplywu na ludzi", "Robert B. Cialdini", LocalDate.ofYearDay(2016, 56));
        Book book5 = new Book("Raport pelikana", "John Grisham", LocalDate.ofYearDay(2017, 100));

        Library myLibrary = new Library("first library");
        myLibrary.getBooks().add(book1);
        myLibrary.getBooks().add(book2);
        myLibrary.getBooks().add(book3);
        myLibrary.getBooks().add(book4);
        myLibrary.getBooks().add(book5);

        //making shallow clone of object library
        Library shallowClonedLibrary = null;

        try{
            shallowClonedLibrary = myLibrary.shallowCopy();
            shallowClonedLibrary.setName("second library");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //making deep clone of object library
        Library deepClonedLibrary = null;
        try{
            deepClonedLibrary = myLibrary.deepCopy();
            deepClonedLibrary.setName("third library");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //When
        myLibrary.getBooks().remove(book1);
        myLibrary.getBooks().remove(book5);
        //Then
        System.out.print(myLibrary);
        System.out.println(shallowClonedLibrary);
        System.out.println(deepClonedLibrary);

        Assert.assertEquals(3, myLibrary.getBooks().size());
        Assert.assertEquals(3, shallowClonedLibrary.getBooks().size());
        Assert.assertEquals(5, deepClonedLibrary.getBooks().size());

    }
}
