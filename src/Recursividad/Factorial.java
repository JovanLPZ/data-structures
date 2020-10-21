package Recursividad;
import java.util.Scanner;

public class Factorial 
{
    public static void main(String[] args) throws Exception 
    {
        int n;
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingresa un numero: ");
        n = leer.nextInt();

        System.out.println(factorial(n));

        leer.close();
    }

    public static int factorial(int n)
    {

    if (n == 0)
     {
        return  1;
     }

    else
     {
        return  n * factorial(n - 1);
     }

    }
}

