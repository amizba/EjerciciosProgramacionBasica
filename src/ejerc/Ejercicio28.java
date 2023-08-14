//Calcular el factorial de un n�mero. Uso del bucle for
/**
* Aprende Java desde cero (https://empezandojava.blogspot.com)
*
* Ejercicios Programaci�n b�sica y arrays
*
* @author Amparo Izquierdo Ba�ez
* @mail amizba@gmail.com
*/
package ejerc;

import java.util.Scanner;

public class Ejercicio28 {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Introduce un n�mero");
		int numero = sc.nextInt();
		int factorial = 1;
		for (int i = 1; i <= numero; i++) {
		    factorial *= i;
		}
		System.out.println("El factorial de " + numero + " es: " + factorial);


	}

}
