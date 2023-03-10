import java.util.Scanner;

/**
 * 
 */

/**
 * @author aitor
 *
 */
public class Ejercicio6 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("EJERCICIO 6 - CONTAR CANTIDAD DE NUMEROS");
		System.out.println("Introduce un numero por teclado: ");
		int numero = sc.nextInt();
		sc.close();
		int resultado = devolverCifras(numero);
		System.out.println("El numero introducido tiene "+resultado+ " cifras");
		
		
	}
	
	//DEVOLVER CIFRAS
	public static int devolverCifras(int numero) {
		int resultado = 0;
		String num = String.valueOf(numero);
		resultado = num.length();
		return resultado;
	}

}
