package Task1_10.by.epam;

import java.util.ArrayList;
import java.util.Arrays;

public class Schedule {

	private String airportName;
    private ArrayList<Airline> airlines;

    public Schedule(String airportName) {
        this.airportName = airportName;
        this.airlines = new ArrayList<>();
    }

    public void addAirline(String destination, String flightNumber, String planeType, String departureTime,
                           String[] dayOfWeek) {
        airlines.add(new Airline(destination, flightNumber, planeType, departureTime, dayOfWeek));
    }

    public void findAirlinesToDestination(String destination) {
        airlines.stream()
                .filter(o -> o.getDestination().equalsIgnoreCase(destination))
                .forEach(System.out::println);
    }

    public void findAirlinesOnDay(String day) {
        airlines.stream()
                .filter(o -> Arrays.asList(o.getDayOfWeek()).contains(day))
                .forEach(System.out::println);
    }

    public void findAirlinesOnDayAndTime(String day, String departureTime) {
        airlines.stream()
                .filter(o -> Arrays.asList(o.getDayOfWeek()).contains(day) &&
                        o.getDepartureTime().compareTo(departureTime) < 0)
                .forEach(System.out::println);
    }


}
