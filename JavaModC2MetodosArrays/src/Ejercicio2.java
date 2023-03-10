import java.util.Scanner;

/**
 * 
 */

/**
 * @author aitor
 *
 */
public class Ejercicio2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("EJERCICIO 2 - ENTEROS ALEATORIOS");
		System.out.println("Elije la cantidad de numeros enteros aleatorios: ");
		int entero = sc.nextInt();
		System.out.println("Elije el valor minimo: ");
		double valorMin = sc.nextDouble();
		System.out.println("Elije el valor maximo: ");
		double valorMax = sc.nextDouble();
		sc.close();

		int resultado[] = generarAleatorios(entero, valorMin, valorMax);
		for (int i = 0; i < resultado.length; i++) {
			System.out.println(resultado[i]);
		}
	}

	// GENERAR NUMEROS ALEATORIOS
	public static int[] generarAleatorios(int entero, double valorMin, double valorMax) {
		int resultado[] = new int[entero];
		for (int i = 0; i < resultado.length; i++) {
			resultado[i] = (int) Math.floor(Math.random() * valorMax + valorMin);
		}
		return resultado;
	}
}
