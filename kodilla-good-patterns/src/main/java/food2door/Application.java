package food2door;

public class Application {

    public static void main(String[] args) {
        ManufacturerRequestRetriever manufacturerRequestRetriever = new ManufacturerRequestRetriever();
        ManufacturerRequest manufacturerRequest = manufacturerRequestRetriever.retrieve();


        ContractProcessor contractProcessor = new ContractProcessor();
        contractProcessor.process();
    }
}
