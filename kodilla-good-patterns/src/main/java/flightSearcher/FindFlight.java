package flightSearcher;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FindFlight {

    public Flight flight;
    CreateFlightList createFlightList = new CreateFlightList();

    public FindFlight(Flight flight) {
        this.flight = flight;
    }

    public List<Flight> findFlightTo(String flightTo) {
        List<Flight> flights = createFlightList.getAllFlights();

        return flights.stream()
                .filter(flight1 -> flight1.getTo().equals(flightTo))
                .collect(Collectors.toList());
    }

    public List<Flight> findFlightFrom(String flightFrom) {
        List<Flight> flights = createFlightList.getAllFlights();

        return flights.stream()
                .filter(flight1 -> flight1.getFrom().equals(flightFrom))
                .collect(Collectors.toList());
    }

    public List<FlightPair> findIndirectFlights() {
        List<Flight> flights = createFlightList.getAllFlights();
        List<FlightPair> pairList = new ArrayList<>();
        for(Flight fl : flights) {
            flights.stream()
                    .filter(f -> f.getFrom().equals(flight.getFrom()))
                    .filter(fp -> fp.getFrom().equals(flight.getFrom()) && fp.getTo().equals(fl.getFrom()))
                    .forEach(f -> pairList.add(new FlightPair(f, flight)));
        }

        return pairList.stream()
                .distinct()
                .collect(Collectors.toList());
    }
}
