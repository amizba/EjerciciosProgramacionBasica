/*Calificaci�n num�rica a calificaci�n en letras. Dado un n�mero que representa 
 * una calificaci�n num�rica del 0 al 10, convierte esta calificaci�n a su 
 * equivalente en letras (A, B, C, D). Uso del condicional switch 
 */
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

public class Ejercicio16 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce la nota num�rica: ");
		
		int notaNum�rica = sc.nextInt();
		
		char notaLetra;

		switch (notaNum�rica) {
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

		System.out.println("Calificaci�n en letra: " + notaLetra);


	}

}
