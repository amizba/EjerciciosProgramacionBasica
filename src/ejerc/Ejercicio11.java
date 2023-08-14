//Verificar si un número es positivo, negativo o cero. Utiliza el condicional if.
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

public class Ejercicio11 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Introduce un número: ");
		
		int numero=sc.nextInt();

		if (numero > 0) {
			
		    System.out.println("El número es positivo.");
		    
		} else if (numero < 0) {
			
		    System.out.println("El número es negativo.");
		    
		} else {
			
		    System.out.println("El número es cero.");
		    
		}
}
}