
/**
 * Write a description of class ejem6 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class ejem6
{
    public static void main (String [] args)
    {
        double x, y;
        Scanner teclado= new Scanner(System.in);
        System.out.println(">>>>>UBICACIÓN DE COORDENADAS<<<<<");
        
        System.out.println("Ingresa el punto en X: ");
        x=teclado.nextDouble();
        System.out.println("Ingresa el punto de Y: ");
        y=teclado.nextDouble();
        
        if (x>0 && y>0)
        {
            System.out.println("La coordenada se encuentra el cuadrante 1: " +x +y);
        }
        else{
            if(x<0 && y>0){
            System.out.println("La coordenada se encuentra en el cuadrante 2: "+x +y);
                   
        }
        else if (x<0 && y<0)
        {
            System.out.println("La coordenada se encuentra en el cuadrante 3: "+x +y);
        }
        else if (x>0 && y<0)
        {
            System.out.println("La coordenada se encuentra en el cuadrante 4: "+x +y);
        }
    }
    }
}
