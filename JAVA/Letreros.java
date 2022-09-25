
/**
 * Write a description of class Letreros here.
 * 
 * @author (Sotomayor Garcia Luis Fernando) 
 * @version (24/02/2022)
 */
import java.util.Scanner;
public class Letreros 
{
//atributos
String M1;
String m2;
// Métodos
//método para pedir al usuario los mensajes
public void Mensajes () {
Scanner entrada=new Scanner(System.in);
System.out.println (" introduce el primer mensaje");
M1=entrada.nextLine();
System.out.println (" introduce el segundo mensaje");
m2=entrada.nextLine();
}
//método para mostrar mensajes
public void mostrarresultados() {
System.out.println (" el primer mensaje es="+M1); 
System.out.println (" el segundo mensaje es="+m2);}
public static void main(String[] args) {
Letreros L=new Letreros ();
L.Mensajes();
L.mostrarresultados();
}
}

