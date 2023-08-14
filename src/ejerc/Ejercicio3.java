//Crea una tabla de multiplicar
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

public class Ejercicio3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce un número: ");
		
		int num = sc.nextInt();
		
		for(int i=1; i<=10; i++) {
			
			int producto = num*i;
			
			System.out.println(num + " x "+i+" = "+producto);
		}
		
		

	}

}
