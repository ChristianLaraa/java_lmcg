
/**
 * Write a description of class grillo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

/**
 * Write a description of class ConversionEscalas here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class ConversionEscalasNumero
{
    public static void main(String[] args)
    {
        Scanner leer=new Scanner(System.in);
        int escala;
        double C,F,R,K;
        
        System.out.println("Ingresa la temperatura en Celsius:");
        C=leer.nextDouble();
        
        System.out.println("Ingresa el número de la opción a calcular:");
        System.out.println("1. Fahrenheit");
        System.out.println("2. Rankine");
        System.out.println("3. Kelvin");
        System.out.print("¿Tu elección:? ");
        escala=leer.nextInt();
        
        switch (escala){
            case 1: System.out.println("Conversión a la escla Fahrenheit");
                    F=1.8*C+32;
                    System.out.println(C+"°C"+" = "+F+"°F");
                    break;
            case 2: System.out.println("Conversión a la escla Rankine");
                    R=1.8*C+491.7;
                    System.out.println(C+"°C"+" = "+R+"°R");
                    break;
            case 3: System.out.println("Conversión a la escla Kelvin");
                    K=1.8*C+273.15;
                    System.out.println(C+"°C"+" = "+K+" K");        
                    break;
            default:
                    System.out.println("Esa opción es inválida");    
        }
    }
}