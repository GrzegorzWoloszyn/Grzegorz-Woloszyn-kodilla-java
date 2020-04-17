package food2door;

public class HealthyShop implements Producer {

    private String product;
    private double value;

    public HealthyShop(String product, double value) {
        this.product = product;
        this.value = value;
    }

    @Override
    public String getProduct() {
        return product;
    }

    @Override
    public double getValue() {
        return value;
    }

    @Override
    public boolean process() {
        System.out.println("Thank you for purchasing our products :)");
        return true;
    }

    @Override
    public String toString() {
        return "HealthyShop";
    }
}
