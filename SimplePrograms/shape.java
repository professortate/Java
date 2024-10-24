class Shape {
    int radius;

    // Constructor for Shape class
    public Shape(int radius) {
        this.radius = radius;
    }

    // Method to calculate area
    void calculateArea() {
        float area = 3.14f * radius * radius;
        System.out.println("Area: " + area);
    }
}

class Circle extends Shape {
    // Constructor for Circle class
    public Circle(int radius) {
        super(radius); // Call superclass constructor to initialize radius
    }

    // Method to display circle area
    void displayCircleArea() {
        calculateArea(); // Calls calculateArea() method of superclass
    }
}

public class shape {
    public static void main(String[] args) {
        Circle newCircle = new Circle(4);
        newCircle.displayCircleArea();
    }
}
