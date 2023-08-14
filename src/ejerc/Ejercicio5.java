//Hallar la potencia de un n�mero utilizando el m�todo Math
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
