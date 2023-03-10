import java.util.Scanner;

/**
 * 
 */

/**
 * @author aitor
 *
 */
public class Ejercicio12 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("EJERCICIO 12 - OBTENER CIERTOS NUMEROS DE UN ARRAY");
		Scanner sc = new Scanner(System.in);
		boolean estado = false;
		int numElegido = 0;
		System.out.print("Introduce el tamaño del array: ");
		int tamaño = sc.nextInt();
		sc.nextLine();

		do {
			System.out.print("Introduce el numero por el cual termina del 0 al 9: ");
			numElegido = sc.nextInt();
			if (numElegido >= 0 && numElegido <= 9) {
				estado = true;
			}
		} while (!estado);

		sc.close();
		int arrayGenerada[] = rellenarArray(tamaño);
		imprimirArray(arrayGenerada, numElegido);

	}

	// RELLENAR ARRAY
	public static int[] rellenarArray(int tamaño) {
		int resultado[] = new int[tamaño];
		for (int i = 0; i < resultado.length; i++) {
			resultado[i] = (int) Math.floor(Math.random() * 300 + 1);
		}
		return resultado;
	}

	// IMPRIMIR ARRAY
	public static void imprimirArray(int arrayRellenado[], int valor) {
		int contador = 0;
		for (int i = 0; i < arrayRellenado.length; i++) {
			int num = arrayRellenado[i];
			String numString = String.valueOf(num);
			String valorString = String.valueOf(valor);
			boolean estado = numString.endsWith(valorString);

			if (estado) {
				System.out.println("Tenemos en la posicion " + i + " el valor " + arrayRellenado[i]);
				contador++;
			}
		}
		if (contador == 0) {
			System.out.println("No hemos encontrado ningun valor que coincida");
		}
	}

}
