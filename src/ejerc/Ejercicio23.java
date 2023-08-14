/*Adivina el n�mero. El programa ha de generar un n�mero aleatorio y le pide al 
 * usuario que adivine ese n�mero. Uso del bucle do� while
 */
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
import java.util.Random;

public class Ejercicio23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int numeroAdivinar = random.nextInt(100) + 1; // N�mero aleatorio entre 1 y 100
        int intentos = 0;
        int intento;

        do {
            System.out.print("Adivina el n�mero (entre 1 y 100): ");
            intento = scanner.nextInt();
            intentos++;

            if (intento < numeroAdivinar) {
                System.out.println("El n�mero es mayor.");
            } else if (intento > numeroAdivinar) {
                System.out.println("El n�mero es menor.");
            }
        } while (intento != numeroAdivinar);

        System.out.println("�Correcto! Adivinaste el n�mero en " + intentos + " intentos.");
    }
}

