package Recursividad;
public class MultSuc 
{
     public static void main(String[] args) 
    {
        System.out.println(metodo(6,4));
    }

    public static int metodo(int n, int v)
    {
        if(v > 0)
       {
        return metodo(n, v-1) + n;
       }

       else
       { 
          return 0;
       }
    }
}
