//Verificar si un n�mero es positivo, negativo o cero. Utiliza el condicional if.
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

public class Ejercicio11 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Introduce un n�mero: ");
		
		int numero=sc.nextInt();

		if (numero > 0) {
			
		    System.out.println("El n�mero es positivo.");
		    
		} else if (numero < 0) {
			
		    System.out.println("El n�mero es negativo.");
		    
		} else {
			
		    System.out.println("El n�mero es cero.");
		    
		}
}
}