
package shape2d;

import java.util.Scanner;

public class Rectangle extends Shape2D {
    private final double length, width; 

    public Rectangle(Scanner scanner) {
    
        
        
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
