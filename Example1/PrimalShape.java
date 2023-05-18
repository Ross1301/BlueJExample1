
/**
 * This is an abstract class, I am using  Inheritance and Polymorphism.
 * 
 * @author (Ruben Caballero) 
 * @version (v1)
 */
public abstract class PrimalShape
{
    // instance variables
    protected double area;
    protected double perimeter;

    /**
    * Constructor for objects of class PrimalShape
    */
    public PrimalShape()
    {
        // initialise instance variables
        this.area = 0;
        this.perimeter = 0;
    }
    
    /**
     * Getter for attribute area - returns the value of the attribute area
     * 
     * @return the attribute area
    */
    public double getArea()
    {
        return this.area;
    }
    
    /**
     * Getter for attribute perimeter - returns the value of the attribute perimeter
     * 
     * @return the attribute perimeter
    */
    public double getPerimeter ()
    {
        return this.perimeter;
    }

    /**
     * Abstract method calculateArea - since each Shape has a different method to calculate its area, 
     * this method will be define in each child class
    */
    public abstract void calculateArea();
    
    /**
     * Abstract method calculateArea - since each Shape has a different method to calculate its area, 
     * this method will be define in each child class
    */
    public abstract void calculatePerimeter();
    
    
}
