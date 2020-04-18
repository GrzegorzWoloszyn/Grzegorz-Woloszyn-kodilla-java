package flightSearcher;

import javafx.util.Pair;

import java.util.List;

public class Application {
    public static void main(String[] args) {

        Flight flight = new Flight("Kraków", "Londyn");
        FlightProcessor flightProcessor = new FlightProcessor(new CreateFlightList(), new FindFlight(flight));

        List<Flight> flightsFrom = flightProcessor.processForDeparture();
        List<Flight> flightsTo = flightProcessor.processForArrival();
        List<Pair<Flight, Flight>> connectingFlights = flightProcessor.processForConnectedFlights();

        System.out.println(flightsFrom);
        System.out.println(flightsTo);
        System.out.println(connectingFlights);
    }

}
