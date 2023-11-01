# Shape and Subclasses

This project involves the creation of an abstract class called "Shape" along with three subclasses: "Triangle," "Rectangle," and "Circle." These classes are designed to represent different geometric shapes and provide methods for calculating their areas and circumferences (or perimeters).

## Shape Abstract Class

The "Shape" abstract class serves as the foundation for the other shape classes and defines the following attributes and methods:

### Attributes:
- `x`: an integer representing the x-coordinate of the shape's center.
- `y`: an integer representing the y-coordinate of the shape's center.

### Abstract Methods:
1. `calculateArea()`: An abstract method that calculates and returns the area of the shape as a double.
2. `calculateCircumference()`: An abstract method that calculates and returns the circumference (or perimeter) of the shape as a double.

## Circle Class

The "Circle" class is one of the subclasses and provides functionality for creating and working with circle shapes. It includes the following features:

### Constructor:
- `Circle(double radius)`: Constructs a Circle object with a given radius.

### Accessors and Mutators:
- `getRadius()`: Returns the radius of the Circle.
- `setRadius(double radius)`: Sets a new value for the radius of the Circle.

### Abstract Methods:
- `calculateArea()`: Calculates and returns the area of the Circle based on its radius.
- `calculateCircumference()`: Calculates and returns the circumference of the Circle (2 * π * radius).

## Rectangle Class

The "Rectangle" class represents rectangle shapes and offers the following functionality:

### Constructor:
- `Rectangle(double height, double width)`: Constructs a Rectangle object with a specified height and width.

### Accessors and Mutators:
- `getHeight()`: Returns the height of the Rectangle.
- `getWidth()`: Returns the width of the Rectangle.
- `setHeight(double height)`: Sets a new value for the height of the Rectangle.
- `setWidth(double width)`: Sets a new value for the width of the Rectangle.

### Abstract Methods:
- `calculateArea()`: Calculates and returns the area of the Rectangle (height * width).
- `calculateCircumference()`: Calculates and returns the circumference of the Rectangle (2 * (height + width)).

## Triangle Class

The "Triangle" class is used to represent equilateral triangles:

### Constructor:
- `Triangle(double height, double base)`: Constructs a Triangle object with a specified height and base (all sides are equal in an equilateral triangle).

### Accessors and Mutators:
- `getHeight()`: Returns the height of the Triangle.
- `getBase()`: Returns the base of the Triangle.
- `setHeight(double height)`: Sets a new value for the height of the Triangle.
- `setBase(double base)`: Sets a new value for the base of the Triangle.

### Abstract Methods:
- `calculateArea()`: Calculates and returns the area of the Triangle ((base * height) / 2).
- `calculateCircumference()`: Calculates and returns the perimeter of the Triangle (3 * base), considering it's an equilateral triangle with all sides equal.

## Testing

A separate test class should be created to verify the functionality of the Circle, Rectangle, and Triangle classes. You can test the accessors, mutators, and the correctness of the calculated areas and circumferences (perimeters).

It is essential to ensure that the area and circumference are calculated with two decimal points of precision.

Please follow the instructions provided for each class to implement and test the code effectively.

This README provides an overview of the project's structure and guidelines for creating and testing the classes. Good luck with your project!
