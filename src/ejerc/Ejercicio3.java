//Crea una tabla de multiplicar
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

public class Ejercicio3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce un n�mero: ");
		
		int num = sc.nextInt();
		
		for(int i=1; i<=10; i++) {
			
			int producto = num*i;
			
			System.out.println(num + " x "+i+" = "+producto);
		}
		
		

	}

}
