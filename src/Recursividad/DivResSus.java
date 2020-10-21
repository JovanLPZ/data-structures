package Recursividad;

public class DivResSus 
{
    public static void main(String[] args)
    {
        System.out.println(metodo(5, 20));
    }

    public static int metodo(int v, int n)
    {
      
       if(n >= v)
       {
        return metodo(v, n-v) + 1;
       }

       else
       { 
          return 0;
       }

    }
}
