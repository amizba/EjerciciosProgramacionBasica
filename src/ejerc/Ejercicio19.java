//Crea un contador ascendente desde 1 hasta un número dado. Uso del bucle while.
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

public class Ejercicio19 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Introduce un límite ");
        int limite = sc.nextInt();
        int contador = 1;

        while (contador <= limite) {
            System.out.println(contador);
            contador++;
        }
        }
    }
