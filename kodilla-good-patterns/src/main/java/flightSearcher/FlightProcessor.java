package flightSearcher;

import javafx.util.Pair;

import java.util.List;

public class FlightProcessor {

    CreateFlightList createFlightList;
    FindFlight findFlight;

    public FlightProcessor(CreateFlightList createFlightList, FindFlight findFlight) {
        this.createFlightList = createFlightList;
        this.findFlight = findFlight;
    }

    public List<Flight> processForDeparture() {
        return findFlight.findFlightFrom();
    }

    public List<Flight> processForArrival() {
        return findFlight.findFlightTo();
    }

//    public List<Pair<Flight, Flight>> processForConnectedFlights() {
//        return findFlight.findConnectingFlight();
//    }

    public List<Flight> processForConnectedFlights() {
        return findFlight.findConnectingFlight2();
    }


}
