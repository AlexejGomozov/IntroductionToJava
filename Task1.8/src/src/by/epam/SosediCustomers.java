package src.by.epam;

import java.math.BigInteger;
import java.util.ArrayList;

public class SosediCustomers {

	private static int id = 1;
    private String customerList;
    private ArrayList<Customer> list;

    public SosediCustomers(String customerList, ArrayList<Customer> list) {
        this.customerList = customerList;
        this.list = list;
    }

    public void addCustomer(String lastName, String firstName, String patronymic, String address,
                            long cardNumber, BigInteger bankAccountNumber) {
        this.list.add(new Customer(id, lastName, firstName, patronymic, address, cardNumber, bankAccountNumber));
        id++;
    }

    public String getCustomerList() {
        return customerList;
    }

    public void setCustomerList(String customerList) {
        this.customerList = customerList;
    }

    public ArrayList<Customer> getList() {
        return list;
    }

    public void setList(ArrayList<Customer> list) {
        this.list = list;
    }

    public void sortAndPrint(){
        list.stream().sorted().forEach(System.out::println);
    }
    public void printCustomersCardRange(long a, long b){
        list.stream().sorted().filter(o -> o.getCardNumber()>=a&&o.getCardNumber()<=b).forEach(System.out::println);
    }
}
