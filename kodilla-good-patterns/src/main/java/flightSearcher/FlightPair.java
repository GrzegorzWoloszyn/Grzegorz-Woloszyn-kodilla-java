package flightSearcher;

import java.util.Objects;

public class FlightPair {

    private final Flight one;
    private final Flight two;

    public FlightPair(Flight one, Flight two) {
        this.one = one;
        this.two = two;
    }

    public Flight getOne() {
        return one;
    }

    public Flight getTwo() {
        return two;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof FlightPair)) return false;

        FlightPair that = (FlightPair) o;

        if (!Objects.equals(one, that.one)) return false;
        return Objects.equals(two, that.two);
    }

    @Override
    public int hashCode() {
        int result = one != null ? one.hashCode() : 0;
        result = 31 * result + (two != null ? two.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "" + one.getTo();
    }
}
