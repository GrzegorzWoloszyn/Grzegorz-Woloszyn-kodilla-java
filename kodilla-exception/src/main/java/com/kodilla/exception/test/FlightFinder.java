package com.kodilla.exception.test;

import java.awt.font.GlyphJustificationInfo;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class FlightFinder {

        public void findFlight (Flight flight) throws RouteNotFoundException {

            Map<String, Boolean> flights = new HashMap<>();
            flights.put("Warsaw", true);
            flights.put("Berlin", true);
            flights.put("Frankfurt", true);
            flights.put("Frankfurt", true);
            flights.put("Gdańsk", true);

            if (flights.containsKey(flight.getArrivalAirport())) {
                System.out.println("You can fly to " + flight.getArrivalAirport() + ".");
            } else throw new RouteNotFoundException();
        }

}
