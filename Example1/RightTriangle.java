import java.util.*;
/**
 * class RightTriangle will be a child class from PrimalShape.
 * 
 * @author (Ruben) 
 * @version (v1)
 */
public class RightTriangle extends PrimalShape
{
    // instance variables - replace the example below with your own
    private double base, height;
    private double hypotenuse;

    /**
     * Constructor for objects of class RightTriangle
     */
    public RightTriangle(double base, double height)
    {
        // initialise instance variables
        this.base = base;
        this.height = height;
        this.hypotenuse = Math.sqrt(Math.pow(base, 2) + Math.pow(height, 2));
    }

    public void calculateArea()
    {
        super.area = this.base * this.height / 2; 
    }

    public void calculatePerimeter()
    {
        super.perimeter = this.base + this.height + this.hypotenuse; 
    }
    
    public double getBase()
    {
        return this.base;
    }
    
    public double getHeight()
    {
        return this.height;
    }
    
    public double getHypotenuse()
    {
        return this.hypotenuse;
    }
}
