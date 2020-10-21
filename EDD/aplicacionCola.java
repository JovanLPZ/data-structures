package EDD;

import java.util.Scanner;

public class aplicacionCola 
{
    public static Scanner leer = new Scanner(System.in);

    private static cola<Integer> cola = new cola<Integer>(5);

    private static colaC<Integer> colaC = new colaC<Integer>(5);

    public static void main(String[] args) 
    {
        
        int opcion = 0;
        do
        {
            opcion = menu();

            switch(opcion)
            {
                case 1: //Agregar
                System.out.println("Agregar dato");

                if(cola.full() || colaC.full()){
                System.out.print("Escriba el dato a agregar: ");
                int cant1 = leer.nextInt();
                
                if(cola.full())
                {
                    System.out.println("Ya no se puede agregar datos, cola llena");
                }

                else
                {
                    cola.add(cant1); 
                }

                if(colaC.full())
                System.out.println("No se puede agregar");

                else
                colaC.add(cant1);
            }
               
                
                break;

                case 2: //Retirar
                if(cola.empty())
                {
                    System.out.println("Cola vacia, nada que retirar");
                }

                else
                {
                    System.out.println(cola.remove());
                }

                if(colaC.empty())
                {
                    System.out.println("Cola vacia, nada que retirar");
                }

                else
                {
                    System.out.println(colaC.remove());
                }

                break;

                case 3: //Mostrar siguiente
                System.out.println("Mostrar siguiente dato");
                if(cola.empty())
                {
                    System.out.println("Nada que mostar");
                }

                else
                {
                    System.out.println(cola.peekNext());
                }

                break;

                case 4: //Mostrar cola
                System.out.println("Contenido de la cola");
                cola.peekQueue();
                System.out.println();
                break;

                case 5: //Acomodar cola
                cola.fitQueue();
                break;

                case 0: //Terminar programa
                System.out.println("Terminar programa");

                default:
                System.out.println("Opcion no valida");

            }

        } while(opcion != 0);
        leer.close();
    }


    public static int menu()
    {
        
        System.out.println("\nMenu de opciones\n");
        System.out.println("1.- Agrega dato\n");
        System.out.println("2.- Retira dato\n");
        System.out.println("3.- Muestra siguiente\n");
        System.out.println("4.- Muestra contenido\n");
        System.out.println("5.- Acomodar cola\n");
        System.out.println("0.- Salir\n");
        System.out.print("\nOpcion: ");
        
        return leer.nextInt();
    }
}
