//Calcular la suma de los primeros 10 números naturales. Uso del bucle for
/**
* Aprende Java desde cero (https://empezandojava.blogspot.com)
*
* Ejercicios Programación básica y arrays
*
* @author Amparo Izquierdo Bañez
* @mail amizba@gmail.com
*/
package ejerc;

public class Ejercicio26 {

	public static void main(String[] args) {
		int suma = 0;
		for (int i = 1; i <= 10; i++) {
		    suma += i;
		}
		System.out.println("La suma es: " + suma);


	}

}
