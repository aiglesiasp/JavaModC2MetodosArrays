import java.util.Scanner;

/**
 * 
 */

/**
 * @author aitor
 *
 */
public class Ejercicio5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("EJERCICIO 5 - DE DECIMAL A BINARIO");
		System.out.println("Introduce un numero por teclado: ");
		int numero = sc.nextInt();
		sc.close();
		
		String resultado = convertirDecimalBinario(numero);
		System.out.println("El numero "+numero+ " en codigo binario es "+resultado);	
	}
	
	//CONVERTIR DECIMAL A BINARIO
	public static String convertirDecimalBinario(int numero) {
		int resto;
		String binario = "";
		String binarioInvertido = "";
		do {
			resto = numero%2;
			numero = numero/2;
			binario = binario + String.valueOf(resto);
		} while(numero>=2);
		binario = binario + String.valueOf(1);
		
		for(int indice = binario.length()-1; indice >=0; indice--) {
			binarioInvertido = binarioInvertido + binario.charAt(indice);
		}
		return binarioInvertido;	
	}
}
