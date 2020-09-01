package Task1_10.by.epam;

import java.util.Arrays;

public class Airline {

	private String destination;
    private String flightNumber;
    private String planeType;
    private String departureTime;
    private String[] dayOfWeek;

    public Airline(String destination, String flightNumber, String planeType, String departureTime, String[] dayOfWeek) {
        this.destination = destination;
        this.flightNumber = flightNumber;
        this.planeType = planeType;
        this.departureTime = departureTime;
        this.dayOfWeek = dayOfWeek;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getPlaneType() {
        return planeType;
    }

    public void setPlaneType(String planeType) {
        this.planeType = planeType;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    public String[] getDayOfWeek() {
        return dayOfWeek;
    }

    public void setDayOfWeek(String[] dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }

    @Override
    public String toString() {
        return "destination= " + destination +
                ", flightNumber= " + flightNumber +
                ", planeType= " + planeType +
                ", departureTime= " + departureTime +
                ", dayOfWeek= " + Arrays.toString(dayOfWeek);

    }
}
