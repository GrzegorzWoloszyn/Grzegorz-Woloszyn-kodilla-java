package com.kodilla.exception.test;

import java.util.*;

public class FlightFinder {

    public List<Flight> opensAirs = new ArrayList<>();

        public List<Flight> findFlight (Flight flight) throws RouteNotFoundException {

            Map<String, Boolean> flights = new HashMap<>();
            flights.put("Warsaw", true);
            flights.put("Berlin", false);
            flights.put("Frankfurt", false);
            flights.put("Gdansk", true);
            flights.put("London", false);
            flights.put("Rome", false);
            flights.put("Paris", true);
            flights.put("Madrit", false);

            if (flights.containsKey(flight.getArrivalAirport())) {
                if (flights.get(flight.getArrivalAirport()).equals(true)){
                   opensAirs.add(flight);
                }
            } else {
                throw new RouteNotFoundException();
            }
            return opensAirs;
        }
}
