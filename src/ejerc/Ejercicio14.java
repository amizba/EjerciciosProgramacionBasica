// Verificar si una persona es mayor de edad. Utiliza el condicional if
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

public class Ejercicio14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce la edad: ");
		
		int edad=sc.nextInt();
		
		if (edad >= 18) {
			
		    System.out.println("Es mayor de edad.");
		    
		} else {
			
		    System.out.println("Es menor de edad.");
		    
		}


	}

}
