//Encontrar el elemento máximo en un array
/**
* Aprende Java desde cero (https://empezandojava.blogspot.com)
*
* Ejercicios Programación básica y arrays
*
* @author Amparo Izquierdo Bañez
* @mail amizba@gmail.com
*/
package ejerc;

public class Ejercicio30 {
    public static void main(String[] args) {
        int[] numeros = { 32, 15, 74, 29, 46 };
        int maximo = numeros[0];

        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > maximo) {
                maximo = numeros[i];
            }
        }

        System.out.println("El elemento máximo es: " + maximo);
    }
}
