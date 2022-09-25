
/**
 * Write a description of class prueba here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class prueba
public static void main(String[] args) {

double costo, monto, montoimp, desc;

Scanner leer=new Scanner(System.in); monto=0; //Se inicializa la sumatoria para monto total costo=0;

while (costo !=-100) //Controla la lectura de valores { monto-monto+costo; //Acumulación (sumatoria) de costos ingresados

do {//Valida y controla que sólo se sumen valores positivos 

if (costo < 0)

System.out.println("Ingresa un costo válido");

else System.out.println("Ingresa el costo del artículo");

System.out.println("Si no tienes más números ingresa -100"); costo-leer.nextDouble(); if (costo == -100) break; //Verifica si se ingresa el valor de escape

} while (costo<0);

}

montoimp-monto*1.05;

System.out.println("El monto a pagar con impuesto es: "+montoimp);

{

if (montoimp>5000) //Verifica si el monto a pagar recibe descuento desc=montoimp *0.1; montoimp-montoimp-desc;

System.out.println("Se ganó un descuento de: "+desc);

}

System.out.println("El monto a pagar por la compra es de: "+montoimp);
}
