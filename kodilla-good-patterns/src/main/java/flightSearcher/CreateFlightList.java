package flightSearcher;

import java.util.ArrayList;
import java.util.List;

public class CreateFlightList {

        public static List<Flight> getAllFlights () {

                List<Flight> flights = new ArrayList<>();
                flights.add(new Flight("Warszawa", "Kraków"));
                flights.add(new Flight("Warszawa", "Londyn"));
                flights.add(new Flight("Warszawa", "Lódź"));
                flights.add(new Flight("Kraków", "Wilno"));
                flights.add(new Flight("Lódź", "Londyn"));
                flights.add(new Flight("Kraków", "Londyn"));
                flights.add(new Flight("Lódź", "Kraków"));
                flights.add(new Flight("Wilno", "Londyn"));

                return new ArrayList<>(flights);
        }
}
