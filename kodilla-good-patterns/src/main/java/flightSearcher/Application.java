package flightSearcher;

import java.util.List;

public class Application {
    public static void main(String[] args) {

        Flight flight = new Flight("Warszawa", "Londyn");
        FlightProcessor flightProcessor = new FlightProcessor();

        List<Flight> flightsFrom = flightProcessor.findFlightFrom(flight.getFrom());
        List<Flight> flightsTo = flightProcessor.findFlightTo(flight.getTo());
        List<FlightPair> indirectFlights = flightProcessor.findIndirect(flight);

        System.out.println("All flights from: " + flight.getFrom() + " are: " + flightsFrom + ".");
        System.out.println("All flights to " + flight.getTo() + " are: " + flightsTo + ".");
        System.out.println("All connecting flights from " + flight.getFrom() + " with a changeover in " + indirectFlights +" to " + flight.getTo() + ".");
    }
}
