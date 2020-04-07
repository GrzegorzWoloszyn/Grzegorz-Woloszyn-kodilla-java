package food2door;

public class ManufacturerRequest {

    Manufacturer manufacturer;
    Product product;
    User user;

    public ManufacturerRequest(Manufacturer manufacturer, Product product, User user) {
        this.manufacturer = manufacturer;
        this.product = product;
        this.user = user;
    }

    public Manufacturer getManufacturer() {
        return manufacturer;
    }

    public Product getProduct() {
        return product;
    }

    public User getUser() {
        return user;
    }
}


