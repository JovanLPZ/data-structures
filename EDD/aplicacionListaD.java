package EDD;

import java.util.Scanner;

public class aplicacionListaD 
{
    public static Scanner leer = new Scanner(System.in);

    private static listad<producto> lista  = new listad<>();

  

    public static void main(String[] args) 
    {
        
        int opcion = 0, pass;
        String descripcion;
        float precio;

        lista.addLast(new producto(1, "Lapiz", 5));
        lista.addLast(new producto(2, "Pluma", 7));
        lista.addLast(new producto(3, "Borrador", 10));

        do
        {
            opcion = menu();

            switch(opcion)
            {
                case 1: //Agregar
                System.out.println("Agregar dato");
                System.out.print("Agregar clave: ");
                pass = leer.nextInt();

                System.out.println("Agregar descripcion: ");
                descripcion = leer.next();

                System.out.println("Agregar precio: ");
                precio = leer.nextInt();

                lista.addFirst(new producto(pass, descripcion, precio));
             
                
                break;

                case 2: //Retirar
                System.out.println("Retirar dato");
                System.out.print("Agregar clave: ");
                pass = leer.nextInt();

                int j = 0;

                do
                {

                producto dato = lista.get(j);

                if(dato.getClave() == pass)
                {
                    lista.remove(j);
                    break;
                }

                } while(j < lista.size());
                
                System.out.println(j == lista.size() ? " clave no encontrada" : "Registro eliminado");
           
                break;

                case 3: //Mostrar siguiente
                System.out.println("Mostrar siguiente dato");
                System.out.print("Agregar clave: ");
                pass = leer.nextInt();

                j = 0;

                do
                {
                    producto dato = lista.get(j);

                    if(dato.getClave() == pass)
                    {
                            System.out.println(dato);
                            break;
                    }
                    j++;
                } while(j < lista.size());

                break;

                case 4: //Mostrar cola
                System.out.println("Contenido de la lista");

                for (int i = 0; i < lista.size(); i++) 
                {
                    System.out.println(lista.get(i));
                }

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
        System.out.println("0.- Salir\n");
        System.out.print("\nOpcion: ");
        
        return leer.nextInt();
    }
}
