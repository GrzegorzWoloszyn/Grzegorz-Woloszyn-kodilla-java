package food2door;

import java.time.LocalDateTime;

public class ManufacturerRequestRetriever {

    public ManufacturerRequest retrieve() {
        Manufacturer manufacturer = new Manufacturer("VillageFood", "Pszczyna Dolna");
        Product carrot = new Product("Carrot", "Vegetable", 8.00, 10, true);
        User user = new User("John", "Pieto");

        return new ManufacturerRequest(manufacturer, carrot, user);
    }
}
