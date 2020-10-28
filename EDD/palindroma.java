package EDD;

import java.util.Scanner;

public class palindroma 
{
    public static void main(String[] args) 
    {
        //pila<String> pilaString = new pila<String>();

        Scanner leer = new Scanner(System.in);

        System.out.println("Escriba el texto: ");
        String textoOriginal = leer.next();

        pila<Character> p = new pila<>(textoOriginal.length());

        for(int i = 0; i<textoOriginal.length(); i++)
        {
            p.push(textoOriginal.charAt(i));
        }

        String txtResultado = "";

        for(int i = 0; i<textoOriginal.length(); i++)
        {
            txtResultado += p.pop();
        }

        if(textoOriginal.equals(txtResultado))
        {
            System.out.println("Es palindroma");
        }

        else
        {
            System.out.println("No es palindroma");
        }

        leer.close();


    }  
}
