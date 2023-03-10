import java.util.Scanner;

/**
 * 
 */

/**
 * @author aitor
 *
 */
public class Ejercicio9 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("EJERCICIO 9 - RELLENAR ARRAY X POSICIONES con NUM ALEATORIOS");
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el tamaño de la array: ");
		int tamaño = sc.nextInt();
		sc.nextLine();
		System.out.println("Introduce el valor minimo: ");
		double valorMin = sc.nextDouble();
		System.out.println("Introduce el valor maximo: ");
		double valorMax = sc.nextDouble();
		sc.close();
		int resultado[] = rellenarArray(tamaño, valorMin, valorMax);
		imprimirArray(resultado);

	}

	// RELLENAR ARRAY
	public static int[] rellenarArray(int tamaño, double valorMin, double valorMax) {
		int resultado[] = new int[tamaño];
		for (int i = 0; i < resultado.length; i++) {
			resultado[i] = (int)Math.floor(Math.random()*valorMax+valorMin);
		}
		return resultado;
	}

	// IMPRIMIR ARRAY
	public static void imprimirArray(int arrayRellenado[]) {
		int sumatorio = 0;
		for (int i = 0; i < arrayRellenado.length; i++) {
			System.out.println("En la posicion " + i + " tenemos el valor " + arrayRellenado[i]);
			sumatorio = sumatorio + arrayRellenado[i];
		}
		System.out.println("La suma total de los valores es: "+sumatorio);
	}

}
