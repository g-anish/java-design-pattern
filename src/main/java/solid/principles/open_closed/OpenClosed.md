# The Open/Closed Principle (OCP)
**It states that “software entities (classes, modules, functions, etc.) should be open for extension, but closed for modification”.**

The general idea of this principle is to write code that can be extended without modifying the existing code. 
This helps prevent situations where a change to one class requires you to modify all dependent classes.

In Java, the OCP can be implemented by using abstraction and inheritance. 
By creating an abstract class or interface, you can define a contract that specifies the behavior of the class. 
This contract can be extended by creating new classes that implement the interface or inherit from the abstract class. 
This way, you can add new functionality to your code without modifying the existing code.



`public interface Shape {
public double area();
}
`
`public class Rectangle implements Shape {
private double width;
private double height;`

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double area() {
        return width * height;
    }
}

`public class Circle implements Shape {
private double radius;`

    public Circle(double radius) {
        this.radius = radius;
    }

    public double area() {
        return Math.PI * radius * radius;
    }
`}`

In this example, we have an **interface called Shape that defines a contract for calculating the area of a shape**. 
We then have two classes, Rectangle and Circle, that implement the Shape interface. 
If we want to add a new shape, such as a triangle, we can create a new class that implements the Shape interface without modifying the existing code 