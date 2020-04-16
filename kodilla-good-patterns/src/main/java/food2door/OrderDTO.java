package food2door;

public class OrderDTO {

    private String product;
    private double value;
    private boolean isOrdered;

    public OrderDTO(String product, double value, boolean isOrdered) {
        this.product = product;
        this.value = value;
        this.isOrdered = isOrdered;
    }

    public String getProduct() {
        return product;
    }

    public double getValue() {
        return value;
    }

    public boolean isOrdered() {
        return isOrdered;
    }
}
