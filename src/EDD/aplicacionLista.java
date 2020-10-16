package EDD;

import java.util.Scanner;

public class aplicacionLista 
{
    public static Scanner leer = new Scanner(System.in);

    private static lista lista  = new lista();

  

    public static void main(String[] args) 
    {
        
        int opcion = 0, pass, value;
        String name;
        do
        {
            opcion = menu();

            switch(opcion)
            {
                case 1: //Agregar
                System.out.println("Agregar dato");
                System.out.print("Agregar clave: ");
                pass = leer.nextInt();

                System.out.println("Agregar nombre: ");
                name = leer.next();

                System.out.println("Agregar valor: ");
                value = leer.nextInt();

                lista.add(pass, name, value, lista.pointStart());
             
                
                break;

                case 2: //Retirar
                System.out.println("Retirar dato");
                System.out.print("Agregar clave: ");
                pass = leer.nextInt();

                lista.remove(pass);
           
                break;

                case 3: //Mostrar siguiente
                System.out.println("Mostrar siguiente dato");
                System.out.print("Agregar clave: ");
                pass = leer.nextInt();

                apuntador ap = lista.search(pass);

                if(ap != null)
                {
                    System.err.println(ap);
                }

                else
                {
                    System.out.println("Clave no encontrada");
                }

                break;

                case 4: //Mostrar cola
                System.out.println("Contenido de la lista");

                for(apuntador aux=lista.pointFirst(); !aux.end(); aux.move())
                {
                    System.out.println(aux);
                }               
                break;

               /* case 5: //Acomodar cola
                
                break; */

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
     // System.out.println("5.- Acomodar cola\n");
        System.out.println("0.- Salir\n");
        System.out.print("\nOpcion: ");
        
        return leer.nextInt();
    }
}
