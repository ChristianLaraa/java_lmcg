
/**
 * Write a description of class act12 here.
 * 
 * @author (Lara Martínez Christian Gael) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class act12
{
    public static void main (String [] args)   
    {
        double n, calf, promedio, nvc;
        
        Scanner entrada= new Scanner(System.in);
        System.out.println("Ingresa el numero de calificaciones a promediar: ");
        n=entrada.nextDouble();
        
        do 
        {
            
        System.out.println("Introduce tus calificaciones: ");
        calf=entrada.nextDouble();
        calf=calf+1;
        promedio=(n*calf)/n;
        if(n<0 && n>=10)
        {
            System.out.println("Introduce nuevamente la calificación: ");
            nvc=entrada.nextDouble();
        }
        else 
        {
            System.out.println("La promedio final es -------> "+promedio);
            
        }
        }while(n<0 && n>=10);
             
    
}   
}
