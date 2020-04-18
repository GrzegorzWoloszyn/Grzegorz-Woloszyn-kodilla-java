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

//    public  List<Pair<Flight, Flight>> findConnectingFlight() {
//        List<Pair<Flight, Flight>> pairList = createFlightList.getAllPairs();
//        return pairList.stream()
//                .filter(fP -> flight.getArrival().equals(fP.getValue().getArrival()) && fP.getKey().getArrival().equals(fP.getValue().getDeparture()))
//               .collect(Collectors.toList());
//    }

    public  List<Flight>  findConnectingFlight2() {
        List<Flight> flights = createFlightList.getAllFlights();
        return flights.stream()
                .filter(fp -> flight.getDeparture().equals(fp.getDeparture()))
                .filter(f -> f.getArrival().equals(flight.getArrival()))
                .collect(Collectors.toList());
    }
}
