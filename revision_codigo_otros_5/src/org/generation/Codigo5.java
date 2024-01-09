package org.generation;


// Importamos scanner
import java.util.Scanner;

// Checa la cantidad de 3, 7, 8 y 9 que tiene un número. Si dicha cantidad de numeros es mayor que 
// el resto de cualquier otro número, el número es afortunado. En caso ccontrario, es un número no afortunado
public class Codigo5 {
	// creamos el metodo main para que pueda ejecutarse el archivo y colocamos todo
	// dentro de este metodo
	public static void main(String[] args) {
		// creamos un objeto de la clase scanner que reciba algo del usuario
		Scanner sc = new Scanner(System.in);
		// corregimos la comilla final por "
		System.out.println("Introduzca un número: ");
		// pedimos que el objeto sc escanee el siguiente numero entero y lo guarde
		// dentro de de una variable
		// llamda numberInput. Ademas cambiamos el tipo de dato de String a int
		int inputNumber = sc.nextInt();

		int c = inputNumber;

		int numberoAfortunado = 0;
		int numeroNoAfortunado = 0;

		// mientras el inputNumber sea mayor a cero
		while (inputNumber > 0) {
			// declaramos una variable llamada digito cuyo valor sera el residuo de dividir
			// inputNumber
			// entre 10
			int digito = inputNumber % 10; // no es necario convertir a int el inputNumber ya que ya es entero
			// si digito es 3, 7, 8 o 9
			if ((digito == 3) || (digito == 7) || (digito == 8) || (digito == 9)) {
				// el contador de numeroAfortunado se incrementa en uno
				numberoAfortunado++;
				// en otro caso el contador de numeroNoAfortunado se incrementa en uno
			} else {
				numeroNoAfortunado++;
			}
			
			//  sacamos del else la condicion para salir del while
			// dividimos el input number entre 10
			inputNumber /= 10;
		}

		// al final, si el contador de numeroAfortunado es mayor que el de numero no
		// afortunado
		if (numberoAfortunado > numeroNoAfortunado) {
			// Imprimimos que el numero que se ingresó originalmente cuyo valor fue guardado
			// por la variable
			// c es afortunado
			System.out.println("El " + c + " es un número afortunado."); // agregamos t al prinln
		} // en caso contrario no es afortunado
		else {
			System.out.println("El " + c + " no es un número afortunado.");
		}

	}

}
