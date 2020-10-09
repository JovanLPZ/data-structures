package Recursividad;

public class examen 
{
    public static void main(String[] args) 
    {

        int binario[] = {0,1,1,1};
        System.out.println(metodo(binario,binario.length-1,0));
    }

    public static int metodo(int vector[], int posicion, int potencia)         
    {
        if ( posicion >= 0)
        {
            return (vector[posicion] * (int)Math.pow(2, potencia)) + metodo(vector, posicion - 1, potencia + 1);
        }
        else
        {
            return 0;
        }
        
    }
}

