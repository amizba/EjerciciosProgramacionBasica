/*Adivinar el número. El programa tiene que generar un número aleatorio y el usuario 
 * debe adivinarlo. Uso de while
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

import java.util.Random;
import java.util.Scanner;

public class Ejercicio21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int numeroAdivinar = random.nextInt(100) + 1;
        int intentos = 0;
        int intento;

        System.out.println("¡Adivina el número entre 1 y 100!");

        while (true) {
            intentos++;
            System.out.print("Intento #" + intentos + ": ");
            intento = scanner.nextInt();

            if (intento == numeroAdivinar) {
                System.out.println("¡Correcto! ¡Adivinaste el número en " + intentos + " intentos!");
                break;
            } else if (intento < numeroAdivinar) {
                System.out.println("El número es mayor.");
            } else {
                System.out.println("El número es menor.");
            }
        }
    }
}

