import java.util.InputMismatchException;
import java.util.Scanner;

// Step 1: Define Shape interface with double area() method
interface Shape {
    double area();
}

// Step 2: Implement Circle class overriding area()
class Circle implements Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
}

// Step 2: Implement Rectangle class overriding area()
class Rectangle implements Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double area() {
        return length * width;
    }
}

public class ShapeCalculatorCLI {

    public static void main(String[] args) {
        // Step 3: Write a CLI to select shape type, input dimensions and display area
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== Shape Area Calculator ===");
        System.out.println("1. Circle");
        System.out.println("2. Rectangle");
        System.out.print("Select shape type (1 or 2): ");

        try {
            // Step 4: Validate inputs and handle errors (using try-catch and custom checks)
            int choice = scanner.nextInt();

            if (choice == 1) {
                System.out.print("Enter the radius of the circle: ");
                double radius = scanner.nextDouble();
                
                if (radius <= 0) {
                    System.out.println("Error: Radius must be a positive number.");
                    return;
                }

                Shape circle = new Circle(radius);
                System.out.printf("The area of the Circle is: %.2f%n", circle.area());

            } else if (choice == 2) {
                System.out.print("Enter the length of the rectangle: ");
                double length = scanner.nextDouble();
                System.out.print("Enter the width of the rectangle: ");
                double width = scanner.nextDouble();

                if (length <= 0 || width <= 0) {
                    System.out.println("Error: Length and width must be positive numbers.");
                    return;
                }

                Shape rectangle = new Rectangle(length, width);
                System.out.printf("The area of the Rectangle is: %.2f%n", rectangle.area());

            } else {
                System.out.println("Error: Invalid selection. Please enter 1 or 2.");
            }

        } catch (InputMismatchException e) {
            // Handles cases where the user types letters instead of numbers
            System.out.println("Error: Invalid input. Please enter numeric values only.");
        } finally {
            scanner.close();
        }
    }
}
