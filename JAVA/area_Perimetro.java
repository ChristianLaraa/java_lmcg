
/**
 * Estre programa calcula el Perimetro y Area de un triangulo por formula de Heron, respectivamente.
 * 
 * @author (Lara Martínez Christian Gael) 
 * @version (a 18/02/2022)
 */
import java.util.Scanner;
public class area_Perimetro
{
    public static void main(String [] args)
    {
        double a, b, c, area, perimetro;
        Scanner teclado= new Scanner(System.in);
        
        System.out.println("Introduce la longitud del lado 'a': ");
        a=teclado.nextDouble();
        System.out.println("Introduce la longitud del lado 'b': ");
        b=teclado.nextDouble();
        System.out.println("Introduce la longitud del lado 'c': ");
        c=teclado.nextDouble();
        
        area= Math.sqrt((a+b+c)*(a+b-c)*(b+c-a)*(c+a-b))/4;
        perimetro=a+b+c;
        
        System.out.println("El area del triangulo es: "+area);
        System.out.println("El perimetro del triangulo es: "+perimetro);
        
    }
}
