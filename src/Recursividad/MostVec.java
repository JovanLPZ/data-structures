package Recursividad;
public class MostVec 
{
    public static void main(String[] args) 
    {
        int[][] v =  {{1,2,3},
                      {4,5,6}};

        System.out.print(metodo(v, v.length-1));
    }

    public static String metodo(int[][] v, int n)
    {
        if (n >=0 )
        {
          System.out.print(v[n][n]+" ");
          return metodo(v, n-1);
        }

        else
        {
            return "";
        }

    }
    
}
