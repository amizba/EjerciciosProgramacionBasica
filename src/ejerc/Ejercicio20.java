//Sumar los n�meros pares dentro de un rango dado. Uso de while.
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

public class Ejercicio20 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Introduce un l�mite ");
        int limite = sc.nextInt();
        int suma = 0;
        int numero = 2;

        while (numero <= limite) {
            suma += numero;
            numero += 2;
        }

        System.out.println("La suma de los n�meros pares es: " + suma);
    }
}
