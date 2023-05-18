
/**
 * Write a description of class Circle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Circle extends PrimalShape
{
    // instance variables - replace the example below with your own
    private double radius;

    /**
     * Constructor for objects of class RightTriangle
     */
    public Circle(double radius)
    {
        // initialise instance variables
        this.radius = radius;
    }

    public void calculateArea()
    {
        super.area = Math.PI * Math.pow(radius, 2); 
    }

    public void calculatePerimeter()
    {
        super.perimeter = Math.PI * (2 * radius); 
    }
    
    public double getRadius()
    {
        return this.radius;
    }
}
