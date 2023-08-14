//Hallar la ra�z cuadrada de un n�mero utilizando el m�todo Math
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

public class Ejercicio6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Inserta un n�mero: ");
		
		double num=sc.nextDouble();
		
		double raiz = Math.sqrt(num);
		
		System.out.println("La ra�z cuadrada de "+num+" es "+raiz);

	}

}
