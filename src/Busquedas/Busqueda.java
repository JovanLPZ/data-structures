package Busquedas;

public class Busqueda
{
     public static void main(String[] args) 
    {
        //int[] v =  {4,5,6,7};
        int[] vv =  {5,7,1,3,9,6,4};

        System.out.println(desordenado(vv,2));
    }

    public static int desordenado(int v[], int c)
    {
        for(int i = 0; i<=v.length; i++)
        {
            if(v[i] == c)
            {
                System.out.println("El numero fue encontado en la posicion: ");
                return i;
            }

            if(i == v.length)
            {
                System.out.println("El numero no existe");
            }

        }
        return 0;
        
    }

    public static int ordenado(int v[], int c)
    {
         for(int i = 0; i<=v.length; i++)
         {
             if(v[i] == c)
             {
                System.out.print("El numero fue encontado en la posicion: ");
                 return i;
             }

             if(v[0] > c)
             {
                System.out.println("El numero a buscar no existe ");     
             }
        
         }
            
        return 0;       
    }


}