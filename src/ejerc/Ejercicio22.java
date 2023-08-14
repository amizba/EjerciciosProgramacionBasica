/*Suma de números. El programa ha de sumar números ingresados por el usuario 
 * hasta que el usuario ingrese un valor negativo. Uso del bucle do… while.
 */
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

public class Ejercicio22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int suma = 0;
        int numero;

        do {
            System.out.print("Ingresa un número (ingresa un negativo para terminar): ");
            numero = scanner.nextInt();
            suma += numero;
        } while (numero >= 0);

        System.out.println("La suma de los números ingresados es: " + suma);
    }
}

