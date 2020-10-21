package Recursividad;
public class SumaPar 
{
    public static void main(String[] args) 
    {
        System.out.println(sumaPar(12));
    }

    public static int sumaPar(int n)
    {
        if (n%2 == 1) n--;
      if (n >= 2 )
      {        
         return n + sumaPar(n-2);
      }
      
      else
      {
          return 0;
      }
    }
    
}
