import java.util.Scanner;

/**
 * 
 */

/**
 * @author aitor
 *
 */
public class Ejercicio1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("EJERCICIO 1 - CALCULAR EL AREA");
		System.out.println("ELIJE UNA FIGURA: CIRCULO , CUADRADO , TRIANGULO");
		String figura = sc.nextLine();
		double resultado = 0.0;
		
		switch(figura.toUpperCase()) {
		
		case "CIRCULO":
			System.out.println("Introduce el radio del circulo: ");
			double radio = sc.nextDouble();
			resultado = areaCirculo(radio);
			break;
			
		case "CUADRADO":
			System.out.println("Introduce el lado del cuadrado: ");
			double lado = sc.nextDouble();
			resultado = areaCuadrado(lado);
			break;
			
		case "TRIANGULO":
			System.out.println("Introduce la base del triangulo: ");
			double base = sc.nextDouble();
			System.out.println("Introduce la altura del triangulo: ");
			double altura = sc.nextDouble();
			resultado = areaTriangulo(base, altura);
			break;
			
		default: 
			System.out.println("No has introducido una figura correcta");
			break;
		}
		
		sc.close();
		if(resultado!=0.0) {
			System.out.println("El area del "+figura+" es de "+resultado);
		} else {
			System.out.println("VUELVE A INTENTARLO");
		}
	}
	
	//AREA CIRCULO
	public static double areaCirculo(double radio) {
		final double PI = 3.141592653;
		double resultado = PI*(Math.pow(radio, 2));
		return resultado;
	}
	
	//AREA CUADRADO
	public static double areaCuadrado(double lado) {
		double resultado = lado * lado;
		return resultado;
		
	}
	
	//AREA TRIANGULO
	public static double areaTriangulo(double base, double altura) {
		double resultado = ((base * altura)/2);
		return resultado;
	}
}
