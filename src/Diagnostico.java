import java.util.Scanner;

public class Diagnostico {
    public static void main(String[] args) throws Exception 
    {


    Scanner leer = new Scanner(System.in);

    int N; 
    

    System.out.println("Ingrese el tamaño de N: ");
    N = leer.nextInt();

    System.out.println();

    int[][] matriz = new int[N][N];
    float[] R = new float[N], C = new float[N];

    for (int i = 0; i < matriz.length; i++)
      {
        for (int j = 0; j < matriz.length; j++)
        {

        matriz[i][j] = (int) Math.floor(Math.random()*9+1);
      
        }
      }


      System.out.println();

    for (int i = 0; i < matriz.length; i++)
      {
        for (int j = 0; j < matriz.length; j++)
        {
        System.out.print(matriz[i][j] + " ");

        R[i] = R[i] + matriz[i][j];
        C[i] = C[i] + matriz[j][i];
        }

        System.out.println();

        
      }

    
    System.out.println();

    for (int i = 0; i < R.length; i++)
    {
        System.out.println("El promedio del renglon " + (i+1) + " es: " + R[i]/N); 
    }  

    System.out.println();
    
    for (int i = 0; i < C.length; i++)
    {
        System.out.println("El promedio de la columna " + (i+1) + " es: " + C[i]/N); 
    }  
 
    leer.close();

    }

}
