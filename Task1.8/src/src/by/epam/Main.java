package src.by.epam;

import java.math.BigInteger;
import java.util.ArrayList;

/**
 * Создать класс Customer, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы
 * и метод toString(). Создать второй класс, агрегирующий массив типа Customer, с подходящими конструкторами
 * и методами. Задать критерии выбора данных и вывести эти данные на консоль.
 * Класс Customer: id, фамилия, имя, отчество, адрес, номер кредитной карточки, номер банковского счета.
 * Найти и вывести:
 * a) список покупателей в алфавитном порядке;
 * b) список покупателей, у которых номер кредитной карточки находится в заданном интервале
 */

public class Main {

	public static void main(String[] args) {
        SosediCustomers constantClient = new SosediCustomers("constant client", new ArrayList<>());
        constantClient.addCustomer("Gomozov", "Pavel", "Vladimirovich",
                "Minsk", 1457893215687811L, new BigInteger("12351616546545678"));
        constantClient.addCustomer("Virabej", "Svetlana", "Michajlovna",
                "Minsk", 1341141119464159L, new BigInteger("11515610654651165188"));
        constantClient.addCustomer("Sergeev", "Sergej", "Sergeevich",
                "Vitebsk", 1111111111111111L, new BigInteger("123418165168415678"));
        constantClient.addCustomer("Dudinkovich", "Andrej", "Sergeevich",
                "Minsk", 5299554854123118L, new BigInteger("1233151515134185418"));
        constantClient.addCustomer("Pukin", "Andrej", "Sergeevich",
                "Grodno", 9455151515151433L, new BigInteger("116516516515111250158"));
        System.out.println("Sorted by lastname: ");
        constantClient.sortAndPrint();
        System.out.println("Sorted by card : ");
        constantClient.printCustomersCardRange(1300000000000000L, 1460000000000000L);

    }
}
//Sorted by lastname: 
//id= 4, lastName= Dudinkovich, firstName= Andrej, patronymic= Sergeevich, address= Minsk, cardNumber= 5299554854123118, bankAccountNumber= 1233151515134185418
//id= 1, lastName= Gomozov, firstName= Pavel, patronymic= Vladimirovich, address= Minsk, cardNumber= 1457893215687811, bankAccountNumber= 12351616546545678
//id= 5, lastName= Pukin, firstName= Andrej, patronymic= Sergeevich, address= Grodno, cardNumber= 9455151515151433, bankAccountNumber= 116516516515111250158
//id= 3, lastName= Sergeev, firstName= Sergej, patronymic= Sergeevich, address= Vitebsk, cardNumber= 1111111111111111, bankAccountNumber= 123418165168415678
//id= 2, lastName= Virabej, firstName= Svetlana, patronymic= Michajlovna, address= Minsk, cardNumber= 1341141119464159, bankAccountNumber= 11515610654651165188
//Sorted by card : 
//id= 1, lastName= Gomozov, firstName= Pavel, patronymic= Vladimirovich, address= Minsk, cardNumber= 1457893215687811, bankAccountNumber= 12351616546545678
//id= 2, lastName= Virabej, firstName= Svetlana, patronymic= Michajlovna, address= Minsk, cardNumber= 1341141119464159, bankAccountNumber= 11515610654651165188
