package Recursividad;
import java.util.Scanner;

public class Suma 
{
    public static void main(String[] args)
    {
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese un numero: ");
        int n = leer.nextInt();

        System.out.println();

        System.out.println(suma(n));

        leer.close();
    }

    public static int suma(int n)
    {
        if(n <= 1)
        {
            return 1;
        }

        else
        {
            return n + suma(n-1);
        }

    }
    
}
