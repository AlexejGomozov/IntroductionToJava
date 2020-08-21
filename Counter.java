package by.htp.classes.logic;

/* Опишите класс, реализующий десятичный счетчик, который может увеличивать или уменьшать свое значение
 * на единицу в заданном диапазоне. Предусмотрите инициализацию счетчика значениями по умолчанию и
 * произвольными значениями. Счетчик имеет методы увеличения и уменьшения состояния, и метод
 * позволяющее получить его текущее состояние. Написать код, демонстрирующий все возможности класса. */

public class Counter {

	private int from;
    private int to;
    private int counter = from;

    public Counter() {
        from = 0;
        to = 100;
    }

    public Counter(int from, int to) {
        this.from = from;
        this.to = to;
    }

    public void increase() {
        if (counter < to) {
            counter++;
        }
    }

    public void reduce() {
        if (counter > from) {
            counter--;
        }
    }

    public int getCounter() {
        return counter;
    }

    public int getFrom() {
        return from;
    }

    public void setFrom(int from) {
        this.from = from;
    }

    public int getTo() {
        return to;
    }

    public void setTo(int to) {
        this.to = to;
    }
	
	 public static void main(String[] args) {
	        Counter counter = new Counter();
	        System.out.println("from: " + counter.getFrom());
	        System.out.println("to: " + counter.getTo());
	        counter.increase();
	        counter.increase();
	        counter.increase();
	        counter.reduce();
	        System.out.println("counter: " + counter.getCounter());

	    }
}
//from: 0
//to: 100
//counter: 2
