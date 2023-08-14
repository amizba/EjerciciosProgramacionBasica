//Copiar elementos de un array a otro
/**
* Aprende Java desde cero (https://empezandojava.blogspot.com)
*
* Ejercicios Programación básica y arrays
*
* @author Amparo Izquierdo Bañez
* @mail amizba@gmail.com
*/
package ejerc;

public class Ejercicio31 {
    public static void main(String[] args) {
        int[] numerosOriginales = { 3, 6, 9, 12, 15 };
        int[] numerosCopia = new int[numerosOriginales.length];

        for (int i = 0; i < numerosOriginales.length; i++) {
            numerosCopia[i] = numerosOriginales[i];
        }

        System.out.println("Elementos en el array copia:");
        for (int num : numerosCopia) {
            System.out.print(num + " ");
        }
    }
}
