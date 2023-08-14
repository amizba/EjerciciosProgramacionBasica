//Comparar dos números y mostrar el mayor. Utiliza el condicional if
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

public class Ejercicio13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce el primer número: ");
		
		int num1=sc.nextInt();
		
		System.out.println("Introduce el segundo número: ");
		
		int num2=sc.nextInt();

		if (num1 > num2) {
			
		    System.out.println("El primer número es mayor: " + num1);
		    
		} else if (num2 > num1) {
			
		    System.out.println("El segundo número es mayor: " + num2);
		    
		} else {
			
		    System.out.println("Los números son iguales.");
		}


	}

}
