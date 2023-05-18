import javax.swing.JOptionPane;;
/**
 * 
 * 
 * @author (Ruben) 
 * @version (v1)
 */
public class View2
{
    public double readDouble(String m)
    {
        double num = 0;
        boolean error = true;
        do 
        {
            try
            {
                System.out.print(m);
                num = Double.parseDouble(JOptionPane.showInputDialog(m));
                error = false;
            }
            catch(java.util.InputMismatchException ex)
            {
                JOptionPane.showMessageDialog(null, "Input was not a number, please try again. ",
                    "Input error", JOptionPane.ERROR_MESSAGE);
            }
            catch(NumberFormatException ex)
            {  
                JOptionPane.showMessageDialog(null, "Input was not a number, please try again. ",
                    "Input error", JOptionPane.ERROR_MESSAGE);
            }
        } while (error);
        return num;
    }
    
    public int readInt(String m)
    {
        int num = 0;
        boolean error = true;
        do 
        {
            try
            {
                num = Integer.parseInt(JOptionPane.showInputDialog(m));
                error = false;
            }
            catch(java.util.InputMismatchException ex)
            {  
                JOptionPane.showMessageDialog(null, "Input was not a number, please try again. ",
                    "Input error", JOptionPane.ERROR_MESSAGE);
            }
            catch(NumberFormatException ex)
            {  
                JOptionPane.showMessageDialog(null, "Input was not a number, please try again. ",
                    "Input error", JOptionPane.ERROR_MESSAGE);
            }
        } while (error);
        return num;
    }
    
    public void printMessage(String m)
    {
        JOptionPane.showMessageDialog(null, m,
                    "Data Output", JOptionPane.INFORMATION_MESSAGE);
    }
}
