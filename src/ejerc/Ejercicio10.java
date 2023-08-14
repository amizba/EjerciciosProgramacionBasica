/* Uso de la clase String. Crea una frase; obt�n la longitud de la frase; 
 * crea otra frase y concat�nalas; compara ambas cadenas; convertir una de las 
 * frases a may�sculas y min�sculas; obtener un car�cter en una posici�n espec�fica; 
 * buscar una subcadena; extraer una subcadena; reemplazar la �o� por la �a� y 
 * dividir una de las frases en partes.  
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

public class Ejercicio10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        // Crear una frase
		System.out.println("Inserta una frase: ");
        String frase1 = sc.nextLine();

        // Obtener la longitud de la frase
        int length = frase1.length();
        System.out.println("Longitud: " + length); 

        // Concatenar cadenas
		System.out.println("Inserta otra frase: ");
        String frase2 = sc.nextLine();
        String concatenated = frase1.concat(frase2);
        System.out.println("Concatenada: " + concatenated); 

        // Comparar cadenas
        boolean areEqual = frase1.equals(frase2);
        System.out.println("Iguales: " + areEqual); // Salida: Iguales: true

        // Convertir a may�sculas y min�sculas
        String uppercase = frase1.toUpperCase();
        String lowercase = frase2.toLowerCase();
        System.out.println("May�sculas: " + uppercase); 
        System.out.println("Min�sculas: " + lowercase); 

        // Obtener un car�cter en una posici�n espec�fica
        char charAtIndex = frase1.charAt(7);
        System.out.println("Car�cter en la posici�n 7: " + charAtIndex); 

        // Buscar una subcadena
        int indexOfSubstring = frase1.indexOf("mundo"); //si en la frase est� la palabra 'mundo' u otra
        System.out.println("�ndice de 'mundo': " + indexOfSubstring); 

        // Extraer una subcadena
        String substring = frase1.substring(0, 4);
        System.out.println("Subcadena: " + substring); 

        // Reemplazar caracteres
        String replaced = frase1.replace('o', 'a');
        System.out.println("Reemplazada: " + replaced); 

    }
}
