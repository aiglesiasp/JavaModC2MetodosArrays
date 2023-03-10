import java.util.Scanner;

/**
 * 
 */

/**
 * @author aitor
 *
 */
public class Ejercicio11 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("EJERCICIO 11 - MULTIPLICAR ARRAYS");
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el tamaño del array: ");
		int tamaño = sc.nextInt();
		sc.close();
		int array1[] = rellenarArray(tamaño);
		int array2[] = rellenarArray(tamaño);
		int arrayResultado[] = multiplicarArrays(array1, array2);
		System.out.println("ARRAY 1");
		imprimirArray(array1);
		System.out.println("");
		System.out.println("ARRAY 2");
		imprimirArray(array2);
		System.out.println("");
		System.out.println("ARRAY 1MULTIPLICADA");
		imprimirArray(arrayResultado);
	}

	// RELLENAR ARRAY
	public static int[] rellenarArray(int tamaño) {
		int resultado[] = new int[tamaño];
		for (int i = 0; i < resultado.length; i++) {
			resultado[i] = (int) Math.floor(Math.random() * 100 + 1);
		}
		return resultado;
	}

	// IMPRIMIR ARRAY
	public static void imprimirArray(int arrayRellenado[]) {
		for (int i = 0; i < arrayRellenado.length; i++) {
			System.out.print(arrayRellenado[i] + " ");
		}
	}

	// MULTIPLICAR ARRAYS
	public static int[] multiplicarArrays(int array1[], int array2[]) {
		int resultado[] = new int[array1.length];
		for (int i = 0; i < array1.length; i++) {
			resultado[i] = array1[i] * array2[i];
		}
		return resultado;

	}

}
