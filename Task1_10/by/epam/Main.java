package Task1_10.by.epam;

/**
 * Создать класс Airline, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы
 * и метод toString(). Создать второй класс, агрегирующий массив типа Airline, с подходящими конструкторами и
 * методами. Задать критерии выбора данных и вывести эти данные на консоль.
 * Airline: пункт назначения, номер рейса, тип самолета, время вылета, дни недели.
 * Найти и вывести:
 * a) список рейсов для заданного пункта назначения;
 * b) список рейсов для заданного дня недели;
 * c) список рейсов для заданного дня недели, время вылета для которых больше заданного.
 */

public class Main {

	public static void main(String[] args) {
        Schedule mySchedule = new Schedule("My Airport");
        mySchedule.addAirline("Vankuver", "B8929", "Boeing", "01:20"
                , new String[]{"tuesday", "wednesday"});
        mySchedule.addAirline("Minsk", "SU1835", "Kiev", "06:30"
                , new String[]{"monday", "friday", "saturday"});
        mySchedule.addAirline("Berlin", "B2690", "Boeing", "08:00"
                , new String[]{"tuesday", "wednesday", "sunday"});
        mySchedule.addAirline("Varshava", "SU1831", "Sukhoi", "05:15"
                , new String[]{"monday", "wednesday", "friday"});
        System.out.println("To Minsk: ");
        mySchedule.findAirlinesToDestination("moscow");
        System.out.println("On Monday: ");
        mySchedule.findAirlinesOnDay("tuesday");
        System.out.println("On Wednesday after 04:00 : ");
        mySchedule.findAirlinesOnDayAndTime("wednesday", "04:00");
    }
}
//To Minsk: 
//On Monday: 
//destination= Vankuver, flightNumber= B8929, planeType= Boeing, departureTime= 01:20, dayOfWeek= [tuesday, wednesday]
//destination= Berlin, flightNumber= B2690, planeType= Boeing, departureTime= 08:00, dayOfWeek= [tuesday, wednesday, sunday]
//On Wednesday after 04:00 : 
//destination= Vankuver, flightNumber= B8929, planeType= Boeing, departureTime= 01:20, dayOfWeek= [tuesday, wednesday]
