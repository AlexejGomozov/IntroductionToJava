package by.htp.classes.logic;

/* Описать класс, представляющий треугольник. Предусмотреть методы для создания объектов, вычисления
 * площади, периметра и точки пересечения медиан  */

public class Triangle {

	   private double aX;
	    private double aY;
	    private double bX;
	    private double bY;
	    private double cX;
	    private double cY;


	    public Triangle(double aX, double aY, double bX, double bY, double cX, double cY) {
	        this.aX = aX;
	        this.aY = aY;
	        this.bX = bX;
	        this.bY = bY;
	        this.cX = cX;
	        this.cY = cY;
	    }

	    private double sideA() {
	        return Math.sqrt(Math.pow(aX - bX, 2) + Math.pow(aY - bY, 2));
	    }

	    private double sideB() {
	        return Math.sqrt(Math.pow(bX - cX, 2) + Math.pow(bY - cY, 2));
	    }

	    private double sideC() {
	        return Math.sqrt(Math.pow(aX - cX, 2) + Math.pow(aY - cY, 2));
	    }


	    public double getPerimeter() {
	        return sideA() + sideB() + sideC();
	    }

	    public double getArea() {
	        double p = getPerimeter() / 2;
	        return Math.sqrt(p * (p - sideA()) * (p - sideB()) * (p - sideC()));
	    }

	    public void meridianIntersection() {
	        System.out.println("(" + pointXmeridian() + ", " + pointYmeridian() + ")");
	    }

	    private double pointXmeridian() {
	        return (aX + bX + cX) / 3;
	    }

	    private double pointYmeridian() {
	        return (aY + bY + cY) / 3;
	    }
	
	 public static void main(String[] args) {
	        Triangle triangle = new Triangle(2, 4, 2, -3, 8, 6);
	        System.out.println(triangle.getPerimeter());
	        System.out.println(triangle.getArea());
	        triangle.meridianIntersection();
	    }
}
//24.14120914672873
//21.000000000000018
//(4.0, 2.3333333333333335)
