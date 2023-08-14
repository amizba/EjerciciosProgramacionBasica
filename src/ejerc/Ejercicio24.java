/* El programa ha de validar la entrada del usuario para asegurarse de que 
 * ingrese un número positivo. Uso del bucle do… while.
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

public class Ejercicio24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;

        do {
            System.out.print("Ingresa un número positivo: ");
            numero = scanner.nextInt();
            if (numero <= 0) {
                System.out.println("Número no válido. Debe ser positivo.");
            }
        } while (numero <= 0);

        System.out.println("Número válido ingresado: " + numero);
    }
}

