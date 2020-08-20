package by.htp.classes.logic;

/* Создайте класс Test1 двумя переменными. Добавьте метод вывода на экран и методы
 * изменения этих переменных. Добавьте метод, который находит сумму значений эих 
 * переменных, и метод, который находит наибольшее значение из этих двух переменных */

public class Test1 {

	
	
	private int a;
	
	private int b;    							//public
	
	
	public void setA(int a) {
		
		this.a = a;
	}
	
	public void setB (int b) {
		
		this.b = b;
	}
	
	
	public int sum() {
		
		return a +b;
	}
	
	public int max() {
		
		return Math.max(a, b);
	} 
	
	
	public void print() {
	
	System.out.println("int a = " + a);
	
	System.out.println("int b = " + b);
	}
	public static void main(String[]args) {
		
		Test1 t = new Test1();
		
		t.print();
		t.sum();
		t.max();
}
}
