//Calcular la suma de dos n�meros
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

public class Ejercicio1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce el primer n�mero: ");
		
		int num1 = sc.nextInt();
		
		System.out.println("Introduce el segundo n�mero: ");
		
		int num2 = sc.nextInt();
		
		int suma = num1 + num2;
		
		System.out.println("El resultado de la suma es: "+suma);

	}

}
