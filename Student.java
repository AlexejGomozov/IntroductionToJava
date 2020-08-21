package by.htp.classes.logic;

/*/**
 * Создайте класс с именем Student, содержащий поля: фамилия и инициалы, номер группы, успеваемость (массив
 * из пяти элементов). Создайте массив из десяти элементов такого типа. Добавьте возможность вывода фамилий и
 * номеров групп студентов, имеющих оценки, равные только 9 или 10
   */

public class Student {

	    private String lastNameInitial;
	    private int gr;
	    private int[] marks;

	    public Student(String lastNameInitial, int gr, int[] marks) {
	        this.lastNameInitial = lastNameInitial;
	        this.gr = gr;
	        this.marks = marks;
	    }

	    public static void printStudent(Student[] students) {
	        for (Student student : students) {
	            boolean isGood = true;
	            for (int mark : student.marks) {
	                if (mark != 9 && mark != 10) {
	                    isGood = false;
	                    break;
	                }
	            }
	            if (isGood) {
	                System.out.println("Name: " + student.lastNameInitial);
	                System.out.println("Group: " + student.gr + "\n");
	            }
	        }
	    }
	    public static void main(String[]args) {
	    	
	    	Student[] students = new Student[] {
	    			
	    			new Student("Sidorov S.S.", 333, new int[] {10, 10, 10, 10,10}),
	    			new Student("Karimov K.K.", 333, new int[] {9, 9, 9, 9, 9}),
	    			new Student("Lirov L.L.", 333, new int[] {5, 4, 8, 9,7}),
	    			new Student("Durov D.D.", 333, new int[] {6, 7, 8, 9, 5}),
	    			new Student("Turinov T.T.", 333, new int[] {10, 9, 10, 9,10}),
	    			new Student("Markov M.M.", 333, new int[] {4, 6, 8, 6, 8}),
	    			new Student("Nurkov N.N.", 333, new int[] {7, 8, 9, 4, 7}),
	    	};
	    	Student. printStudent(students);
	    }
} 
//Name: Sidorov S.S.
//Group: 333

//Name: Karimov K.K.
//Group: 333

//Name: Turinov T.T.
//Group: 333