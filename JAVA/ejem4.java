
/**
 * Write a description of class ejem4 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class ejem4
{
    public static void main(String [] args)
    {
        double nhoras, salarioxhora, salariototal, bono20, bono10, bonototal20, bonototal10;
        Scanner teclado= new Scanner(System.in);
        
        System.out.println("Introduce el numero de horas laboradas en la semana: ");
        nhoras=teclado.nextDouble();
        System.out.println("Introduce el salario por hora: ");
        salarioxhora=teclado.nextDouble();
        
        salariototal=nhoras*salarioxhora;
        bono20=salariototal*0.20;
        bono10=salariototal*0.10;
        bonototal20=salariototal+bono20;
        bonototal10=salariototal+bono10;
        
        System.out.println("El salario total sin bono es -------> "+salariototal);
        
        if(nhoras>=35)
        {
        System.out.println("¡Felicidades obtienes un bono del 20%! ------->"+bono20);
        System.out.println("El salario final con bono es -------->> "+bonototal20);
        }
        else
        {
        System.out.println("Tú bono corresponde al 10% ------->"+bono10);
        System.out.println("El salario final con bono es --------->>  "+bonototal10);
        }
        
    }
}
