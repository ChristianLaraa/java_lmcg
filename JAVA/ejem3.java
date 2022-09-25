
/**
 * Este programa calcula el total a partir del numero de articulos, el costo de cada uno, si la compra es superior a 5000 se aplica un descuento del 10% de lo contrario no existe el descuento, imprime el valor de la compra, el descuento si existe, monto a pagar si existio descuento.
 * 
 * @author (Lara Martinez Christian Gael) 
 * @version (13/03/2022)
 */
import java.util.Scanner;
public class ejem3
{
    public static void main(String [] args)
    {
       double narticulos, costoarticulo, valor, descuento, valorfinal;
       Scanner teclado= new Scanner(System.in);
       
       System.out.println("Proporciona el numero de articulos: ");
       narticulos=teclado.nextDouble();
       System.out.println("Proporciona el costo de cada unidad: ");
       costoarticulo=teclado.nextDouble();
       
       valor=narticulos*costoarticulo;
       descuento= valor*0.10;
       valorfinal=valor-descuento;
       System.out.println("Total:"+valor);
       if(valor>5000)
       {
           System.out.println("¡Felicidades has obtenido un decuento del 10%! ------> " +descuento);
           System.out.println("LA CANTIDAD FINAL A PAGAR ES -------> "+valorfinal);
    }
    else 
    {
    System.out.println("No existe un descuento. ");
    }
}
}
