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

        Item pcItem = new Item(new BigDecimal(100.79), 10);
        Item carItem = new Item(new BigDecimal(1000.99), 2);
        Item bedItem = new Item(new BigDecimal(250.50), 5);

        Invoice invoice = new Invoice("1");
        pcItem.setProduct(pc);
        pcItem.setInvoice(invoice);

        carItem.setProduct(car);
        carItem.setInvoice(invoice);

        bedItem.setProduct(bed);
        bedItem.setInvoice(invoice);

        pc.getItemList().add(pcItem);
        car.getItemList().add(carItem);
        bed.getItemList().add(bedItem);

        invoice.getItems().add(pcItem);
        invoice.getItems().add(carItem);
        invoice.getItems().add(bedItem);

        //When
        invoiceDao.save(invoice);
        int id = invoice.getId();

        //Then
        Assert.assertNotEquals(0, id);

        //Cleanup
        try {
            invoiceDao.deleteById(id);
        } catch (Exception e) {}
    }
}
