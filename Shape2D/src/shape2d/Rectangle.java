
package shape2d;

public class Rectangle extends Shape2D {
    private final double length, width; 

    public Rectangle() {
       
        this(1,1);
   
    }
    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    
    @Override
    public double area() {
        return width * length;
    }

    @Override
    public double perimeter() {
        return 2 * (width + length);
    }

}
