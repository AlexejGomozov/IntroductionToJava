package src.by.epam;

import java.math.BigInteger;

public class Customer implements Comparable<Customer> {

	private int id;
    private String lastName;
    private String firstName;
    private String patronymic;
    private String address;
    private long cardNumber;
    private BigInteger bankAccountNumber;

    public Customer(int id, String lastName, String firstName, String patronymic, String address, long cardNumber,
                    BigInteger bankAccountNumber) {
        this.id = id;
        this.lastName = lastName;
        this.firstName = firstName;
        this.patronymic = patronymic;
        this.address = address;
        this.cardNumber = cardNumber;
        this.bankAccountNumber = bankAccountNumber;
    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public long getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(long cardNumber) {
        this.cardNumber = cardNumber;
    }

    public BigInteger getBankAccountNumber() {
        return bankAccountNumber;
    }

    public void setBankAccountNumber(BigInteger bankAccountNumber) {
        this.bankAccountNumber = bankAccountNumber;
    }

    @Override
    public String toString() {
        return "id= " + id +
                ", lastName= " + lastName +
                ", firstName= " + firstName +
                ", patronymic= " + patronymic +
                ", address= " + address +
                ", cardNumber= " + cardNumber +
                ", bankAccountNumber= " + bankAccountNumber;
    }

    @Override
    public int compareTo(Customer o) {
       return lastName.compareTo(o.getLastName());
    }
}
