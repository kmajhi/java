package summer2023.triangle;

abstract class Shape{
    abstract double calculateArea();
    abstract double calculatePerimeter();
}
class Circle extends Shape{
    private double radius;
    Circle(double radius){
        this.radius=radius;
    }
     double calculateArea(){
        return Math.PI*radius*radius;
    }
     double calculatePerimeter(){
        return 2*Math.PI*radius;
    }

}
class Triangle extends Shape{
    private double side1;
    private double side2;
    private double side3;

    
    Triangle(double side1,double side2, double side3){
        this.side1=side1;
        this.side2=side2;
        this.side3=side3;
    }

    public double calculateArea(){
        double s = (side1+side2+side3)/2;
        return Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
    }

    public double calculatePerimeter(){
        return side1+side2+side3;
    }
}
//TriangleTest.java
public class TriangleTest {
    public static void main(String[] args) {
        Shape circle = new Circle(4);
        Shape triangle = new Triangle(3,4,5);

        System.out.println("Circle Area: "+circle.calculateArea());
        System.out.println("Circle Perimeter: "+circle.calculatePerimeter());
        System.out.println("Triangle Area: "+triangle.calculateArea());
        System.out.println("Triangle Perimeter: "+triangle.calculatePerimeter());

    }
}
