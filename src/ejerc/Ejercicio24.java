/* El programa ha de validar la entrada del usuario para asegurarse de que 
 * ingrese un n�mero positivo. Uso del bucle do� while.
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

public class Ejercicio24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;

        do {
            System.out.print("Ingresa un n�mero positivo: ");
            numero = scanner.nextInt();
            if (numero <= 0) {
                System.out.println("N�mero no v�lido. Debe ser positivo.");
            }
        } while (numero <= 0);

        System.out.println("N�mero v�lido ingresado: " + numero);
    }
}

