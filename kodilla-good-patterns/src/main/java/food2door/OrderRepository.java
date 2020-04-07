package food2door;

public interface OrderRepository {
    boolean createOrder(Manufacturer manufacturer, User user, Product product);
}
