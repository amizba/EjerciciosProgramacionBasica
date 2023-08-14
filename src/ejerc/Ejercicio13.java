//Comparar dos n�meros y mostrar el mayor. Utiliza el condicional if
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

public class Ejercicio13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce el primer n�mero: ");
		
		int num1=sc.nextInt();
		
		System.out.println("Introduce el segundo n�mero: ");
		
		int num2=sc.nextInt();

		if (num1 > num2) {
			
		    System.out.println("El primer n�mero es mayor: " + num1);
		    
		} else if (num2 > num1) {
			
		    System.out.println("El segundo n�mero es mayor: " + num2);
		    
		} else {
			
		    System.out.println("Los n�meros son iguales.");
		}


	}

}
