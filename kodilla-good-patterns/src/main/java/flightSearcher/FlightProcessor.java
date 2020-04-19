package flightSearcher;

import java.util.List;

public class FlightProcessor {

    CreateFlightList createFlightList;
    FindFlight findFlight;

    public FlightProcessor(CreateFlightList createFlightList, FindFlight findFlight) {
        this.createFlightList = createFlightList;
        this.findFlight = findFlight;
    }

    public List<Flight> findFlightFrom(Flight flight) {
        return findFlight.findFlightFrom(flight.getFrom());
    }

    public List<Flight> findFlightTo(Flight flight) {
        return findFlight.findFlightTo(flight.getTo());
    }

    public List<FlightPair> findIndirect() {
        return findFlight.findIndirectFlights();
    }
}
