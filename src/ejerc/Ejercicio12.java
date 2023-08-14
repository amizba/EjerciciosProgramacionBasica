//Determinar si un número es par o impar. Utiliza el condicional if
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

public class Ejercicio12 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Introduce un número: ");
		
		int numero=sc.nextInt();

		if (numero % 2 == 0) {
			
		    System.out.println("El número es par.");
		    
		} else {
			
		    System.out.println("El número es impar.");
		}


	}

}
