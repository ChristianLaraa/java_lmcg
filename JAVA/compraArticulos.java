
/**
 * Este programa definirá el monto a pagar por una compra realizada
 * 
 * @author (Lara Martínez Christian Gael) 
 * @version (11/02/2022)
 */
import java.util.Scanner;
public class compraArticulos
{
    public static void main(String[] args)
    {
        int x;
        double y,imp16,total, monto;
        
        Scanner lec=new Scanner(System.in);
        
        System.out.println("Número de articulos: ");
        x=lec.nextInt();
        
        System.out.println("Precio de cada articulo: ");
        y=lec.nextDouble();
        
        monto=x+y; /*cantidad antes del impuesto*/
        
        imp16=monto*0.16; /*Monto del impuesto*/
        
        total=monto*1.16; /*(monto + monto*0.16)Total a pagar*/
        
        
    }
}
