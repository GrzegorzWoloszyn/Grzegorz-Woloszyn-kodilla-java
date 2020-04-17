package food2door;

public class Application {

    public static void main(String[] args) {

        CheckOrder checkOrder = new CheckOrder();
        Producer producer = checkOrder.check("Chia", 6.6);
        OrderProcessor orderProcessor = new OrderProcessor(new InformationService(), new OrderRepository());
        orderProcessor.run(producer);
    }
}
