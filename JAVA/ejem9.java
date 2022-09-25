
/**
 * Write a description of class ejem9 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class ejem9
{
    public static void main (String [] args)
    {
        double  viernes, sabado, domingo;
        int dia;
        Scanner teclado= new Scanner(System.in);
        
        System.out.println("Los dias del Menú de fin de Semana son: \n1.- Viernes\n \n2.- Sabado\n \n3.- Domingo\n");
        System.out.println("Ingresa el número del dia para obtener el menú. :) ");
        dia=teclado.nextInt();
        
        switch (dia)
        {
            case 1: 
                
                System.out.println("\nEl menu del dia (VIERNES) es ------->\n \nConsome\n \nBirria\n \nFlan de coco\n  \nAgua de Melon.\n ");
            
                break;
        
            case 2: 
                System.out.println("\nEl menu del dia (SABADO) es -------->\n \nSopa de Fideos\n \nMilanesa con Ensalada de lechuga\n \nFresas con Crema\n \nAgua de Limón\n ");
                break;
                
            case 3:
                System.out.println("\nEl menú del dia (DOMINGO) es -------->\n \nMacarrones con Queso\n \nTacos de Cochinita\n \nArroz con Leche\n \nAgua de Piña\n ");
                break;
            default: System.out.println("\nDia no disponible (NO LABORAMOS ESE DIA) :(");
             break;
        }
    }
}
