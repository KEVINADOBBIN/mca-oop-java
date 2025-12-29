// Abstract class
abstract class Shape {
    // Abstract method
    abstract double area(double a, double b);
}

// Rectangle class extending Shape
class Rect extends Shape {
    @Override
    double area(double a, double b) {
        return a * b;
    }
}

// Triangle class extending Shape
class Triangle extends Shape {
    @Override
    double area(double a, double b) {
        return 0.5 * a * b;
    }
}

// Main class
public class AbstractDemo {
    public static void main(String[] args) {

        Shape s;  // Reference of abstract class

        System.out.println("KEVIN A DOBBIN MCA 'A' SEC\n");

        // Rectangle
        s = new Rect();
        System.out.println("Area of rectangle: " + s.area(10.0, 5.0));

        // Triangle
        s = new Triangle();
        System.out.println("Area of triangle: " + s.area(10.0, 5.0));
    }
}
