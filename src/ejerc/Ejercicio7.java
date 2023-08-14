//Hallar el valor absoluto utilizando el método Math
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

public class Ejercicio7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Inserta un número: ");
		
		double num=sc.nextDouble();
		
		//Hacemos un casting a entero ya que le pasamos como parámetro un número decimal.
		int valorAbs = (int) Math.abs(num); 
		
		System.out.println("El valor absoluto de "+num+" es "+valorAbs);

	}

}
