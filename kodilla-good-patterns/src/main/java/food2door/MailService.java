package food2door;


import javax.swing.*;
import java.time.LocalDateTime;

public class MailService implements InformationService {


    @Override
    public void inform(User user, Product product, LocalDateTime date) {
        new JOptionPane("User: " + user.getName() + " " + user.getSurname() +" ordered on : " + date + " " + product.getProductAmount() + " " +
                product.getProductName() + " for price" + product.getProductPrice() + ". Amount to pay: " + product.getOrderValue() +
                "Product category: " + product.getProductCategory() + ". Product available? " + product.isAvailable());
    }
}
