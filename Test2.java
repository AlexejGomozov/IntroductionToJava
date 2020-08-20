package by.htp.classes.logic;

/* Создайте класс Test2 двумя переменными. Добавьте конструктор с входными параметрами
 * Добавьте конструктор, инициализирующий члены класса по умолчанию. Добавьте set- и get-
 * методы для полей экземпляра класса */

public class Test2 {

	private int a;
	
	private int b;
	
	public Test2(int a, int b) {
		
		this.a = a;
		this.b = b;
	}
	
	public Test2() {
		
		this.a = 5;
		this.b = 10;
	}
	
	public int getA() {
		
		return a;
	}
	
	public void setA(int a) {
		
		this.a = a;
	}
	
	public int getB() {
		
		return b;
	}
	
	public void setB(int b) {
		
		this.b = b;
	}
	public static void main(String[]args) {
		
		Test2 test2_1 = new Test2();
		Test2 test2_2 = new Test2(4, 5);
		test2_2.setA(8);
		test2_2.setB(9);
		 System.out.println("test2_1:");
	        System.out.println("int a = " + test2_1.getA());
	        System.out.println("int b = " + test2_1.getB());
	        System.out.println("test2_1: ");
	        System.out.println("int a = " + test2_2.getA());
	        System.out.println("int b = " + test2_2.getB());

	}
	
}
//test2_1:
//int a = 5
//int b = 10
//test2_1:
//int a = 8
//int b = 9
