//Hallar el número máximo y mínimo utilizando el método Math
/**
* Aprende Java desde cero (https://empezandojava.blogspot.com)
*
* Ejercicios Programación básica y arrays
*
* @author Amparo Izquierdo Bañez
* @mail amizba@gmail.com
*/
package ejerc;

public class Ejercicio9 {

	public static void main(String[] args) {
        int[] numeros = { 5, 10, -3, 8, 0 };
        
        int maximo = Math.max(numeros[0], Math.max(numeros[1], Math.max(numeros[2], Math.max(numeros[3], numeros[4]))));
        
        int minimo = Math.min(numeros[0], Math.min(numeros[1], Math.min(numeros[2], Math.min(numeros[3], numeros[4]))));
        
        System.out.println("El máximo es: " + maximo);
        
        System.out.println("El mínimo es: " + minimo);
    }
}
