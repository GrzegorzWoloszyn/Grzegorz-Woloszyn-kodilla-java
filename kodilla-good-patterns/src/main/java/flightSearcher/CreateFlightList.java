package flightSearcher;

import javafx.util.Pair;

import java.util.ArrayList;
import java.util.List;

public class CreateFlightList {

        public List<Flight> getAllFlights () {

                List<Flight> flights = new ArrayList<>();
                flights.add(new Flight("Warszawa", "Kraków"));
                flights.add(new Flight("Warszawa", "Londyn"));
                flights.add(new Flight("Warszawa", "Lódź"));
                flights.add(new Flight("Kraków", "Wilno"));
                flights.add(new Flight("Lódź", "Londyn"));
                flights.add(new Flight("Kraków", "Londyn"));
                flights.add(new Flight("Lódź", "Kraków"));

                return new ArrayList<>(flights);
        }


        public List<Pair<Flight, Flight>> getAllPairs() {

                List<Pair<Flight, Flight>> pairList = new ArrayList<>();
                pairList.add(new Pair<>(new Flight("Warszawa", "Kraków"),new Flight("Kraków", "Wilno")));
                pairList.add(new Pair<>(new Flight("Warszawa", "Kraków"), new Flight("Kraków", "Londyn")));
                pairList.add(new Pair<>(new Flight("Warszawa", "Lódź"),new Flight("Lódź", "Londyn")));
                pairList.add(new Pair<>(new Flight("Lódź", "Kraków"), new Flight("Kraków", "Londyn")));
                pairList.add(new Pair<>(new Flight("Lódź", "Kraków"), new Flight("Kraków", "Wilno")));

                return pairList;
        }

}
