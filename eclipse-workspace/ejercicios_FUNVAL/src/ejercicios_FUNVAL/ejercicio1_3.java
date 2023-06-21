package ejercicios_FUNVAL;

import java.util.Scanner;

public class ejercicio1_3 {
	public static void main(String []arg) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Bienvenido, ingrese la cantidad de metros que mide el radio del circulo:");
		double radioCirculo = input.nextDouble();
		
		double areaCirculo = (Math.pow(radioCirculo, 2))*(Math.PI);
		
		System.out.println("El área del circulo es: " + areaCirculo + " m^2");
		
		input.close();
	}
}
