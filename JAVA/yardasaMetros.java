
/**
 * Write a description of class Dato here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class yardasaMetros
{ 
    public static void main(String [] args)
    {
        double yardas, metros, conversion;
        Scanner teclado= new Scanner(System.in);
        
        System.out.println("Convierte Yardas a Metros.");
        
        System.out.println("Introduce el valor de las Yardas a convertir: ");
        yardas=teclado.nextDouble();
        conversion=yardas*0.9144;
        System.out.println("El resultado de tu conversion en metros es: "+conversion);
    
    }
}


