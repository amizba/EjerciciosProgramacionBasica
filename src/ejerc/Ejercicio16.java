/*Calificación numérica a calificación en letras. Dado un número que representa 
 * una calificación numérica del 0 al 10, convierte esta calificación a su 
 * equivalente en letras (A, B, C, D). Uso del condicional switch 
 */
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

public class Ejercicio16 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce la nota numérica: ");
		
		int notaNumérica = sc.nextInt();
		
		char notaLetra;

		switch (notaNumérica) {
		    case 10:
		    case 9:
		    	notaLetra = 'A';
		        break;
		    case 8:
		    	notaLetra = 'B';
		        break;
		    case 7:
		    	notaLetra = 'C';
		        break;
		    case 6:
		    	notaLetra = 'D';
		        break;
		    default:
		    	notaLetra = 'F';
		        break;
		}

		System.out.println("Calificación en letra: " + notaLetra);


	}

}
