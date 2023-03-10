import java.util.Scanner;

/**
 * 
 */

/**
 * @author aitor
 *
 */
public class Ejercicio8 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		System.out.println("EJERCICIO 8 - RELLENAR ARRAY 10 POSICIONES");
		double arrayRellenado[] = rellenarArray();
		imprimirArray(arrayRellenado);
	}
	
	//RELLENAR ARRAY
	public static double[] rellenarArray() {
		Scanner sc = new Scanner(System.in);
		double resultado[] = new double[10];
		for(int i=0; i<resultado.length; i++) {
			System.out.println("Introduce un numero en la posicion "+i+" :");
			resultado[i] = sc.nextDouble();
		}
		sc.close();
		return resultado;
	}
	
	//IMPRIMIR ARRAY
	public static void imprimirArray(double arrayRellenado[]) {
		for(int i = 0; i<arrayRellenado.length; i++) {
			System.out.println("En la posicion "+i+" tenemos el valor "+arrayRellenado[i]);
		}
	}

}
