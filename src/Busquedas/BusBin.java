package Busquedas;

public class BusBin 
{
     public static void main(final String[] args) {
         final int[] v = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

         System.out.println(metedoc(v, 10, 0, v.length - 1));

     }

     public static int metodo(final int[] v, final int c) {
         int li = 0;
         int ls = (v.length) - 1;
         int centro;

         while (li <= ls) {
             centro = (li + ls) / 2;

             if (c == v[centro]) {
                 return v[centro];
             }

             else {
                 if (c > v[centro]) {
                     li = centro + 1;
                 }

                 else {
                     ls = centro - 1;
                 }
             }
         }

         return -1;
     }

     // metodo recursivo
     public static int metedoc(final int[] v, final int c, final int li, final int ls) {
        int centro;
        if (li <= ls) {
            centro = (li + ls) / 2;

            if (c == v[centro]) {
                return v[centro];
            }

            else {
                if (c > v[centro]) {
                    return metedoc(v, c, centro + 1, ls);
                }

                else {
                    return metedoc(v, c, li, centro - 1);
                }
            }
        }

        return -1;
    }
}
