package flightSearcher;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FlightProcessor {

    CreateFlightList createFlightList = new CreateFlightList();

    public FlightProcessor() {
    }

    List<Flight> inIt() {
        List<Flight> temporaryList = createFlightList.getAllFlights();
        return temporaryList;
    }

    public List<Flight> findFlightFrom(String flightFrom) {
        List<Flight> flights = inIt();

        return flights.stream()
                .filter(flight1 -> flight1.getFrom().equals(flightFrom))
                .collect(Collectors.toList());
    }

    public List<Flight> findFlightTo(String flightTo) {
        List<Flight> flights = inIt();

        return flights.stream()
                .filter(flight1 -> flight1.getTo().equals(flightTo))
                .collect(Collectors.toList());
    }

    public List<FlightPair> findIndirect(Flight flightFromTo) {
        List<Flight> flights = inIt();
        List<FlightPair> pairList = new ArrayList<>();
        for(Flight fl : flights) {
            flights.stream()
                    .filter(f -> f.getFrom().equals(flightFromTo.getFrom()))
                    .filter(fp -> fp.getFrom().equals(flightFromTo.getFrom()) && fp.getTo().equals(fl.getFrom()))
                    .forEach(f -> pairList.add(new FlightPair(f, flightFromTo)));
        }

        return pairList.stream()
                .distinct()
                .collect(Collectors.toList());
    }
}
