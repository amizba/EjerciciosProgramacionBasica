//Hallar la suma de números pares hasta N
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

public class Ejercicio4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce el límite: ");
		
		int limite = sc.nextInt();
		
		int suma =0;
		
		for(int i=0; i<=limite; i+=2) {
			
			suma+=i;
			
		}
		
		System.out.println("La suma de números pares hasta "+limite+" es "+suma);

	}

}
