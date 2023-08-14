/*Calculadora b�sica. Realiza una operaci�n aritm�tica simple (+, -, *, /) en base 
 * a dos n�meros y un operador. Uso de switch
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

public class Ejercicio18 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce el primer n�mero: ");
		
		double num1 = sc.nextDouble();
		
		System.out.println("Introduce el operador: +, -, *, /");
		
		char operador=sc.next().charAt(0);
		
		System.out.println("Introduce el segundo  n�mero: ");
		
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
		        System.out.println("Operador inv�lido");
		        return;
		}

		System.out.println("Resultado: " + resultado);


	}

}
