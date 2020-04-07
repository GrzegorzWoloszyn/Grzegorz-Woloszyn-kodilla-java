package food2door;

public class Product {

    private String productName;
    private String productCategory;
    private double productPrice;
    private int productAmount;
    private boolean isAvailable;

    public Product(String productName, String productCategory, double productPrice, int productAmount,  boolean isAvailable) {
        this.productName = productName;
        this.productCategory = productCategory;
        this.productPrice = productPrice;
        this.productAmount = productAmount;
        this.isAvailable = isAvailable;
    }

    public String getProductName() {
        return productName;
    }

    public String getProductCategory() {
        return productCategory;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public int getProductAmount() {
        return productAmount;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public double getOrderValue() {
        return productAmount * productPrice;
    }
}
