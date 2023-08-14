/*Crear una matriz identidad. Una matriz identidad es matriz cuadrada donde todos 
 * sus elementos son ceros (0) menos los elementos de la diagonal principal que son 
 * unos (1).
 */
/**
* Aprende Java desde cero (https://empezandojava.blogspot.com)
*
* Ejercicios Programación básica y arrays
*
* @author Amparo Izquierdo Bañez
* @mail amizba@gmail.com
*/
package ejerc;

public class Ejercicio34 {
    public static void main(String[] args) {
        int n = 4;
        int[][] identidad = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    identidad[i][j] = 1;
                } else {
                    identidad[i][j] = 0;
                }
                System.out.print(identidad[i][j] + " ");
            }
            System.out.println();
        }
    }
}
