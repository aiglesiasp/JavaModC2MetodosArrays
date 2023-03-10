import java.util.Scanner;

/**
 * 
 */

/**
 * @author aitor
 *
 */
public class Ejercicio3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("EJERCICIO 3 - NUMEROS PRIMOS");
		System.out.println("Introduce un numero entero por teclado: ");
		int numero = sc.nextInt();
		sc.close();
		boolean resultado = comprovarPrimo(numero);
		if (resultado) {
			System.out.println("El numero " + numero + " es un numero PRIMO");
		} else {
			System.out.println("El numero " + numero + " NO es un numero PRIMO");
		}

	}

	// COMPROVAR PRIMO
	public static boolean comprovarPrimo(int numero) {
		int contador = 0;
		for (int i = 1; i <= numero; i++) {
			if (numero % i == 0) {
				contador++;
			}
		}
		if (contador == 2 || numero == 1) {
			return true;
		} else {
			return false;
		}
	}
}
