/*D�as de la semana. Dado un n�mero del 1 al 7, que representa un d�a de la semana, 
 * imprime el nombre del d�a correspondiente. Utiliza el condicional switch.
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

public class Ejercicio17 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce el d�a de la semana en n�mero: ");
		int numDia = sc.nextInt();
		String nombreDia;

		switch (numDia) {
		    case 1:
		        nombreDia = "Lunes";
		        break;
		    case 2:
		        nombreDia = "Martes";
		        break;
		    case 3:
		        nombreDia = "Mi�rcoles";
		        break;
		    case 4:
		        nombreDia = "Jueves";
		        break;
		    case 5:
		        nombreDia = "Viernes";
		        break;
		    case 6:
		        nombreDia = "S�bado";
		        break;
		    case 7:
		        nombreDia = "Domingo";
		        break;
		    default:
		        nombreDia = "D�a inv�lido";
		        break;
		}

		System.out.println("D�a de la semana: " + nombreDia);


	}

}
