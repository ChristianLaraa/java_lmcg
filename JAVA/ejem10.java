
/**
 * Write a description of class ejem10 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class ejem10
{
    public static void main (String [] args)
    {
        double suma1, suma,totalsuma, resta, resta1,totalresta, multiplicacion, multiplicacion1,totalmulti, division, division1, totaldivi;
        int operacion;
        Scanner entrada= new Scanner(System.in);
        
        System.out.println(">>>El menú de Operaciónes basicas es el siguiente<<<");
        System.out.println("1.- Suma");
        System.out.println("2.- Resta");
        System.out.println("3.- Multiplicación");
        System.out.println("4.- División");
        System.out.println("¿Cual es tu eleccion?");
        operacion=entrada.nextInt();
        
        switch (operacion)
        {
            case 1: System.out.println("Introduce el primer valor para realizar la suma: ");
            suma=entrada.nextDouble();
            System.out.println("Introduce el segundo valor para realizar la suma: ");
            suma1=entrada.nextDouble();
            totalsuma=suma+suma1;
            System.out.println("El resultado de la suma es --------> "+totalsuma);
                break;
            case 2: System.out.println("Introduce el primer valor para realizar la resta: ");
            resta=entrada.nextDouble();
            System.out.println("Introduce el segundo valor para realizar la resta: ");
            resta1=entrada.nextDouble();
            totalresta=resta-resta1;
            System.out.println("El resultado de la resta es --------> "+totalresta);
                break;
            case 3: System.out.println("Introduce el primer valor para realizar la multiplicación: ");
            multiplicacion=entrada.nextDouble();
            System.out.println("Introduce el segundo valor para realizar la multiplicación: ");
            multiplicacion1=entrada.nextDouble();
            totalmulti=multiplicacion*multiplicacion1;
            System.out.println("El resultado de la multiplicación es -------> "+totalmulti);
                break;
            case 4: System.out.println("Introduce el primer valor para realizar la división: ");
            division=entrada.nextDouble();
            System.out.println("Introduce el segundo valor para realizar la división: ");
            division1=entrada.nextDouble();
            totaldivi=division/division1;
            System.out.println("El resultado de la división es -------> "+totaldivi);
                break;
            default: System.out.println("Opción NO valida");
                break;
        }
    }
}
