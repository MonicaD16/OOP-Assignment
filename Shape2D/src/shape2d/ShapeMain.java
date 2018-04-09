
package shape2d;

import java.util.Scanner;


public class ShapeMain {
    public static void main(String[] args) {
        
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter the width of the rectangle: ");
        double width = userInput.nextInt();
        
        System.out.println("Enter the length of the rectangle: ");
        double length = userInput.nextInt();
        
        Shape2D rectangle = new Rectangle(width, length);
        System.out.println("Rectangle width: " + width + " and length: " + length
                + "\nArea of rectangle: " + rectangle.area()
                + "\nPerimeter of rectangle: " + rectangle.perimeter() + "\n");

        System.out.println("Enter the radius of the circle. ");
        double radius = userInput.nextInt();
        
        Shape2D circle = new Circle(radius);
        System.out.println("Circle radius: " + radius
            + "\nArea of circle: " + circle.area()
            + "\nPerimeter of circle: " + circle.perimeter() + "\n");

        System.out.println("Enter side A of the triangle: ");
        double sideA = userInput.nextInt();
        
        System.out.println("Enter side B of the triangle: ");
        double sideB = userInput.nextInt();
        
        System.out.println("Enter side C of the triangle: ");
        double sideC = userInput.nextInt();
        
        Shape2D triangle = new Triangle(sideA, sideB, sideC);
        System.out.println("Triangle sides lengths: " + sideA + ", " + sideB + ", " + sideC
                + "\nArea of triangle: " + triangle.area()
                + "\nPerimeter of triangle: " + triangle.perimeter() + "\n");
    }
}
