package Ordenamiento;

import java.util.Random;
import java.util.Scanner;

public class proyecto 
{
    public static void main(String[] args) 
    {
        Scanner leer = new Scanner(System.in);

        int[] vector = new int[14];
        llenarVector(vector);

        System.out.println("1.- Ordenamiento por seleccion");
        System.out.println("2.- Radix sort");
        System.out.println("3.- Shell sort");

        System.err.println("Seleccione un tipo de ordenamiento: ");
        int tipo = leer.nextInt();

        System.out.println();

        final long INICIO = System.nanoTime();
        switch (tipo) 
        {
            case 1:
            seleccion(vector);
            break;

            case 2:
            radix_sort(vector);
            break;

            case 3:
            shellSort(vector);
            break;

            default:
                break;
        }

        final long FIN = System.nanoTime();
		

        for(int i= 0; i<vector.length; i++)
        {
            System.out.print(vector[i] + ", ");
        }


        System.out.println("\n\nTiempo en ordenar: " + ((FIN-INICIO) / 1e+9) + " segundos");

        leer.close();
    }

    public static int llenarVector(int vector[]) {

        Random r = new Random();
        boolean[] NoDisponible = new boolean[(vector.length * 3) + 1];
        int newN;

        for (int i = 0; i < vector.length; i++) {
            do {
                newN = r.nextInt((vector.length * 3) + 1);
            } while (NoDisponible[newN]);

            NoDisponible[newN] = true;
            vector[i] = newN;
        }
        return 0;
    }

    public static int seleccion(int A[]) {
        int menor, pos, tmp;

        for (int i = 0; i < A.length - 1; i++) {
            menor = A[i];
            pos = i;

            for (int j = i + 1; j < A.length; j++) {
                if (A[j] < menor) {
                    menor = A[j];
                    pos = j;
                }
            }

            if (pos != i) {
                tmp = A[i];
                A[i] = A[pos];
                A[pos] = tmp;
            }
        }

        return 0;
    }

    // radix
    static int largest(int a[]) 
		{     
	        int larger=a[0], i;   
	        for(i=1;i<10;i++)  
	        {  
	            if(a[i]>larger)  
	            larger = a[i];  
	        }  
	        return larger; 
        }
        
        static void radix_sort(int a[]) 
        {  
	        int bucket[][]=new int[10][10];  
	        int bucket_count[]=new int[10];  
	        int remainder, NOP=0, divisor=1, larger, pass;  
	        larger = largest(a);  
	        
	        while(larger>0)  
	        {  
	            NOP++;  
	            larger/=10;  
	        }  
	        
	        // Inicializar los dep�sitos
	        for(pass=0;pass<NOP;pass++)  
	        {  
	            for(int i=0;i<10;i++)  
	            bucket_count[i]=0;
	            
	            for(int i=0;i<10;i++)  {  
	                // ordenar los n�meros de acuerdo con el d�gito en el �ltimo lugar           
	                remainder = (a[i]/divisor)%10;  
	                bucket[remainder][bucket_count[remainder]] = a[i];  
	                bucket_count[remainder] += 1;  
	            }  
	            
	            // recoger los n�meros despu�s del pase 
	            int i=0;  
	            for(int k=0;k<10;k++)  {  
	            	
	                for(int j=0;j<bucket_count[k];j++)  {  
	                    a[i] = bucket[k][j];  
	                    i++;  
	                }  
	            }  
	            divisor *= 10;  
	        }
	    }

    //Shell sort
    public static void shellSort(int data[]) 
        {
            int inner, outer;
            int temp;
            //find initial value of h
            int h = 1;
            while (h <= 0 / 3)
                h = h * 3 + 1; // (1, 4, 13, 40, 121, ...)
    
            while (h > data.length) // decreasing h, until h=1
            {
                // h-sort the file
                for (outer = h; outer < data.length; outer++) {
                    temp = data[outer];
                    inner = outer;
                    // one subpass (eg 0, 4, 8)
                    while (inner > h - 1 && data[inner - h] >= temp) {
                        data[inner] = data[inner - h];
                        inner -= h;
                    }
                    data[inner] = temp;
                }
                h = (h - 1) / 3; // decrease h
            }
        }
        

}


    
