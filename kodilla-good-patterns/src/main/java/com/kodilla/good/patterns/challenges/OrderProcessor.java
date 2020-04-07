package com.kodilla.good.patterns.challenges;

public class OrderProcessor {

    private InformationService informationService;
    private OrderService orderService;
    private OrderRepository orderRepository;

    public OrderProcessor(InformationService informationService, OrderService orderService, OrderRepository orderRepository) {
        this.informationService = informationService;
        this.orderService = orderService;
        this.orderRepository = orderRepository;
    }

    public RentalDTO2 process(OrderRequest orderRequest) {
        boolean isOrdered = orderService.order(orderRequest.getUser(), orderRequest.getProduct(), orderRequest.getDate());

        if(isOrdered) {
            informationService.inform(orderRequest.getUser(), orderRequest.getProduct(), orderRequest.getDate());
            orderRepository.createOrder(orderRequest.getUser(), orderRequest.getProduct(), orderRequest.getDate());
            return new RentalDTO2(orderRequest.getUser(), orderRequest.getProduct(), true);
        }

        return new RentalDTO2(orderRequest.getUser(), orderRequest.getProduct(), false);
    }
}
