
package shape2d;

public class ShapeMain {
    public static void main(String[] args) {

        double width = 5, length = 7;
        Shape2D rectangle = new Rectangle(width, length);
        System.out.println("Rectangle width: " + width + " and length: " + length
                + "\nArea of rectangle: " + rectangle.area()
                + "\nPerimeter of rectangle: " + rectangle.perimeter() + "\n");

        double radius = 5;
        Shape2D circle = new Circle(radius);
        System.out.println("Circle radius: " + radius
            + "\nArea of circle: " + circle.area()
            + "\nPerimeter of circle: " + circle.perimeter() + "\n");

        double a = 5, b = 3, c = 4;
        Shape2D triangle = new Triangle(a,b,c);
        System.out.println("Triangle sides lengths: " + a + ", " + b + ", " + c
                + "\nArea of triangle: " + triangle.area()
                + "\nPerimeter of triangle: " + triangle.perimeter() + "\n");
    }
}
