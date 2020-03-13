package com.kodilla.exception.test;

public class FlightFinderRunner {
    public static void main(String[] args) {

        FlightFinder flightFinder = new FlightFinder();
        Flight lisbona = new Flight("Lublin", "Lisbona");
        Flight berlin = new Flight("Lublin", "Berlin");
        Flight warsaw = new Flight("Lublin", "Warsaw");

        try  {
            System.out.println("Open airports: " + flightFinder.findFlight(warsaw));
;
        } catch (RouteNotFoundException e) {
            System.out.println("The selected airport is not on the list");;
        }

    }
}
