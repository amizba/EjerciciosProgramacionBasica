//Calcular el mayor de dos números
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

public class Ejercicio2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce el primer número: ");
		
		int num1 = sc.nextInt();
		
		System.out.println("Introduce el segundo número: ");
		
		int num2 = sc.nextInt();
		
		int mayor=(num1 > num2) ? num1 : num2;
		
		System.out.println("El  número mayor es: "+mayor);

	}

}
