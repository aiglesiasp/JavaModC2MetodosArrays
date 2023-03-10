import java.util.Scanner;

/**
 * 
 */

/**
 * @author aitor
 *
 */
public class Ejercicio7 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("EJERCICIO 7 - CAMBIO DIVISAS");
		System.out.println("Introduce la cantidad de euros por teclado: ");
		double euros = sc.nextDouble();
		sc.nextLine();
		System.out.println("A que moneda quieres cambiar? Libras, Dolares, Yenes");
		String tipoMoneda = sc.nextLine();
		sc.close();
		convertirDivisas(euros, tipoMoneda);
	}
	
	//CONVERTIR DIVISAS
	public static void convertirDivisas(double euros, String tipoMoneda) {
		double resultado = 0.0;
		final double LIBRAS = 0.86;
		final double DOLARES = 1.28611;
		final double YENES = 129.852;
		
		switch(tipoMoneda.toUpperCase()) {
		case "LIBRAS":
			resultado = LIBRAS * euros;
			break;
		case "DOLARES":
			resultado = DOLARES * euros;
			break;
		case "YENES":
			resultado = YENES * euros;
			break;
		}
		
		System.out.println("Tras cambiar los "+euros+ " euros a "+tipoMoneda+" nos da como resultado: "+resultado+" "+tipoMoneda);
	}

}
