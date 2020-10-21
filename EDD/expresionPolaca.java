package EDD;

import java.util.Scanner;

public class expresionPolaca 
{
    public static void main(String[] args) 
    {
        Scanner leer = new Scanner(System.in);

        System.out.println("Escriba la expresion: ");
        String expresion = leer.next();
        leer.close();

        pila<Character> p = new pila<Character>(expresion.length());

        


        int abierto1 = 0, cerrado1 = 0,
        abierto2 = 0, cerrado2 = 0,
        abierto3 = 0, cerrado3 = 0;


        for(int i = 0; i<expresion.length(); i++)
        {

            if(expresion.charAt(i) == '(' )
            {
                p.push(expresion.charAt(i));
                abierto1++;
            }

            if(expresion.charAt(i) == ')' )
            {
                p.pop();
                cerrado1++;
            }

            if(expresion.charAt(i) == '{' )
            {
                p.push(expresion.charAt(i));
                abierto2++;
            }

            if(expresion.charAt(i) == '}')
            {
                p.pop();
                cerrado2++;
            }

            if(expresion.charAt(i) == '[')
            {
                p.push(expresion.charAt(i));
                abierto3++;
            }

            if(expresion.charAt(i) == ']')
            {
                p.pop();
                cerrado3++;
            }

            
        }

        boolean correcto = false;

        if(p.empty() == true && abierto1 == cerrado1 && abierto2 == cerrado2 && abierto3 == cerrado3)
        {
            System.out.println("\nLa expresion es correcta");
            System.out.print("\nExpresion infija: " + expresion);

            correcto = true;
        }

        else
        {
            System.out.println("\nLa expresion es incorrecta, no se puede continuar");

        }

        String resultado = "";

        if (correcto)
        {
            for (int i = 0; i < expresion.length(); i++) 
            { 
    
                if (Character.isLetterOrDigit(expresion.charAt(i)))
                {
                    resultado += expresion.charAt(i);
                } 
                     
                else if (expresion.charAt(i) == '(' || expresion.charAt(i) == '{' || expresion.charAt(i) == '[') 
                {
                    p.push(expresion.charAt(i)); 
                }

                else if (expresion.charAt(i) == ')' || expresion.charAt(i) == '}' || expresion.charAt(i) == ']') 
                { 
                    while (!p.empty() && p.peek() != '(' && p.peek() != '{' && p.peek() != '[') 
                        {
                            resultado += p.pop(); 
                        }
                      
                    if (!p.empty() && p.peek() != '(' && p.peek() != '{' && p.peek() != '[') 
                        {
                            System.out.print("\nLa expresion es incorrecta"); 
                        }   

                    else
                        {
                            p.pop();
                        }
                } 

                else 
                { 
                    while (!p.empty() && jerarquias(expresion.charAt(i)) <= jerarquias(p.peek()))
                    { 
                        if(p.peek() == '(' || p.peek() == '{' || p.peek() == '[') 
                        {
                            System.out.print("\nLa expresion es incorrecta"); 
                        }

                        resultado += p.pop(); 
                    } 

                    p.push(expresion.charAt(i)); 
                } 

            } 
           
            while (!p.empty())
            { 
                if(p.peek() == '(' || p.peek() == '{' || p.peek() == '[') 
                {
                    System.out.print("\nLa expresion es incorrecta"); 
                } 
                resultado += p.pop(); 
            } 

             System.out.println("\nExpresion postfija: " + resultado); 
        } 
        



    }


    private static int jerarquias(char operador) 
    { 
        switch (operador) 
        { 
            

            case '^': 
            return 3; 
               
            case '*': 
            case '/': 
            case '%':
            return 2; 

            case '+': 
            case '-': 
            return 1; 
            
        } 

            return 0; 

    }



    
    
}  





