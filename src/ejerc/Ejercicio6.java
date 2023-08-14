//Hallar la raíz cuadrada de un número utilizando el método Math
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

public class Ejercicio6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Inserta un número: ");
		
		double num=sc.nextDouble();
		
		double raiz = Math.sqrt(num);
		
		System.out.println("La raíz cuadrada de "+num+" es "+raiz);

	}

}
