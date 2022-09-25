
/**
 * Write a description of class ejem2bucle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class ejem2bucle
{
    public static void main (String [] args)
    {
        int nvt, tv; 
        
        String trabajador;
        
        Scanner entrada= new Scanner(System.in);
        
        System.out.println("Escribe el nombre del trabajador: ");
        trabajador=entrada.nextLine();
        
        
        System.out.println("Escribe el número de veces a imprimir: ");
        nvt=entrada.nextInt();
        
        tv=1;
        
        while (tv<=nvt){
            System.out.println(trabajador);
            tv=tv+1;
            
        }
        
        
        
        
    }
}
