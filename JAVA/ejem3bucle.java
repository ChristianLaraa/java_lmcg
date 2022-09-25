
/**
 * Write a description of class ejem3bucle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class ejem3bucle
{
    public static void main (String [] args)
    {
        double num;
        
        Scanner leer= new Scanner(System.in);
        
        do
        {
            System.out.println("Ingresa un número si quieres terminar ingresa -1: ");
            num=leer.nextDouble();
        
        }while (num!=-1);
    
    }
}
