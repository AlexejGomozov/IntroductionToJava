package by.htp.classes.logic;

/* Создайте класс Train, содержащий поля: название пункта назначения, номер поезда, время отправления.
 * Создайте данные в массив из пяти элементов типа Train, добавьте возможность сортировки элементов массива по
 * номерам поездов. Добавьте возможность вывода информации о поезде, номер которого введен пользователем.
 * Добавьте возможность сортировки массива по пункту назначения, причем поезда с одинаковыми пунктами
 * назначения должны быть упорядочены по времени отправления.  */

public class Train {


    private String destinationName;
    private int trainNumber;
    private String departureTime;


    public Train(String destinationName, int trainNumber, String departureTime) {
        this.destinationName = destinationName;
        this.trainNumber = trainNumber;
        this.departureTime = departureTime;
    }

    public static Train[] sortingTrainByNumber(Train[] trains) {
        Train temp;
        for (int i = 0; i < trains.length; i++) {
            for (int j = 0; j < trains.length-1; j++) {
                if (trains[j].trainNumber < trains[j + 1].trainNumber) {
                    temp = trains[j];
                    trains[j] = trains[j+1];
                    trains[j+1] = temp;
                }
            }
        }
        return trains;
    }

    public static Train[] sortTrainDestinationName(Train[] trains) {
        Train temp;
        for (int i = 0; i < trains.length; i++) {
            for (int j = 0; j < trains.length - 1; j++) {
                if (trains[j].destinationName.compareTo(trains[j + 1].destinationName) > 0) {
                    temp = trains[j];
                    trains[j] = trains[j+1];
                    trains[j+1] = temp;
                } else if (trains[j].destinationName.compareTo(trains[j + 1].destinationName) == 0) {
                    if (trains[j].departureTime.compareTo(trains[j+1].departureTime) > 0) {
                        temp = trains[j];
                        trains[j] = trains[j+1];
                        trains[j+1] = temp;
                    }
                }
            }
        }
        return trains;
    }

    public static Train informationOfTrain(Train[] trains, int trainNumber) {

        for (Train train : trains) {
            if (train.trainNumber == trainNumber) {
                return train;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return "destinationName= " + destinationName +
                ", trainNumber= " + trainNumber +
                ", departureTime= " + departureTime ;
    }
	
	public static void main(String[] args) {
        Train[] trains = new Train[]{
                new Train("Gomel", 254, "05:58"),
                new Train("Vilnus", 324, "10:48"),
                new Train("Moskow", 115, "13:15"),
                new Train("Gomel", 658, "18:41"),
                new Train("Kiev", 225, "06:40"),
        };

        System.out.println("___________________informationOfTrain___________________________");
        Train myTrain = Train.informationOfTrain(trains, 658);
        System.out.println(myTrain);
        System.out.println("___________________sortingTrainByNumber__________________________");
        Train.sortingTrainByNumber(trains);
        for (Train train : trains) {
            System.out.println(train);
        }
        System.out.println("____________________sortTrainDestinationName______________________");
        Train.sortTrainDestinationName(trains);
        for (Train train : trains) {
            System.out.println(train);
        }


    }
}
//destinationName= Moskow, trainNumber= 115, departureTime= 13:15
//____________________sortTrainDestinationName______________________
//destinationName= Gomel, trainNumber= 254, departureTime= 05:58
//destinationName= Gomel, trainNumber= 658, departureTime= 18:41
//destinationName= Kiev, trainNumber= 225, departureTime= 06:40
//destinationName= Moskow, trainNumber= 115, departureTime= 13:15
//destinationName= Vilnus, trainNumber= 324, departureTime= 10:48
