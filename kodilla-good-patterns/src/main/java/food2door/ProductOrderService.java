package food2door;

public class ProductOrderService implements OrderService {
    @Override
    public boolean order(Manufacturer manufacturer, User user, Product product) {
        return true;
    }
}
