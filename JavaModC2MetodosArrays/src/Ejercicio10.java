import java.util.Scanner;

/**
 * 
 */

/**
 * @author aitor
 *
 */
public class Ejercicio10 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("EJERCICIO 10 - RELLENAR ARRAY CON NUMEROS PRIMOS");
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el tamaño de la array: ");
		int tamaño = sc.nextInt();
		sc.nextLine();
		System.out.println("Introduce el valor minimo: ");
		double valorMin = sc.nextDouble();
		System.out.println("Introduce el valor maximo: ");
		double valorMax = sc.nextDouble();
		sc.close();
		int resultado[] = generarAleatorios(tamaño, valorMin, valorMax);
		imprimirArray(resultado);

	}

	// GENERAR NUMEROS ALEATORIOS
	public static int[] generarAleatorios(int entero, double valorMin, double valorMax) {
		int resultado[] = new int[entero];
		int valor = 0;
		boolean estado = false;
		for (int i = 0; i < resultado.length; i++) {
			do {
				valor = (int) Math.floor(Math.random() * valorMax + valorMin);
				estado = comprovarPrimo(valor);

			} while (estado != true);
			resultado[i] = valor;
		}
		return resultado;
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

	// IMPRIMIR ARRAY
	public static void imprimirArray(int arrayRellenado[]) {
		for (int i = 0; i < arrayRellenado.length; i++) {
			System.out.println("En la posicion " + i + " tenemos el valor " + arrayRellenado[i]);
		}
	}

}
