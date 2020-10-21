package Recursividad;
public class SumNum 
{
    public static void main(String[] args)
    {
        System.out.println(Num(011));

    }

    public static int Num(int n)
    {
        
      if (n >= 1)
      {        
         return n%10 + Num(n / 10);
      }
      
      else
      {
          return 0;
      }
    }
}

// https://stackoverflow.com/questions/35521278/what-does-an-integer-that-has-zero-in-front-of-it-mean-and-how-can-i-print-it