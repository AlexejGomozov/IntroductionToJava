package Task1_9.by.epam;

import java.util.ArrayList;

public class Library {

	private static int id=1;
    private String libraryName;
    private ArrayList<Book> list;

    public Library(String libraryName, ArrayList<Book> list) {
        this.libraryName = libraryName;
        this.list = list;
    }

    public void addBook(String title, String author, String publisher, int yearOfPublishing, int numberOfPages, float price,
                 String bindingType) {
        this.list.add(new Book(id, title, author, publisher, yearOfPublishing, numberOfPages, price, bindingType));
        id++;
    }
    public void findByAuthor(String author){
        list.stream().filter(o->o.getAuthor()!=null&&o.getAuthor().equalsIgnoreCase(author)).forEach(System.out::println);
    }
    public void findByPublisher(String publisher){
        list.stream().filter(o->o.getPublisher().equalsIgnoreCase(publisher)).forEach(System.out::println);
    }
    public void findAfterYear(int year){
        list.stream().filter(o->o.getYearOfPublishing()>year).forEach(System.out::println);
    }
}
