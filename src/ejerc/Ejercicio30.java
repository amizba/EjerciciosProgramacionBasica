//Encontrar el elemento m�ximo en un array
/**
* Aprende Java desde cero (https://empezandojava.blogspot.com)
*
* Ejercicios Programaci�n b�sica y arrays
*
* @author Amparo Izquierdo Ba�ez
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

        System.out.println("El elemento m�ximo es: " + maximo);
    }
}
