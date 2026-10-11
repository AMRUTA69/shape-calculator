# Shape Area Calculator (Java)

A simple Command Line Interface (CLI) application built in Java to calculate the area of different geometric shapes (Circle and Rectangle) using Object-Oriented Programming (OOP) concepts.

## 🚀 Features

- Calculates the area of a **Circle**.
- Calculates the area of a **Rectangle**.
- Uses an **Interface** (`Shape`) to achieve abstraction.
- Includes robust **input validation** to handle incorrect user inputs gracefully.
- Simple and easy-to-use CLI (Command Line Interface).

## 🛠️ Concepts Used

- Java Interfaces and Classes (`Shape`, `Circle`, `Rectangle`)
- Method Overriding (`@Override`)
- Exception Handling (`try-catch` for `InputMismatchException`)
- User Input handling using `Scanner`
- Basic Math operations (`Math.PI`)

## 📂 Project Structure

- `Shape.java` - Interface defining the `area()` method.
- `Circle.java` - Implements the `Shape` interface for circles.
- `Rectangle.java` - Implements the `Shape` interface for rectangles.
- `ShapeCalculatorCLI.java` - Main class containing the CLI logic and `main` method.

## 💻 How to Run

1. Make sure you have **Java JDK** installed on your system.
2. Clone this repository or download the `.java` files.
3. Open the project in any Java IDE (like Eclipse, IntelliJ IDEA, or VS Code).
4. Compile and run the `ShapeCalculatorCLI.java` file.
5. Follow the on-screen instructions to select a shape and enter its dimensions.

## 📝 Example Usage

```text
=== Shape Area Calculator ===
1. Circle
2. Rectangle
Select shape type (1 or 2): 1
Enter the radius of the circle: 5
The area of the Circle is: 78.54
