package com.kodilla.patterns2.decorator.taxiportal;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class TaxiOrderTestSuite {

    @Test
    public void testBasicTaxiOrderGetCost() {
        //Given
        TaxiOrder taxiOrder = new BasicTaxiOrder();

        //When
        BigDecimal calculatedCost = taxiOrder.getCost();

        //Then
        Assert.assertEquals(new BigDecimal(5), calculatedCost);

    }

    @Test
    public void testBasicTaxiOrderGetDescription() {
        //Given
        TaxiOrder taxiOrder = new BasicTaxiOrder();

        //When
        String desc = taxiOrder.getDescription();

        //Then
        Assert.assertEquals("Drive a course", desc);
    }

    @Test
    public void testTaxiNetworkGetCost() {
        //Given
        TaxiOrder taxiOrder = new BasicTaxiOrder();
        taxiOrder = new TaxiNetworkOrderDecorator(taxiOrder);

        //When
        BigDecimal theCost = taxiOrder.getCost();

        //Then
        Assert.assertEquals(new BigDecimal(35), theCost);

    }

    @Test
    public void testTaxiNetworkGetDescription() {
        //Given
        TaxiOrder taxiOrder = new BasicTaxiOrder();
        taxiOrder = new TaxiNetworkOrderDecorator(taxiOrder);

        //When
        String desc = taxiOrder.getDescription();

        //Then
        Assert.assertEquals("Drive a course by Taxi Network", desc);
    }

    @Test
    public void testMyTaxiWithChildSeatGetCost() {
        //Given
        TaxiOrder taxiOrder = new BasicTaxiOrder();
        taxiOrder = new MyTaxiNetworkOrderDecorator(taxiOrder);
        taxiOrder = new ChildSeatDecorator(taxiOrder);

        //When
        BigDecimal theCost = taxiOrder.getCost();

        //Then
        Assert.assertEquals(new BigDecimal(37), theCost);

    }

    @Test
    public void testMyTaxiWithChildSeatGetDescription() {
        //Given
        TaxiOrder taxiOrder = new BasicTaxiOrder();
        taxiOrder = new MyTaxiNetworkOrderDecorator(taxiOrder);
        taxiOrder = new ChildSeatDecorator(taxiOrder);

        //When
        String desc = taxiOrder.getDescription();

        //Then
        Assert.assertEquals("Drive a course by MyTaxi Network + child seat", desc);
    }

    @Test
    public void testUberWithTwoChildSeatGetCost() {
        //Given
        TaxiOrder taxiOrder = new BasicTaxiOrder();
        taxiOrder = new UberNetworkOrderDecorator(taxiOrder);
        taxiOrder = new ChildSeatDecorator(taxiOrder);
        taxiOrder = new ChildSeatDecorator(taxiOrder);

        //When
        BigDecimal cost = taxiOrder.getCost();

        //Then
        Assert.assertEquals(new BigDecimal(29), cost);
    }

    @Test
    public void testUberWithTwoChildSeatGetDescription() {
        //Given
        TaxiOrder taxiOrder = new BasicTaxiOrder();
        taxiOrder = new UberNetworkOrderDecorator(taxiOrder);
        taxiOrder = new ChildSeatDecorator(taxiOrder);
        taxiOrder = new ChildSeatDecorator(taxiOrder);

        //When
        String desc = taxiOrder.getDescription();

        //Then
        Assert.assertEquals("Drive a course by Uber Network + child seat + child seat", desc);
    }

    @Test
    public void testVipTaxiWithChildSeatExpressGetCost() {
        //Given
        TaxiOrder taxiOrder = new BasicTaxiOrder();
        taxiOrder = new TaxiNetworkOrderDecorator(taxiOrder);
        taxiOrder = new VipDecorator(taxiOrder);
        taxiOrder = new ChildSeatDecorator(taxiOrder);
        System.out.println(taxiOrder.getCost());

        //When
        BigDecimal cost = taxiOrder.getCost();

        //Then
        Assert.assertEquals(new BigDecimal(47), cost);
    }
    @Test
    public void testVipTaxiWithChildSeatExpressGetDescription() {
        //Given
        TaxiOrder taxiOrder = new BasicTaxiOrder();
        taxiOrder = new TaxiNetworkOrderDecorator(taxiOrder);
        taxiOrder = new VipDecorator(taxiOrder);
        taxiOrder = new ChildSeatDecorator(taxiOrder);
        System.out.println(taxiOrder.getDescription());

        //When
        String desc = taxiOrder.getDescription();

        //Then
        Assert.assertEquals("Drive a course by Taxi Network variant VIP + child seat", desc);
    }
}
