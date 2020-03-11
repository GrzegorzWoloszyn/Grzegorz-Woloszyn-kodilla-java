package com.kodilla.exception.test;

public class FlightFinderRunner {
    public static void main(String[] args) {

        FlightFinder flightFinder = new FlightFinder();

        try {
            flightFinder.findFlight(new Flight("Wroclaw,", "London"));
        } catch (RouteNotFoundException e) {
            System.out.println("The chosen airport ist unavailable");
        }


    }
}
