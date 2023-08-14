//Hallar el redondeo de un número utilizando el método Math
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

public class Ejercicio8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Inserta un número decimal: ");
		
		double num=sc.nextDouble();
		
		long numRed = Math.round(num);
		
		System.out.println("El número " + num + " redondeado es: " + numRed);

	}

}
