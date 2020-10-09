package EDD;

import java.util.Scanner;

public class parentesis 
{
    public static void main(String[] args) 
    {
        Scanner leer = new Scanner(System.in);

        System.out.println("Escriba la expresion: ");
        String textoOriginal = leer.next();

        pila<Character> p = new pila<Character>(textoOriginal.length());

        for(int i = 0; i<textoOriginal.length(); i++)
        {
            p.push(textoOriginal.charAt(i));
        }

        String abierto = "",
        cerrado = "";

        for(int i = 0; i<textoOriginal.length(); i++)
        {

            if(textoOriginal.charAt(i) == '(' )
            {
                abierto += p.pop();
            }

            if(textoOriginal.charAt(i) == ')')
            {
                cerrado += p.pop();
            }
            
        }

        if(abierto.length() == cerrado.length())
        {
            System.out.println("La expresion es correcta");
        }

        else
        {
            System.out.println("La expresion es incorrecta");
        }

        leer.close();
    }    
}
