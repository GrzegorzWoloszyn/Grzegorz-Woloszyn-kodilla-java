package food2door;

import java.time.LocalDateTime;

public class InformationService {

    public void inform(String product, Producer producer, LocalDateTime date) {
        System.out.println("Order date: " + date + ". Ordered products: " + product + ", producer: " + producer);
    }

    @Override
    public String toString() {
        return "InformationService{}";
    }
}
