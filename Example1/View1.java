
import java.util.Scanner;
/**
 * Write a description of class View1 here.
 * 
 * @author (Ruben) 
 * @version (v1)
 */
public class View1
{
    public double readDouble(String m)
    {
        double num = 0;
        Scanner in = new Scanner(System.in);
        boolean error = true;
        do 
        {
            try
            {
                System.out.print(m);
                num = in.nextInt();
                error = false;
            }
            catch(java.util.InputMismatchException ex)
            {  
                System.out.println("Input was not a number, please try again. ");
                in.next();
            }
            catch(NumberFormatException ex)
            {  
                System.out.println("Input was not a number, please try again. "); 
                in.next();
            }
        } while (error);
        return num;
    }
    
    public int readInt(String m)
    {
        int num = 0;
        Scanner in = new Scanner(System.in);
        boolean error = true;
        do 
        {
            try
            {
                System.out.print(m);
                num = in.nextInt();
                error = false;
            }
            catch(java.util.InputMismatchException ex)
            {  
                System.out.println("Input was not a number, please try again. ");
                in.next();
            }
            catch(NumberFormatException ex)
            {  
                System.out.println("Input was not a number, please try again. "); 
                in.next();
            }
        } while (error);
        return num;
    }
    
    public void printMessage(String m)
    {
        System.out.println(m);
    }
}
