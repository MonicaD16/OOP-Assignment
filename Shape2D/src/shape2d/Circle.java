

package shape2d;

public class Circle extends Shape2D {
    private final double radius;


    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {

        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public double perimeter() {

        return 2 * Math.PI * radius;
    }
}
