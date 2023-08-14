//Calcular el costo de un producto con descuento. Utiliza el condicional if
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

public class Ejercicio15 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce el precio del producto: ");
		
		double precioOriginal = sc.nextDouble();
	
		final double descuento = 0.2; // 20% de descuento

		if (descuento > 0 && descuento <= 1) {
			
		    double precioFinal = precioOriginal * (1 - descuento);
		    
		    System.out.println("El precio con descuento es: " + precioFinal);
		    
		} else {
			
		    System.out.println("El descuento no es válido.");
		}


	}

}
