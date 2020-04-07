package food2door;

import java.time.LocalDateTime;

public interface InformationService {

    void inform(User user, Product product, LocalDateTime date);
}
