/*Días de la semana. Dado un número del 1 al 7, que representa un día de la semana, 
 * imprime el nombre del día correspondiente. Utiliza el condicional switch.
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

public class Ejercicio17 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce el día de la semana en número: ");
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
		        nombreDia = "Miércoles";
		        break;
		    case 4:
		        nombreDia = "Jueves";
		        break;
		    case 5:
		        nombreDia = "Viernes";
		        break;
		    case 6:
		        nombreDia = "Sábado";
		        break;
		    case 7:
		        nombreDia = "Domingo";
		        break;
		    default:
		        nombreDia = "Día inválido";
		        break;
		}

		System.out.println("Día de la semana: " + nombreDia);


	}

}
