package flightSearcher;

import java.util.List;

public class Application {
    public static void main(String[] args) {

        Flight flight = new Flight("Warszawa", "Londyn");
        FlightProcessor flightProcessor = new FlightProcessor(new CreateFlightList(), new FindFlight(flight));

        List<Flight> flightsFrom = flightProcessor.findFlightFrom(flight);
        List<Flight> flightsTo = flightProcessor.findFlightTo(flight);
        List<FlightPair> indirectFlights = flightProcessor.findIndirect();

        System.out.println("All flights from: " + flight.getFrom() + " are: " + flightsFrom + ".");
        System.out.println("All flights to " + flight.getTo() + " are: " + flightsTo + ".");
        System.out.println("All connecting flights from " + flight.getFrom() + " with a changeover in " + indirectFlights +" to " + flight.getTo() + ".");
    }
}
