//Hallar el valor absoluto utilizando el m�todo Math
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

public class Ejercicio7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Inserta un n�mero: ");
		
		double num=sc.nextDouble();
		
		//Hacemos un casting a entero ya que le pasamos como par�metro un n�mero decimal.
		int valorAbs = (int) Math.abs(num); 
		
		System.out.println("El valor absoluto de "+num+" es "+valorAbs);

	}

}
