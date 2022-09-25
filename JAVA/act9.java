/**
 * Act 9: Este programa calcula el aumento mensual a partir de un valor semanal (convirtiendo semanas en meses), imprime el aumento mensual, salario mensual con aumento incluido.
 * 
 * @author (Lara Martínez Christian Gael y Ortíz Varela Karla Alejandra) 
 * @version (16/03/2022)
 */
import java.util.Scanner;

public class act9
{
    public static void main (String [] args)
    {
        double salario, aumento10, aumento20, aumentototal10, aumentototal20, salariomensual;
        Scanner teclado= new Scanner(System.in);
        
        System.out.println("Introduce la cantidad que obtienes semanalmente: ");
        salario=teclado.nextDouble();
        salariomensual=salario*4;
        aumento20=salariomensual*0.20;
        aumento10=salariomensual*0.10;
        
        System.out.println("El salario mensual es -------> "+salariomensual);
        
        if (salario<2000)
        {
            aumentototal20=salariomensual+aumento20;
            System.out.println("¡Felicidades obtienes un aumento del 20% mensualmente! que corresponde a -------> "+aumento20);
            System.out.println("El salario mensual con el aumento incluido es de -----------> "+aumentototal20);
        }
        else
        {
            aumentototal10=salariomensual+aumento10;
            System.out.println("Obtienes un aumento del 10% mensualmente que corresponde a --------> "+aumento10);
            System.out.println("El salario mensual con el aumento incluido es de -------------> "+aumentototal10);
        }
    }
    
    }

