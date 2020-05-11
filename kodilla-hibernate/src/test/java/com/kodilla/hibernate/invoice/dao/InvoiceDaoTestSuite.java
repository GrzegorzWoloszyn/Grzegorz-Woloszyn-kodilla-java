package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;

@RunWith(SpringRunner.class)
@SpringBootTest
public class InvoiceDaoTestSuite {
    @Autowired
    InvoiceDao invoiceDao;

    @Test
    public void testInvoiceDaoSave() {
        //Given
        Product pc = new Product("PersonalComputer");
        Product car = new Product("Ford Fiesta");
        Product bed = new Product("Water bed");
        Product cream = new Product("Hand cream");

        Item item = new Item(new BigDecimal(100), 10, new BigDecimal(1000));
        pc.setItem(item);
        car.setItem(item);
        bed.setItem(item);
        cream.setItem(item);

        pc.setItem(item);
        car.setItem(item);
        bed.setItem(item);
        cream.setItem(item);

        Invoice invoice = new Invoice("The first Invoice.");
        invoice.getItems().add(item);

        //When
        invoiceDao.save(invoice);
        int id = invoice.getId();

        //Then
        Assert.assertEquals(1, id);

        //Cleanup
        invoiceDao.deleteById(id);
    }
}
