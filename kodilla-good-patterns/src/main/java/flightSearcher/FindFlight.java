package flightSearcher;

import javafx.util.Pair;

import java.util.List;
import java.util.stream.Collectors;

public class FindFlight {

    public Flight flight;
    CreateFlightList createFlightList = new CreateFlightList();

    public FindFlight(Flight flight) {
        this.flight = flight;
    }

    public List<Flight> findFlightTo() {
        List<Flight> flights = createFlightList.getAllFlights();

        return flights.stream()
                .filter(flight1 -> flight1.getArrival().equals(flight.getArrival()))
                .collect(Collectors.toList());
    }

    public List<Flight> findFlightFrom() {
        List<Flight> flights = createFlightList.getAllFlights();

        return flights.stream()
                .filter(flight1 -> flight1.getDeparture().equals(flight.getDeparture()))
                .collect(Collectors.toList());
    }

     public  List<Pair<Flight, Flight>> findConnectingFlight() {
        List<Pair<Flight, Flight>> pairList = createFlightList.getAllPairs();

         return pairList.stream()
                 .filter(fP -> fP.getKey().getArrival().equals(flight.getArrival()) && fP.getValue().getDeparture().equals(fP.getKey().getArrival()))
                 .collect(Collectors.toList());

    }
}
