package food2door;

import java.time.LocalDateTime;

public class OrderProcessor {
    InformationService informationService;
    OrderRepository orderRepository;


    public OrderProcessor(InformationService informationService, OrderRepository orderRepository) {
        this.informationService = informationService;
        this.orderRepository = orderRepository;
    }

    public OrderDTO run(Producer producer) {
        boolean isOrdered = producer.process();

        if(isOrdered) {
            orderRepository.createOrder();
            informationService.inform(producer.getProduct(), producer, LocalDateTime.now());
            return new OrderDTO(producer.getProduct(), producer.getValue(), true);
        } else {
            return new OrderDTO(producer.getProduct(), producer.getValue(), false);
        }
    }
}
