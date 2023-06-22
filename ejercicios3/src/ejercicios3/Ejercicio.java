package ejercicios3;

import java.util.Scanner;

public class Ejercicio {

	public int primerValor;
	public int segundoValor;
	public int tercerValor;
	
	public int resultado;
	
	public void obtenerValores () {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Ingrese un número entero");
		primerValor = input.nextInt();
		System.out.println("Ingrese otro número entero");
		segundoValor = input.nextInt();
		System.out.println("Ingrese el último número entero");
		tercerValor = input.nextInt();
	}	
	
	public void calculo(int valor1, int valor2, int valor3) {
		resultado = Math.multiplyExact(Math.multiplyExact(valor1, valor2), valor3);
	}
	
	public static void main(String[] args) {
		Ejercicio ejercicio1 = new Ejercicio();
		ejercicio1.obtenerValores();
		ejercicio1.calculo(ejercicio1.primerValor, ejercicio1.segundoValor, ejercicio1.tercerValor);
		
		System.out.println("El producto de la multiplicación es: " + ejercicio1.resultado);
	}

}