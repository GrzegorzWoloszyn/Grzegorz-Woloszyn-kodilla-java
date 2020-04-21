package flightSearcher;

import java.util.List;

public class Application {
    public static void main(String[] args) {

        List<Flight> flightList = CreateFlightList.getAllFlights();
        Flight flight = new Flight("Warszawa", "Londyn");

        FlightProcessor flightProcessor = new FlightProcessor(flightList);
        List<Flight> flightsFrom = flightProcessor.findFlightFrom(flight.getFrom());
        List<Flight> flightsTo = flightProcessor.findFlightTo(flight.getTo());
        List<FlightPair> indirectFlights = flightProcessor.findIndirect(flight.getFrom(), flight.getTo());

        System.out.println("All flights from: " + flight.getFrom() + " are: " + flightsFrom + ".");
        System.out.println("All flights to " + flight.getTo() + " are: " + flightsTo + ".");
        System.out.println("All connecting flights from " + flight.getFrom() +" to " + flight.getTo() + " are: " +
                indirectFlights + ".");
        }
    }

