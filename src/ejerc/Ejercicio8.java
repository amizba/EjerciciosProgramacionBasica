//Hallar el redondeo de un n�mero utilizando el m�todo Math
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

public class Ejercicio8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Inserta un n�mero decimal: ");
		
		double num=sc.nextDouble();
		
		long numRed = Math.round(num);
		
		System.out.println("El n�mero " + num + " redondeado es: " + numRed);

	}

}
