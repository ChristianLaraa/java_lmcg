/**
 * Selección de figuras geometricas a partir de valores calcula su perimetro y area.
 * 
 * @author (Lara Martínez Christian Gael y Ortíz Varela Karla Alejandra) 
 * @version (18/03/2022)
 */
import java.util.Scanner;
public class act10
{
    public static void main (String [] args)
    {
        double radio, areacir, circunferencia, base, altura, arearecta, perirecta, baset, alturat, areatrian, peritrian;
        int figura;
        Scanner entrada= new Scanner(System.in);
        
        System.out.println("\n>>>>>>>>El menú de las figuras geometricas, para obtener el AREA y PERIMETRO es el siguiente<<<<<<\n");
        System.out.println("1.-Circulo");
        System.out.println("2.-Rectángulo");
        System.out.println("3.-Triángulo equilátero");
        System.out.println("\n¿Cual es tu elección?");
        figura=entrada.nextInt();
        
        switch (figura)
        {
            case 1: System.out.println("Introduce el valor del radio: ");
            radio=entrada.nextDouble();
            areacir=Math.PI*Math.pow(radio, 2);
            System.out.println("El valor del ÁREA de el Circulo es -------> "+areacir);
            circunferencia=Math.PI*(radio*2);
            System.out.println("El valor de la CIRCUNFERENCIA o perimetro es --------> "+circunferencia);
                break;
            case 2: System.out.println("Introduce el valor de la base: ");
            base=entrada.nextDouble();
            System.out.println("Introduce el valor de la Altura: ");
            altura=entrada.nextDouble();
            arearecta=base*altura;
            System.out.println("El valor del ÁREA del Rectangulo es ----------> "+arearecta);
            perirecta=(base+base)+(altura+altura);
            System.out.println("El valor del PERÍMETRO del Rectangulo es ----------->"+perirecta);
                break;
            case 3: System.out.println("Introduce el valor de la base: ");
            baset=entrada.nextDouble();
            System.out.println("Introduce el valor de la altura: ");
            alturat=entrada.nextDouble();
            areatrian=baset*alturat/2;
            System.out.println("El valor del ÁREA del Triangulo Equilatero es -----------> "+areatrian);
            peritrian=3*baset;
            System.out.println("El valor del PERÍMETRO del Triangulo Equilatero es -----------> "+peritrian);
                break;
            default: System.out.println("Opción no valida :( ");
                break;
            
        
            
            
        }
        
        
        
    }
}
