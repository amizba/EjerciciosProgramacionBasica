/*Calculadora básica. Realiza una operación aritmética simple (+, -, *, /) en base 
 * a dos números y un operador. Uso de switch
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

public class Ejercicio18 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce el primer número: ");
		
		double num1 = sc.nextDouble();
		
		System.out.println("Introduce el operador: +, -, *, /");
		
		char operador=sc.next().charAt(0);
		
		System.out.println("Introduce el segundo  número: ");
		
		double num2 = sc.nextDouble();

		double resultado;

		switch (operador) {
		    case '+':
		        resultado = num1 + num2;
		        break;
		    case '-':
		        resultado = num1 - num2;
		        break;
		    case '*':
		        resultado = num1 * num2;
		        break;
		    case '/':
		        resultado = num1 / num2;
		        break;
		    default:
		        System.out.println("Operador inválido");
		        return;
		}

		System.out.println("Resultado: " + resultado);


	}

}
