
/**
 * Este programa obtiene el promedio a partir de 3 datos imprime la calificacion final y un mensaaje en base a la calificacion si es aprobatoria o reprobatoria
 * 
 * @author (Lara Martínez Christian Gael) 
 * @version (13/03/2022)
 */
import java.util.Scanner;
public class ejem2
{
    public static void main(String [] args)
    {
        double p1, p2, p3, cfinal;
        Scanner teclado=new Scanner(System.in);
        
        System.out.println("Introduce tu calificación del primer parcial: ");
        p1=teclado.nextDouble();
        System.out.println("Introduce la calificacion del segundo parcial: ");
        p2=teclado.nextDouble();
        System.out.println("Introduce la calificacion del tercer parcial: ");
        p3=teclado.nextDouble();
        
        cfinal= (p1+p2+p3)/3;
        System.out.println("La calificación final obtenida es: "+cfinal);
        
        if (cfinal>=6)
        {
            System.out.println("¡Felicidades Aprobaste el curso!");
        }
        else 
        {
            System.out.println("Reprobaste");
        }
    }
}
