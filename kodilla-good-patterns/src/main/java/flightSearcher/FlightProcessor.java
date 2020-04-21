package flightSearcher;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FlightProcessor {

    List<Flight> list;

    public FlightProcessor(List<Flight> list) {
        this.list = list;
    }

    public List<Flight> findFlightFrom(String flightFrom) {
        return list.stream()
                .filter(flight1 -> flight1.getFrom().equals(flightFrom))
                .collect(Collectors.toList());
    }

    public List<Flight> findFlightTo(String flightTo) {
        return list.stream()
                .filter(flight1 -> flight1.getTo().equals(flightTo))
                .collect(Collectors.toList());
    }

    public List<FlightPair> findIndirect(String from, String to) {
        List<FlightPair> intermediateFlights = new ArrayList<>();
        List<Flight> flightsFrom = findFlightFrom(from);
        for (Flight flightFrom : flightsFrom) {
            intermediateFlights.addAll(findFlightFrom(flightFrom.getTo()).stream()
                    .filter(flight -> flight.getTo().equals(to))
                    .map(flight -> new FlightPair(flightFrom, flight))
                    .collect(Collectors.toList()));
        }

        return intermediateFlights;
    }
}
