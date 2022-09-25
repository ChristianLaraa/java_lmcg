
/**
 * Write a description of class ejem5 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class ejem5
{   
    public static void main (String [] args)
    {
        double calipa1, calipa2, calipa3, tareas, califinal, calipunto;
        Scanner teclado= new Scanner(System.in);
        
        System.out.println("Digita la calificación del parcial 1: ");
        calipa1=teclado.nextDouble();
        System.out.println("Digita la calificación del parcial 2: ");
        calipa2=teclado.nextDouble();
        System.out.println("Digita la calificación del parcial 3: ");
        calipa3=teclado.nextDouble();
        
        califinal=(calipa1+calipa2+calipa3)/3;
        System.out.println("Tu promedio es ------> "+califinal);
        
        System.out.println("Digita la cantidad de Tareas Entregadas: ");
        tareas=teclado.nextDouble();
        
        calipunto=califinal+1;
        
        if (tareas>15)
        {
            califinal=califinal+1;
            if (califinal>10)
            califinal=10;
            System.out.println("El promedio final con punto extra es: "+ califinal);
            
        }
        if (califinal>=6)
        {
            System.out.println("¡Felicidades Aprobaste el curso");
        }
        else 
            System.out.println("Reprobaste el curso):");
    }
    }
