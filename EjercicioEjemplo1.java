/*
 * Este programa obtiene el promedio final de un alumno de acuerdo a 4 calificaciones imprime su promedio final  y un mensaje si su promedio es mayor a 9.
 * Lara Martínez Christian Gael 
 * 07/03/2022
 */

import java.util.Scanner;
public class
{
    public static void main(String[] args)
    {
       double c1, c2, c3, c4, promedio;
       Scanner teclado= new Scanner(System.in);
       
       System.out.println("Introduce tu primer calificación: ");
       c1=teclado.nextDouble();
        System.out.println("Introduce tu segunda calificación: ");
        c2=teclado.nextDouble();
        System.out.println("Introduce tu tercer calificación: ");
        c3=teclado.nextDouble();
        System.out.println("Introduce tu cuarta calificación: ");
        c4=teclado.nextDouble();
        
        promedio=c1+c2+c3+c4/4;
        System.out.println("Tu promedio final es: "+promedio);
                
        
    }
    
}
