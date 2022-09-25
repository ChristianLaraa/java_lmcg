
/**
 * Write a description of class ejem7 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;

public class ejem7
{
    public static void main (String [] args)
    {
        double a, b, c,x1, x2, discri;
        Scanner teclado= new Scanner(System.in);
        
        System.out.println("Introduce el valor del coeficiente 'a': ");
        a=teclado.nextDouble();
        System.out.println("Introduce el valor del coeficiente 'b': ");
        b=teclado.nextDouble();
        System.out.println("Introduce el valor del coeficiente 'c': ");
        c=teclado.nextDouble();
        
        discri=(Math.pow(b, 2)-4*a*c);
        

        if (discri>0)
        {
            System.out.println("Las raices son reales diferentes: ");
            x1=(-b+Math.sqrt(discri))/(2*a);
            x2=(-b-Math.sqrt(discri))/(2*a);
            System.out.println("El valor de x1 es: "+x1);
            System.out.println("El valor de x2 es: "+x2);
        }
        else if (discri==0)
        {
            System.out.println("Las raices son reales iguales: ");
            x1=b/(2*a);
            System.out.println("x1 = x2 = "+x1);
        }
        else {
            System.out.println("Las raices son imaginarias");
        }
        
    }
}
