package Busquedas;

import java.util.Scanner;

public class Hash 
{
     public static void main(String[] args) 
    {
        Scanner leer = new Scanner(System.in);
        String v[] = new String[6];

        System.out.print(Guardar(v));

        leer.close();
    }

    public static int Guardar(String v[])
    {
        Scanner leer = new Scanner(System.in);
        
        System.out.print("Ingrese el dato: ");
        String dato = leer.next();

        int valor = 0; 
        for (int i=0; i < dato.length(); i++)
        {
        valor = valor + dato.codePointAt(i); 
        }

        int clave = valor % (v.length);

        v[clave] = dato;
        
        leer.close();
        return clave;
        
    }

   
}
