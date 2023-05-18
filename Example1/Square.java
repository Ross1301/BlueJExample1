import java.util.*;
/**
 * class Square will be a child class from PrimalShape.
 * 
 * @author (Ruben) 
 * @version (v1)
 */
public class Square extends PrimalShape
{
    // instance variables - replace the example below with your own
    private double side;

    /**
     * Constructor for objects of class RightTriangle
     */
    public Square(double side)
    {
        // initialise instance variables
        this.side = side;
    }

    public void calculateArea()
    {
        super.area = Math.pow(side, 2); 
    }

    public void calculatePerimeter()
    {
        super.perimeter = side * 4; 
    }
    
    public double getSide()
    {
        return this.side;
    }
}
