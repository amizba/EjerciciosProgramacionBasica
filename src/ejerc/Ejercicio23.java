/*Adivina el número. El programa ha de generar un número aleatorio y le pide al 
 * usuario que adivine ese número. Uso del bucle do… while
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
import java.util.Random;

public class Ejercicio23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int numeroAdivinar = random.nextInt(100) + 1; // Número aleatorio entre 1 y 100
        int intentos = 0;
        int intento;

        do {
            System.out.print("Adivina el número (entre 1 y 100): ");
            intento = scanner.nextInt();
            intentos++;

            if (intento < numeroAdivinar) {
                System.out.println("El número es mayor.");
            } else if (intento > numeroAdivinar) {
                System.out.println("El número es menor.");
            }
        } while (intento != numeroAdivinar);

        System.out.println("¡Correcto! Adivinaste el número en " + intentos + " intentos.");
    }
}

