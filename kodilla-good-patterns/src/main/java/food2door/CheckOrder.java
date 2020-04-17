package food2door;

public class CheckOrder {

    public Producer check(String product, double value) {

        if(value < 5) {
            return new ExtraFoodShop(product, value);
        } else if (value >=5 && value <10) {
            return new HealthyShop(product, value);
        } else return new GlutenFreeShop(product, value);
    }
}
