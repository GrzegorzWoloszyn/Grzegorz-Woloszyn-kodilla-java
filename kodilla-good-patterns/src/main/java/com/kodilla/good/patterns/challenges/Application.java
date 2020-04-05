package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public class Application {

    public static void main(String[] args) {
//        RentRequestRetriever rentRequestRetriever = new RentRequestRetriever();
//        RentRequest rentRequest = rentRequestRetriever.retrieve();
//
//        RentalProcessor rentalProcessor = new RentalProcessor(new MailService(), new CarRentalService(), new CarRentalRepository());
//        rentalProcessor.process(rentRequest);

        OrderRequestRetriever orderRequestRetriever = new OrderRequestRetriever();
        OrderRequest orderRequest = orderRequestRetriever.retrieve();

        OrderProcessor orderProcessor = new OrderProcessor(new MailService(), new ProductOrderService(), new ProductOrderRepository());
        orderProcessor.process(orderRequest);

    }
}
