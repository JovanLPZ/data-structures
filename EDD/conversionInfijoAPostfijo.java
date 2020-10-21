package EDD;

public class conversionInfijoAPostfijo
{
	
    public static void main(String[] args) 
    {
        String expresion = "(x+z)*w/t^y-v"; 

        System.out.println(expresion);
        System.out.println(convertirInfijoAPostfijo(expresion)); 
    }
        

	static int jerarquias(char operador) 
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


    static String convertirInfijoAPostfijo(String expresion) 
        { 
            String resultado = ""; 
              
            pila <Character> pila = new pila <Character> (expresion.length()); 
            
              
            for (int i = 0; i < expresion.length(); i++) 
            { 
    
                if (Character.isLetterOrDigit(expresion.charAt(i)))
                {
                    resultado += expresion.charAt(i);
                } 
                     
                else if (expresion.charAt(i) == '(') 
                {
                    pila.push(expresion.charAt(i)); 
                }

                else if (expresion.charAt(i) == ')') 
                { 
                    while (!pila.empty() && pila.peek() != '(') 
                        {
                            resultado += pila.pop(); 
                        }
                      
                    if (!pila.empty() && pila.peek() != '(') 
                        {
                            System.out.print("La expresion es incorrecta"); 
                        }   

                    else
                        {
                            pila.pop();
                        }
                } 

                else 
                { 
                    while (!pila.empty() && jerarquias(expresion.charAt(i)) <= jerarquias(pila.peek()))
                    { 
                        if(pila.peek() == '(') 
                        {
                            System.out.print("La expresion es incorrecta"); 
                        }

                        resultado += pila.pop(); 
                    } 

                    pila.push(expresion.charAt(i)); 
                } 

            } 
           
            while (!pila.empty())
            { 
                if(pila.peek() == '(') 
                {
                    System.out.print("La expresion es incorrecta"); 
                } 
                resultado += pila.pop(); 
            } 

            return resultado; 
        } 
        
    }



