package Ordenamiento;
public class OrdSelec 
{
     public static void main(String[] args) 
    {
        int[] v =  {50,26,7,9,15,27};

        for(int i= 0; i<v.length; i++)
        {
            System.out.print(v[i] + " ");
        }

        System.out.println();

        seleccion(v);

        for(int i= 0; i<v.length; i++)
        {
            System.out.print(v[i] + " ");
        }
    }

    public static int seleccion(int A[]) 
    {
        int menor, pos, tmp;

        for (int i = 0; i < A.length - 1; i++) 
        {      
              menor = A[i];                                          
              pos = i;     

              for (int j = i + 1; j < A.length; j++)
              { 
                    if (A[j] < menor) 
                    {           
                        menor = A[j];             
                        pos = j;
                    }
              }

              if (pos != i)
              {                                              
                  tmp = A[i];
                  A[i] = A[pos];
                  A[pos] = tmp;
              }
        }

        return 0;
    }
}
