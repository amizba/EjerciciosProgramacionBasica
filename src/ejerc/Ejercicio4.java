//Hallar la suma de n�meros pares hasta N
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

public class Ejercicio4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce el l�mite: ");
		
		int limite = sc.nextInt();
		
		int suma =0;
		
		for(int i=0; i<=limite; i+=2) {
			
			suma+=i;
			
		}
		
		System.out.println("La suma de n�meros pares hasta "+limite+" es "+suma);

	}

}
