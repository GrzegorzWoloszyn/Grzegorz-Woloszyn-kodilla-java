package food2door;

import java.time.LocalDateTime;

public class ContractProcessor {
    private OrderService orderService;
    private OrderRepository orderRepository;
    private InformationService informationService;

    public ContractProcessor(OrderService orderService, OrderRepository orderRepository, InformationService informationService) {
        this.orderService = orderService;
        this.orderRepository = orderRepository;
        this.informationService = informationService;
    }

    public OrderDto process(ManufacturerRequest manufacturerRequest) {
        boolean isOrdered = orderService.order(manufacturerRequest.getManufacturer(), manufacturerRequest.getUser(), manufacturerRequest.getProduct());

        if(isOrdered) {
            informationService.inform(manufacturerRequest.getUser(), manufacturerRequest.getProduct(), LocalDateTime.now());
            orderRepository.createOrder(manufacturerRequest.getManufacturer(), manufacturerRequest.getUser(), manufacturerRequest.getProduct());
            return new OrderDto(manufacturerRequest.getUser(), manufacturerRequest.getProduct(), true);
        } else {
            return new OrderDto(manufacturerRequest.getUser(), manufacturerRequest.getProduct(), false);
        }

    }
}
