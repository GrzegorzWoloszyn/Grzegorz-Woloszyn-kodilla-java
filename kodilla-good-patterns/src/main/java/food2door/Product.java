package food2door;

public class Product {

    private String productName;
    private String category;


    public Product(String productName, String category) {
        this.productName = productName;
        this.category = category;
     }

    public String getProductName() {
        return productName;
    }

    public String getProductCategory() {
        return category;
    }

}
