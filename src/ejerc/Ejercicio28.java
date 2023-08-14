//Calcular el factorial de un número. Uso del bucle for
/**
* Aprende Java desde cero (https://empezandojava.blogspot.com)
*
* Ejercicios Programación básica y arrays
*
* @author Amparo Izquierdo Bañez
* @mail amizba@gmail.com
*/
package ejerc;

import java.util.Scanner;

public class Ejercicio28 {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Introduce un número");
		int numero = sc.nextInt();
		int factorial = 1;
		for (int i = 1; i <= numero; i++) {
		    factorial *= i;
		}
		System.out.println("El factorial de " + numero + " es: " + factorial);


	}

}
