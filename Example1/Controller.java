import java.util.*;
public class Controller
{
    public View1 view = new View1();
    //public View2 view = new View2();
    List<PrimalShape> list=new ArrayList<PrimalShape>();
    
    public void listAll()
    {
        for(PrimalShape shape:list)
        {
            if(shape instanceof RightTriangle)
            {
                RightTriangle tri = (RightTriangle) shape;
                view.printMessage("RightTriangle: " + "\n"+
                                "Base Value: " + String.format("%.2f", tri.getBase()) + "\n"+
                                "Height Value: " + String.format("%.2f", tri.getHeight()) + "\n"+
                                "Hypotenuse Value: " + String.format("%.2f", tri.getHypotenuse()) + "\n"+
                                "Perimeter Value: " + String.format("%.2f", tri.getPerimeter()) + "\n"+
                                "Area Value: " + String.format("%.2f", tri.getArea()));
            }
            else if (shape instanceof Square)
            {
                Square square = (Square) shape;
                view.printMessage("Square: " + "\n"+
                                "Side Value: " + String.format("%.2f", square.getSide()) + "\n"+
                                "Perimeter Value: " + String.format("%.2f", square.getPerimeter()) + "\n"+
                                "Area Value: " + String.format("%.2f", square.getArea()));
            }
            else if (shape instanceof Circle)
            {
                Circle circle = (Circle) shape;
                view.printMessage("Circle: " + "\n"+
                                "Radius Value: " + String.format("%.2f", circle.getRadius()) + "\n"+
                                "Circumference Value: " + String.format("%.2f", circle.getPerimeter()) + "\n"+
                                "Area Value: " + String.format("%.2f", circle.getArea()));
            }

        }
    }
    
    public void newTri()
    {
        
        this.view.printMessage("Creating Right Triangle");
    
        RightTriangle tri1 = new RightTriangle(
            view.readDouble("Write value for the Base: "),
            view.readDouble("Write value for the Height: "));
    
        tri1.calculatePerimeter();
        tri1.calculateArea();
        view.printMessage("Hypotenuse Value: " + String.format("%.2f", tri1.getHypotenuse()) + "\n"+
                    "Perimeter Value: " + String.format("%.2f", tri1.getPerimeter()) + "\n"+
                    "Area Value: " + String.format("%.2f", tri1.getArea()));
        
        this.list.add(tri1);
        
    }
    
    public void newSquare()
    {
        
        this.view.printMessage("Creating Square");
    
        Square squ = new Square(
            view.readDouble("Write value for the Side: "));
    
        squ.calculatePerimeter();
        squ.calculateArea();
        view.printMessage("Perimeter Value: " + String.format("%.2f", squ.getPerimeter()) + "\n"+
                        "Area Value: " + String.format("%.2f", squ.getArea()));
        
        this.list.add(squ);
        
    }
    
    public void newCircle()
    {
        
        this.view.printMessage("Creating Circle");
    
        Circle circle = new Circle(
            view.readDouble("Write value for the Radius: "));
    
        circle.calculatePerimeter();
        circle.calculateArea();
        view.printMessage("Circumference Value: " + String.format("%.2f", circle.getPerimeter()) + "\n"+
                    "Area Value: " + String.format("%.2f", circle.getArea()));
        
        this.list.add(circle);
        
    }
    
    public void mainMenu()
    {
        boolean exit = false;
        while (!exit)
        {
            int option = view.readInt("You are currently in the Main Menu \n " +
                                    "Please select an Option: \n " +
                                    "[1] List all Shapes \n " +
                                    "[2] Create Right Triangle \n " +
                                    "[3] Create Square \n " +
                                    "[4] Create Circle \n " +
                                    "[0] Exit \n " +
                                    "Your Option: ");
            
            switch(option) 
            {
                case 1:
                    listAll();
                break;
                case 2:
                    newTri();
                break;
                case 3:
                    newSquare();
                break;
                case 4:
                    newCircle();
                break;
                case 0:
                    exit = true;
                break;
            }
        }
    }
    
    public static void main (String[] args)
    {
        Controller con = new Controller();
        con.mainMenu();
    }
}
