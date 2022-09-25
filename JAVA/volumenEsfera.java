
/**
 * Este programa calcula el volumen de una Esfera teniendo en cuenta el valor de su radio.
 * 
 * @author (Lara Martínez Christian Gael y Ortíz Varela Karla Alejandra) 
 * @version (16/02/2022)
 */
import java.util.Scanner;
public class volumenEsfera
{
    public static void main(String [] args)
    {
       double v,r; 
       Scanner teclado= new Scanner(System.in);
       
       System.out.println("Escribe el radio de la esfera: ");
       r=teclado.nextDouble();
       v=1.33333*Math.PI*(Math.pow(r, 3));
       System.out.println("El volumen de la Esfera es: "+v);
       
    
    }
}
