package Recursividad;
public class NumInv 
{
    public static void main(String[] args)
    {
        System.out.println(Num(321));

    }

    public static int Num(int n)
    {
      if (n >= 1)
      {     
         System.out.print((n%10));
          
         return Num(n / 10);
      }
      
      else
      {
          return 0;
      }
    }
}
