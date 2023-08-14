//Hallar la potencia de un número utilizando el método Math
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

public class Ejercicio5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Inserta la base: ");
		
		double base=sc.nextDouble();
		
		System.out.println("Inserta el exponente: ");
		
		double exponente=sc.nextDouble();
		
		double potencia = Math.pow(base, exponente);
		
        System.out.println("Potencia de " + base + " elevado a " + exponente + " es: " + potencia);

	}

}
