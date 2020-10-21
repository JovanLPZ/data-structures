package Recursividad;
public class PosNeg 
{
     public static void main(String[] args) 
    {
        
    }    

    public static boolean positivo(int n) {
        if (n > 0)
            return true;
        else
            return negativo(n);
    }

 

    public static boolean negativo(int n) {
        if (n < 0)
            return false;
        else
            return positivo(n);
    }
}
