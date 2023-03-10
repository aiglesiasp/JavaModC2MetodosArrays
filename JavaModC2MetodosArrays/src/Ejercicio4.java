import java.util.Scanner;

/**
 * 
 */

/**
 * @author aitor
 *
 */
public class Ejercicio4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("EJERCICIO 4 - FACTORIAL");
		System.out.println("Introduce un numero por teclado: ");
		double numero = sc.nextDouble();
		sc.close();
		double resultado = calcularFactorial(numero);
		System.out.println("El Factorial de "+numero+ " da como resultado: "+resultado);

	}
	
	//CALCULAR FACTORIAL
	public static double calcularFactorial(double numero) {
		for(double i = numero-1; i>=1; i--) {
			numero = numero * i;
		}
		return numero;
	}

}
