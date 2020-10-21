package Ordenamiento;

import java.util.Scanner;

public class Radix {
		
		public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);  
	        int[] a = {12, 92, 33, 25, 86, 57, 37, 98, 10, 27};  
	        radix_sort(a);    
	        System.out.println("\n EL VECTOR ORDENADO ES: \n");  
	        for(int i=0;i<10;i++) 
	            System.out.println(a[i]);
	    } 
		
	    static int largest(int a[]) {     
	        int larger=a[0], i;   
	        for(i=1;i<10;i++)  
	        {  
	            if(a[i]>larger)  
	            larger = a[i];  
	        }  
	        return larger; 
	    }
	    static void radix_sort(int a[]) {  
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
}
